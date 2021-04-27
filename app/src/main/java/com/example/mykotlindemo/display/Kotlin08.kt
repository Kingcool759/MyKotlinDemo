package com.example.mykotlindemo.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin08Binding
import com.example.mykotlindemo.utils.BitmapUtil
import com.example.mykotlindemo.utils.BitmapUtils

//BitmapUtil实战
@Route(path = RouterPath.kotlin08)
class Kotlin08 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vBinding = ActivityKotlin08Binding.inflate(layoutInflater)
        setContentView(vBinding.root)

        //调整图片的尺寸
        val bitmap1 = BitmapUtil.getBitmapFromResource(this,R.mipmap.user_img,200,200)
        vBinding.ivImageView2.setImageBitmap(bitmap1)

        //对bitmap对象再操作
        val bitmap2 = BitmapUtil.getThumbnailsBitmap(bitmap1,1200,900)
        vBinding.ivImageView3.setImageBitmap(bitmap2)

        //对图片做高斯模糊
        val bitmap3 = BitmapUtils.rsBlur(this,bitmap1,10)
        vBinding.gsImageView.setImageBitmap(bitmap3)
    }
}