package com.example.mykotlindemo.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.example.mykotlindemo.BR
import com.example.mykotlindemo.ext.getVClass
import com.example.mykotlindemo.ext.getVmClass
import com.example.mykotlindemo.livedata.BaseLiveDataObserver
import com.orhanobut.logger.Logger

/**
 * @data on 2021/8/3 11:40 上午
 * @auther
 * @describe
 */
abstract class BaseMvvMFragment<V : ViewDataBinding, VM : BaseViewModel> : BaseLazyFragment() {

    lateinit var dataBinding: V
    lateinit var viewModel: VM

    lateinit var mBaseLiveDataObserver: BaseLiveDataObserver


    /**
     * 通过DataBinding获取到布局文件
     */
    override fun getContentView(inflater: LayoutInflater, parent: ViewGroup?): View? {
        createDataBinding()
        return dataBinding.root
    }

    /**
     * 布局加载完成之后了
     */
    override fun onLoad(view: View) {
        Logger.d("onLoad -----> transform")
        viewModel = createViewModel().apply {
            activity?.let {
                setActivity(it)
            }
            setFragment(this@BaseMvvMFragment)

            dataBinding.lifecycleOwner = this@BaseMvvMFragment
            dataBinding.setVariable(getVariableId(), this)
            mBaseLiveDataObserver = this.baseLiveData.attach(this@BaseMvvMFragment)
            onLoad(view, this)
        }
    }

    /**
     * 创建DataBinding
     */
    private fun createDataBinding() {
        var vClass = getVClass<V>(this)
        var method = vClass.getMethod("inflate", LayoutInflater::class.java)
        dataBinding = method.invoke(null, layoutInflater) as V
    }

    /**
     * 创建ViewModel
     */
    private fun createViewModel(): VM {
        return ViewModelProvider(this, getViewModelFactory()).get(getVmClass(this))
    }

    /**
     * 可通过重写该方法，来提供ViewModel传参数
     */
    open fun getViewModelFactory(): ViewModelProvider.Factory {
        return defaultViewModelProviderFactory
    }

    /**
     * BR.viewModel变量是由 文件 base_br_layout文件生成的
     */
    private fun getVariableId() = BR.viewModel

    /**
     * 可重写该方法在Fragment中拿到对应的ViewModel
     */
    open fun onLoad(view: View, viewModel: VM) {

    }
}