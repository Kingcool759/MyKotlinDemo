package com.example.mykotlindemo.display2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.transaction
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.fragment.Fragment1
import com.example.mykotlindemo.fragment.Fragment2
import com.example.mykotlindemo.fragment.Fragment3
import com.example.mykotlindemo.fragment.Fragment4
import com.google.android.material.tabs.TabLayout

@Route(path = RouterPath.kotlin37)
class Kotlin37 : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    val titles = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_kotlin37)
        tabLayout = findViewById(R.id.tabLayout)
    }

    fun setTabLayoutAndFragment() {

        setTitleData()
        titles.forEach {
            tabLayout.addTab(tabLayout.newTab().setText(it))
        }
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            @SuppressLint("ResourceType")
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                when (tab?.position) {
                    0 -> transaction.add(R.id.frameLayout_tab, Fragment1())
                    1 -> transaction.add(R.id.frameLayout_tab, Fragment2())
                    2 -> transaction.add(R.id.frameLayout_tab, Fragment3())
                    3 -> transaction.add(R.id.frameLayout_tab, Fragment4()) //把Fragment加到指定的FrameLayout布局中
                }
                transaction.commit()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }

    //设置tabTitles数据
    fun setTitleData() {
        titles.add("Tab1")
        titles.add("Tab2")
        titles.add("Tab3")
        titles.add("Tab4")
    }
}