package com.example.mykotlindemo.display1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin16Binding
import com.example.mykotlindemo.listener.AntiOnClickListener

@Route(path = RouterPath.kotlin16)
class Kotlin16 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vBinding = ActivityKotlin16Binding.inflate(layoutInflater)
        setContentView(vBinding.root)
        vBinding.btn.setOnClickListener(AntiOnClickListener{
            Toast.makeText(this,"吐司！",Toast.LENGTH_SHORT).show()
        })
    }
}