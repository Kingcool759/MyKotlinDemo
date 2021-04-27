package com.example.mykotlindemo.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin13Binding
import com.example.mykotlindemo.viewmodel.Kotlin13ViewModel

@Route(path = RouterPath.kotlin13)
class Kotlin13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //绑定布局
        val vBinding = ActivityKotlin13Binding.inflate(layoutInflater)
        setContentView(vBinding.root)
        //结合viewModel
        val viewModel = ViewModelProvider(this)[Kotlin13ViewModel::class.java]
        vBinding.viewModel = viewModel
        vBinding.lifecycleOwner = this

        vBinding.introduceView.text = "本次调用wanAndroid网站的api接口，通过okhttp网络拦截器，配置didi的dokit插件进行拦截数据请求。"

    }
}