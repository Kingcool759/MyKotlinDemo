package com.example.mykotlindemo.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin14Binding

@Route(path = RouterPath.kotlin14)
class Kotlin14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vBinding = ActivityKotlin14Binding.inflate(layoutInflater)
        setContentView(vBinding.root)
        vBinding.btn.setOnClickListener {
            setDebugEntranceView(vBinding.btn)
        }
    }
    fun setDebugEntranceView(v: View) {
        v.setOnClickListener(object : View.OnClickListener {
            var time = 0L
            var count = 0
            override fun onClick(v: View) {
                val currentTimeMillis = System.currentTimeMillis()
                if (currentTimeMillis - time < 500) {
                    count++
                } else {
                    count = 1
                }
                if (count > 10) {
                    count = 0
                    Toast.makeText(applicationContext, "连点提示！！！", Toast.LENGTH_SHORT).show()
                }
                time = currentTimeMillis
            }

        })
    }
}