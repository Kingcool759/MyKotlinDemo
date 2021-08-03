package com.example.mykotlindemo.fragment

import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

/**
 * @data on 2021/8/3 10:59 上午
 * @auther
 * @describe
 */
class FragmentSwitchManager<T>(
    private val manager: FragmentManager,
    private val containerViewId: Int,
    private val createFragment: (T) -> Fragment
) {
    private val fragmentTemp = HashMap<T, Fragment>()
    private val handler by lazy {
        Handler(Looper.getMainLooper())
    }


    fun switchFragment(tagId: T) {
        var isCreateFragment = false
        val fragmentTransaction = manager.beginTransaction()
        var fragment = findAddFragment(tagId)
        if (null == fragment) {
            isCreateFragment = true
            fragment = createFragment(tagId)
            fragmentTemp[tagId] = fragment
            fragmentTransaction.add(containerViewId, fragment, tagId.toString())
        }
        hideOther(fragmentTransaction, fragment)
        fragmentTransaction.show(fragment).commitAllowingStateLoss()
        if (isCreateFragment) {
            handler.post {
                fragmentTemp.remove(tagId)
            }
        }
    }

    private fun hideOther(fragmentTransaction: FragmentTransaction, exclude: Fragment) {
        manager.fragments.forEach {
            if (getFragmentContainerId(it) == containerViewId && it != exclude) {
                fragmentTransaction.hide(it)
            }
        }
        fragmentTemp.values.forEach {
            if (getFragmentContainerId(it) == containerViewId && it != exclude) {
                fragmentTransaction.hide(it)
            }
        }
    }

    val mContainerIdField = Fragment::class.java.getDeclaredField("mContainerId").apply {
        isAccessible = true
    }

    private fun getFragmentContainerId(fragment: Fragment): Int {
        return mContainerIdField.getInt(fragment)
    }

    private fun findAddFragment(tagId: T): Fragment? {
        var fragment = manager.findFragmentByTag(tagId.toString())
        if (null == fragment) {
            fragment = fragmentTemp[tagId]
        }
        return fragment
    }
}