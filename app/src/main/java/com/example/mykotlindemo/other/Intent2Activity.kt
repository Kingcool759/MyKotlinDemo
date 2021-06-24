package com.example.mykotlindemo.other

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mykotlindemo.R
import com.example.mykotlindemo.display1.Kotlin28

class Intent2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        val b = findViewById<Button>(R.id.btn)
        b.setOnClickListener {
            val intent = Intent()
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            intent.setClass(this,Kotlin28::class.java)
            startActivity(intent)
        }
    }
}