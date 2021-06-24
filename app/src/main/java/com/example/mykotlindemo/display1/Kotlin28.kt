package com.example.mykotlindemo.display1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.other.Intent1Activity

@Route(path = RouterPath.kotlin28)
class Kotlin28 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin28)

        val b = findViewById<Button>(R.id.btn)
        b.setOnClickListener {
            val intent = Intent()
//            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.setClass(this,Intent1Activity::class.java)
            startActivity(intent)
        }
    }
}