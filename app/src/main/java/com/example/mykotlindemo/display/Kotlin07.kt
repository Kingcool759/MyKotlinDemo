package com.example.mykotlindemo.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.bumptech.glide.Glide
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.glide.NetCacheUtils
import kotlinx.android.synthetic.main.activity_kotlin07.*

//Glide三级缓存实战
@Route(path = RouterPath.kotlin07)
class Kotlin07 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin07)

        Glide.with(this)
            .load("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3405350801,859040723&fm=26&gp=0.jpg")
            .into(iVImageViewg)
    }
}