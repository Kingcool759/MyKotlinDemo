package com.example.mykotlindemo.display2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin01Binding
import com.example.mykotlindemo.databinding.ActivityKotlin39Binding
import com.example.mykotlindemo.utils.toast

@Route(path = RouterPath.kotlin39)
class Kotlin39 : AppCompatActivity() {

    val vBinding by lazy {
        ActivityKotlin39Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_kotlin39)
        setContentView(vBinding.root)
        onClickThing()
    }

    fun onClickThing(){
        vBinding.btnStart.setOnClickListener { toast("开始录音") }
        vBinding.btnStop.setOnClickListener { toast("暂停录音") }
        vBinding.btnOver.setOnClickListener { toast("录音完成") }
    }
}