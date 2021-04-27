package com.example.mykotlindemo.listener

import android.view.View

/**
 * @data on 4/27/21 11:42 AM
 * @auther KC
 * @describe 防止连续点击
 */
open class AntiOnClickListener(var src: View.OnClickListener): View.OnClickListener{
    var last = 0L
    override fun onClick(v: View?) {
        val current = System.currentTimeMillis()
        if (current - last > getAntiMills()){
            src.onClick(v)
            last = current
        }
    }
    open fun getAntiMills():Long = 1000
}