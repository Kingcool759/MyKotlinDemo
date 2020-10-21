package com.example.mykotlindemo.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import kotlinx.android.synthetic.main.activity_kotlin01.*

@Route(path = RouterPath.kotlin01)
class Kotlin01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin01)
        btn_Arout.setOnClickListener((View.OnClickListener {
            ARouter.getInstance().build(RouterPath.other).navigation()
        }))
    }
}