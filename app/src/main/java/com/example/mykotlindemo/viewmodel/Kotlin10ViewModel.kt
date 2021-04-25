package com.example.mykotlindemo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mykotlindemo.entity.Fruit

/**
 * @data on 4/25/21 10:28 AM
 * @auther KC
 * @describe viewBinding数据绑定的ViewModel类
 */
class Kotlin10ViewModel:ViewModel(){
    var fruitLiveData = MutableLiveData<Fruit>()

    init {
        val fruit = Fruit("橘子",1)
        fruitLiveData.postValue(fruit)
    }
}