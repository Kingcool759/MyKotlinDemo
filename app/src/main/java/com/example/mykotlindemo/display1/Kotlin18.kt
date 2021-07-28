package com.example.mykotlindemo.display1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.adapter.PublicTabAdapter
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin18Binding
import com.example.mykotlindemo.fragment.Fragment1
import com.example.mykotlindemo.fragment.Fragment2
import com.example.mykotlindemo.fragment.Fragment3
import com.example.mykotlindemo.fragment.Fragment4

@Route(path = RouterPath.kotlin18)
class Kotlin18 : AppCompatActivity() {

    val vBinding by lazy {
        ActivityKotlin18Binding.inflate(layoutInflater)
    }
    val fragments = ArrayList<Fragment>()
    val titles = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(vBinding.root)
        setTabLayout()
    }

    //设置TabLayout和ViewPager
    fun setTabLayout(){
        setTitleData()
        titles.forEach {
            vBinding.tabLayout.addTab(vBinding.tabLayout.newTab().setText(it))
        }
        fragments.add(Fragment1())
        fragments.add(Fragment2())
        fragments.add(Fragment3())
        fragments.add(Fragment4())
        vBinding.viewPager.setIsCanScroll(false)
        vBinding.viewPager.adapter = PublicTabAdapter(supportFragmentManager,fragments,titles)
        vBinding.tabLayout.setupWithViewPager(vBinding.viewPager)
    }

    //设置tabTitles数据
    fun setTitleData(){
        titles.add("Tab1")
        titles.add("Tab2")
        titles.add("Tab3")
        titles.add("Tab4")
    }
}