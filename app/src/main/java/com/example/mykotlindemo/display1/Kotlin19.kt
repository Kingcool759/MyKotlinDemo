package com.example.mykotlindemo.display1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.mykotlindemo.R
import com.example.mykotlindemo.adapter.PublicTabAdapter
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin18Binding
import com.example.mykotlindemo.databinding.ActivityKotlin19Binding
import com.example.mykotlindemo.fragment.Fragment1
import com.example.mykotlindemo.fragment.Fragment2
import com.example.mykotlindemo.fragment.Fragment3
import com.example.mykotlindemo.fragment.Fragment4

@Route(path = RouterPath.kotlin19)
class Kotlin19 : AppCompatActivity() {
    val vBinding by lazy {
        ActivityKotlin19Binding.inflate(layoutInflater)
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
        val baseStr = "Activity传递的数据："
        val fragmentOne = ARouter.getInstance().build("/kc/fragmentOne")
            .withString("oneStr","$baseStr 首页")
            .navigation() as Fragment
        val fragmentTwo = ARouter.getInstance().build("/kc/fragmentTwo")
            .withString("twoStr","$baseStr 看点")
            .navigation() as Fragment
        val fragmentThree = ARouter.getInstance().build("/kc/fragmentThree")
            .withString("threeStr","$baseStr 动态")
            .navigation() as Fragment
        fragments.add(fragmentOne)
        fragments.add(fragmentTwo)
        fragments.add(fragmentThree)
        vBinding.viewPager.adapter = PublicTabAdapter(supportFragmentManager,fragments,titles)
        vBinding.tabLayout.setupWithViewPager(vBinding.viewPager)
    }

    //设置tabTitles数据
    fun setTitleData(){
        titles.add("首页")
        titles.add("看点")
        titles.add("动态")
    }
}