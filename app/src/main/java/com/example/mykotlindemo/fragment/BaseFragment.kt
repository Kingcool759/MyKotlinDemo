package com.example.mykotlindemo.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

/**
 * @data on 4/28/21 9:58 AM
 * @auther KC
 * @describe BaseFragment，实现了Fragment懒加载
 */
open class BaseFragment : Fragment() {

    //表明fragment是否显示
    private var mIsVisibleToUser = false

    //表明view是否被加载
    private var mIsViewCreatetd = false

    //表明data是否被加载
    private var mIsDataLoaded = false

    /**
     * 是否view已被加载
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mIsViewCreatetd = true
    }

    /**
     * 懒加载的关键
     * isVisibleToUser是否为true，则对应表明页面是否展示到当前Fragment。
     */
    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        mIsVisibleToUser = isVisibleToUser
        lazyLoad()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (mIsVisibleToUser && !mIsDataLoaded) {
            lazyLoad()
        }
    }

    /**
     * view和data清除
     */
    override fun onDestroyView() {
        super.onDestroyView()
        mIsViewCreatetd = false
        mIsDataLoaded = false
    }

    fun lazyLoad() {
        if (mIsViewCreatetd && mIsVisibleToUser && !mIsDataLoaded) {
            initData()
            mIsDataLoaded = true
        }
    }

    //开放要加载的数据
    open fun initData() {}
}