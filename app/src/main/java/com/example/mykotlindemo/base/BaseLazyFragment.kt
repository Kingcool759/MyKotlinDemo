package com.example.mykotlindemo.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mykotlindemo.lazy.DQLazyFragmentProxy

/**
 * @author : zhangqi
 * @time : 2020/4/25
 * desc : 懒加载Fragment 主要就是ViewPager中 会提前加载左右的Fragment的，
 * 可控制加载Fragment的时候，不发出网络请求，当Fragment可与用户发生用户交互的时候再去请求数据
 */
abstract class BaseLazyFragment : BaseFragmentZ(), DQLazyFragmentProxy.DQLazyProxyOwner {

    private val lazyFragmentProxy = DQLazyFragmentProxy<BaseLazyFragment>(this)

    /**
     * 开始创建View，并返回View
     */
    open override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return lazyFragmentProxy.onCreateView(inflater, container, savedInstanceState)
    }

    /**
     *  当View创建成功后
     */
    final override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lazyFragmentProxy.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        lazyFragmentProxy.onStart()
    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        lazyFragmentProxy.setUserVisibleHint(isVisibleToUser)
    }

    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        lazyFragmentProxy.onHiddenChanged(hidden)
    }

    override fun onDetach() {
        super.onDetach()
        lazyFragmentProxy.onDetach()
    }

    /**
     * 是否开启懒加载 默认为true
     */
    override fun lazyEnabled(): Boolean = true

    /**
     * 当前的fragment是否是可见状态
     */
    override fun isShowing(): Boolean = fragmentIsShowing()
}