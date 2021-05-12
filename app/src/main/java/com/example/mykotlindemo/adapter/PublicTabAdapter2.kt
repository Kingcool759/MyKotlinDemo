package com.example.mykotlindemo.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * @data on 5/10/21 5:42 PM
 * @auther KC
 * @describe viewPager2的adapter
 */
class PublicTabAdapter2(fragment: FragmentActivity, private val list_fragment: ArrayList<Fragment>) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return list_fragment.size
    }

    override fun createFragment(position: Int): Fragment {
        return list_fragment[position]
    }
}