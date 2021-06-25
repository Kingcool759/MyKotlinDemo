package com.example.mykotlindemo.display1

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ImageSpan
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath


@Route(path=RouterPath.kotlin30)
class Kotlin30 : AppCompatActivity() {
    @SuppressLint("UseCompatLoadingForDrawables")
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin30)

        /**
         * 第一种方法：
         */
        //android:drawableLeft="@drawable/user_img"
        //android:drawablePadding="5dp"

        /**
         * 第二种方式：通过Html
         */
        val tvAsImage = findViewById<TextView>(R.id.textView)
//        val htmlForImage = "图片"+"<img src="+R.drawable.user_img+">"+"展示"
//        tvAsImage.text = Html.fromHtml(htmlForImage, { source ->
//            val drawable = resources.getDrawable(source!!.toInt(),null)
//            drawable.setBounds(0, 0, 200, 200)
//            drawable
//        }, null)

        //设置图片和文字居中对齐
        tvAsImage.setCompoundDrawablesWithIntrinsicBounds(null,
            resources.getDrawable(R.drawable.user_img, null), null, null);


        /**
         * 第三种方式：通过ImageSpan和SpannableString
         */
//        val imgSpan = ImageSpan(this,R.drawable.user_img)
//        val spannableString = SpannableString("012345")
//        spannableString.setSpan(imgSpan,1,5,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
//        tvAsImage.text = spannableString

        /**
         * 第四种方式：通过继承TextView方式
         */
    }
}