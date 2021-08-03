package com.example.mykotlindemo.display2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.transaction
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.base.BaseMvvmActivity
import com.example.mykotlindemo.databinding.ActivityKotlin37Binding
import com.example.mykotlindemo.fragment.*
import com.example.mykotlindemo.viewmodel.Kotlin37ViewModel
import com.google.android.material.tabs.TabLayout

@Route(path = RouterPath.kotlin37)
class Kotlin37 : BaseMvvmActivity<ActivityKotlin37Binding, Kotlin37ViewModel>() {

    override fun isImmersionEnable(): Boolean {
        return false
    }
    val titles = ArrayList<String>()

    val sfm = FragmentSwitchManager<Int>(supportFragmentManager,R.id.frameLayout_tab){
        ARouter.getInstance().build("/common/fragment").withString("tab",
            viewModel.tabPair[it].first).navigation() as Fragment
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            @SuppressLint("ResourceType")
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewModel.setCurrent(viewModel.tabPair[tab!!.position].first);
                sfm.switchFragment(tab?.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
        //放在设置监听之后，就能保证第一个fragment默认
        viewModel.tabs.forEach {
            dataBinding.tabLayout.addTab(dataBinding.tabLayout.newTab().setText(it))
        }
    }

    fun setTabLayoutAndFragment() {   //弃用该方法
//        viewModel.tabs.forEach {
//            dataBinding.tabLayout.addTab(dataBinding.tabLayout.newTab().setText(it))
//        }
        dataBinding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            @SuppressLint("ResourceType")
            override fun onTabSelected(tab: TabLayout.Tab?) {
//                val fragmentManager = supportFragmentManager
//                val transaction = fragmentManager.beginTransaction()
//                when (tab?.position) {
//                    //把Fragment加到指定的FrameLayout布局中
//                    0 -> transaction.add(R.id.frameLayout_tab, Fragment1())
//                    1 -> transaction.add(R.id.frameLayout_tab, Fragment2())
//                    2 -> transaction.add(R.id.frameLayout_tab, Fragment3())
//                    3 -> transaction.add(R.id.frameLayout_tab, Fragment4())
//                }
//                transaction.commit()  //这种方式UI会重叠，导致Fragment一直添加，不能进行正常回收。

                //用下面这种方式就可以解决fragment不能回收的问题
                viewModel.setCurrent(viewModel.tabPair[tab!!.position].first);
                sfm.switchFragment(tab.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }
}
