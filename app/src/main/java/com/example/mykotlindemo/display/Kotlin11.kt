package com.example.mykotlindemo.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.adapter.ViewPagerAdapter
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin11Binding

/**
 * viewPager2竖屏切换
 */
@Route(path = RouterPath.kotlin11)
class Kotlin11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vBinding = ActivityKotlin11Binding.inflate(layoutInflater)
        setContentView(vBinding.root)
        vBinding.viewPager2.adapter = ViewPagerAdapter()
        vBinding.viewPager2.orientation = ViewPager2.ORIENTATION_VERTICAL
    }
}