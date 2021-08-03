package com.example.mykotlindemo.viewmodel

import android.app.Application
import androidx.databinding.ObservableArrayList
import com.example.mykotlindemo.base.BaseViewModel

/**
 * @data on 2021/8/3 11:14 上午
 * @auther
 * @describe
 */
class Kotlin37ViewModel(application: Application) : BaseViewModel(application) {
    val tabPair = ArrayList<Pair<String, String>>().apply {
            add(Pair("1", "Tab1"))
            add(Pair("2", "Tab2"))
            add(Pair("3", "Tab3"))
            add(Pair("4", "Tab4"))
        }

    val tabs = ObservableArrayList<String>().apply {
        addAll(tabPair.map { it.second })
    }
    var tab = tabPair.first().first

    fun setCurrent(position: String) {
        tab = position
    }
}