package com.example.mykotlindemo.other

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mykotlindemo.R

class Intent1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent1)

        val b = findViewById<Button>(R.id.btn)
        b.setOnClickListener {
            val intent = Intent()
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            intent.setClass(this,Intent2Activity::class.java)
            startActivity(intent)
        }
    }
}