package com.example.mykotlindemo.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin10Binding

/**
 * ViewBinding使用
 */
@Route(path = RouterPath.kotlin10)
class Kotlin10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //
        val vBinding = ActivityKotlin10Binding.inflate(layoutInflater)
        setContentView(vBinding.root)
        vBinding.tvTest.text = "ViewBinding使用"
    }
}