package com.example.mykotlindemo.display

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin15Binding
import com.example.mykotlindemo.service.ExampleService


@Route(path = RouterPath.kotlin15)
class Kotlin15 : AppCompatActivity() {

    val intentExample by lazy {  //延迟初始化
        Intent(this, ExampleService::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //绑定布局
        val vBinding = ActivityKotlin15Binding.inflate(layoutInflater)
        setContentView(vBinding.root)
        //点击事件
        vBinding.openService.setOnClickListener {
            startService(intentExample) //开启服务
        }
        vBinding.closeService.setOnClickListener {
            stopService(intentExample) //关闭服务
        }
        vBinding.isOpenService.setOnClickListener {
            Toast.makeText(
                this,
                isOpenedService(this, "ExampleService").toString(),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
    //判断是否app开启了某个Service
    private fun isOpenedService(mContext: Context, className: String): Boolean {
        var isRunning = false;
        val systemService : ActivityManager = mContext.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val serviceList: List<ActivityManager.RunningServiceInfo> = systemService
            .getRunningServices(30)
        if (serviceList.isEmpty()) {
            return false;
        }
        serviceList.forEach {
            if (it.service.className.contains(className)){
                isRunning = true
            }
        }
        return isRunning;
    }
}