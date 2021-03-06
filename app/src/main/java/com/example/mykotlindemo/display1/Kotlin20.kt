package com.example.mykotlindemo.display1

import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.base.BaseMvvmActivity
import com.example.mykotlindemo.databinding.ActivityKotlin20Binding
import com.example.mykotlindemo.loading.LoadingDialog
import com.example.mykotlindemo.viewmodel.Kotlin20ViewModel

@Route(path = RouterPath.kotlin20)
class Kotlin20 : BaseMvvmActivity<ActivityKotlin20Binding,Kotlin20ViewModel>() {

    override fun isImmersionEnable(): Boolean = true

    override fun setStatusBarColorInt(): Int = resources.getColor(R.color.green)

    override fun isFitsSystemWindows(): Boolean = true

}