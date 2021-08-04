package com.example.mykotlindemo.display2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.squareup.picasso.Picasso

@Route(path = RouterPath.kotlin40)
class Kotlin40 : AppCompatActivity() {

    lateinit var iv:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin40)
        iv = findViewById(R.id.imageView)

        //用法，跟Glide如出一辙
        Picasso.with(this)
            .load("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fp7.itc.cn%2Fimages01%2F20210312%2Fad02eab591774ddcbaf1f5425746e31a.png&refer=http%3A%2F%2Fp7.itc.cn&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1630654376&t=1c7204c3964e228e7c5a851d2290390d")
            .placeholder(R.drawable.placeholder)  //占位符
            .error(R.drawable.error)  //加载出错
            .into(iv)
    }
}