package com.example.mykotlindemo.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mykotlindemo.utils.toast

/**
 * @data on 4/28/21 10:34 AM
 * @auther KC
 * @describe fragment懒加载请求数据
 */
class Kotlin18ViewModel :ViewModel() {
    init {
        toast("加载数据中...")
    }
}