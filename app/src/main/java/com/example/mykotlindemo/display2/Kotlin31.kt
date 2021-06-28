package com.example.mykotlindemo.display2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath

@Route(path = RouterPath.kotlin31)
class Kotlin31 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin31)

        /**
         * 扩展函数 ：com.example.mykotlindemo.ExampleInstrumentedTest 在这里做了
         */
    }
}