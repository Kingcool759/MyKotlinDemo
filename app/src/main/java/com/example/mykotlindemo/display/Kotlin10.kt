package com.example.mykotlindemo.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin10Binding
import com.example.mykotlindemo.viewmodel.Kotlin10ViewModel

/**
 * ViewBinding使用
 */
@Route(path = RouterPath.kotlin10)
class Kotlin10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //绑定布局
        val vBinding = ActivityKotlin10Binding.inflate(layoutInflater)
        setContentView(vBinding.root)
        vBinding.tvTitle.text = "ViewBinding使用"
        //结合viewModel
        val viewModel = ViewModelProvider(this)[Kotlin10ViewModel::class.java]
        vBinding.viewModel = viewModel
        vBinding.lifecycleOwner = this
    }
}