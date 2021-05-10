package com.example.mykotlindemo.display1

import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.base.BaseMvvmActivity
import com.example.mykotlindemo.databinding.ActivityKotlin22Binding
import com.example.mykotlindemo.viewmodel.Kotlin22ViewModel

@Route(path = RouterPath.kotlin22)
class Kotlin22 : BaseMvvmActivity<ActivityKotlin22Binding,Kotlin22ViewModel>() {

    override fun isImmersionEnable(): Boolean = true

    override fun setStatusBarColorInt(): Int = resources.getColor(R.color.green)

    override fun isFitsSystemWindows(): Boolean = true
}