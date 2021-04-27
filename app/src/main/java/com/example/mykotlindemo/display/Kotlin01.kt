package com.example.mykotlindemo.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin01Binding

@Route(path = RouterPath.kotlin01)
class Kotlin01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vBinding = ActivityKotlin01Binding.inflate(layoutInflater)
        setContentView(vBinding.root)
        vBinding.btnArout.setOnClickListener((View.OnClickListener {
            ARouter.getInstance().build(RouterPath.other).navigation()
        }))
    }
}