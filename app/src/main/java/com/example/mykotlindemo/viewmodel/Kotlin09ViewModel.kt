package com.example.mykotlindemo.viewmodel

import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableList
import androidx.lifecycle.ViewModel
import com.example.mykotlindemo.entity.Person
import me.tatarka.bindingcollectionadapter2.collections.MergeObservableList

/**
 * @data on 4/19/21 2:05 PM
 * @auther KC
 * @describe  可合并的item
 */
class Kotlin09ViewModel:ViewModel() {

    val items = ObservableArrayList<Person>()
    val itemsAll = MergeObservableList<Person>()

    init {
        initData()
        itemsAll.insertList(items)
    }

    fun initData(){   //固定项数据
        itemsAll.insertItem(Person("吴磊","18"))
        itemsAll.insertItem(Person("迪丽热巴","23"))
        itemsAll.insertItem(Person("赵露思","22"))
    }

    fun loadData(){   // 模拟网络请求数据
        items.clear()
        items.add(Person("菜菜","20"))
        items.add(Person("青青","20"))
    }

    fun loadDataChange(){  //模拟网络请求数据发生了改变
        items.clear()
        items.add(Person("Lida","20"))
        items.add(Person("Lier","20"))
    }
}