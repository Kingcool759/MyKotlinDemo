package com.example.mykotlindemo.view

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager

/**
 * @data on 2021/7/28 9:44 上午
 * @auther
 * @describe  可以定义viewPager是否可以左右滑动，默认可以
 */
class ScrollViewPager : ViewPager {
    var isCanScroll = true

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    fun setIsCanScroll(can:Boolean){
        isCanScroll = can
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        return isCanScroll && super.onInterceptTouchEvent(ev)
    }

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        return isCanScroll && super.onTouchEvent(ev)
    }
}