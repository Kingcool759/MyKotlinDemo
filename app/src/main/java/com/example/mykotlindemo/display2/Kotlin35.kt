package com.example.mykotlindemo.display2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.service.WorkService

@Route(path = RouterPath.kotlin35)
class Kotlin35 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin35)
        //所有的耗时任务都将在onHandleIntent中处理
        val intent = Intent(this, WorkService("workservice")::class.java)
        intent.putExtra("taskId", 1)
        startService(intent)
    }
}