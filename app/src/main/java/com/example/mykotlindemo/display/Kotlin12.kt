package com.example.mykotlindemo.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin12Binding

/**
 * Room
 */
@Route(path = RouterPath.kotlin12)
class Kotlin12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //viewBinding
        val vBinding = ActivityKotlin12Binding.inflate(layoutInflater)
        setContentView(vBinding.root)
        //
    }
}