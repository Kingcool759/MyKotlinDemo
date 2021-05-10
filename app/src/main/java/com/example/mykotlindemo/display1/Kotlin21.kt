package com.example.mykotlindemo.display1

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.utils.BitmapUtil
import com.example.mykotlindemo.utils.BitmapUtils
import com.example.mykotlindemo.utils.ImageUtils
import com.example.mykotlindemo.utils.logd

@Route(path = RouterPath.kotlin21)
class Kotlin21 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin21)

        val bitmap = BitmapUtil.getBitmapFromResource(this,R.mipmap.default_img,100,100)
        val path = BitmapUtil.bitmapToByte(bitmap)
        try {
            val base64 = ImageUtils.imageToBase64(path.toString())
            logd("test:>>",base64.toString())
        }catch (e:Exception){
            println(e)
        }
    }
}