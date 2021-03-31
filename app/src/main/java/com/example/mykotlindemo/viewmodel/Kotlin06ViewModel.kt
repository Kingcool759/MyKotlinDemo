package com.example.mykotlindemo.viewmodel

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.ViewModel
import com.example.mykotlindemo.BR
import com.example.mykotlindemo.R
import com.example.mykotlindemo.adapter.GoodsSortAdapter
import com.example.mykotlindemo.entity.Good
import me.tatarka.bindingcollectionadapter2.ItemBinding

/**
 * @data on 3/31/21 5:18 PM
 * @auther KC
 * @describe
 */
class Kotlin06ViewModel:ViewModel(){
    var adapter = GoodsSortAdapter()
    var items = ObservableArrayList<Good>()
    var itemBinding = ItemBinding.of<Good>(BR.item, R.layout.item_view_06)
            .bindExtra(BR.viewModel, this)
    init {
        initData()
    }

    fun initData(){
        items.add(Good("苹果"))
        items.add(Good("栗子"))
        items.add(Good("李"))
        items.add(Good("火龙果"))
        items.add(Good("芒果"))
        items.add(Good("香蕉"))
        items.add(Good("柿子"))
        items.add(Good("圣女果"))
        items.add(Good("荔枝"))
    }
}