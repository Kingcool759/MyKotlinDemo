package com.example.mykotlindemo.display1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.ArrayMap
import android.util.SparseArray
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.entity.Person

@Route(path = RouterPath.kotlin26)
class Kotlin26 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin26)

        /**
         * SparseArray
         */
        //创建集合
        val sparseArray = SparseArray<Person>()
        //增加元素,两种方式:append、put
        sparseArray.append(1,Person("Jake1","21"))
        sparseArray.append(2,Person("Jake2","22"))
        sparseArray.put(3,Person("Jake3","23"))
        sparseArray.put(4,Person("Jake4","24"))
        println(sparseArray)
        //删除元素，两种方式:remove、delete
        sparseArray.remove(4)
        sparseArray.delete(3)
        println(sparseArray)
        //修改元素，两种方式:append、put
        sparseArray.append(1, Person("lile1","18"))
        sparseArray.append(2,Person("lile2","19"))
        //遍历元素，两种方式：根据key、根据value
//        sparseArray.keyAt(i)
//        sparseArray.valueAt(i)
        /**
         * ArrayMap
         */
        val arrayMap = ArrayMap<Int,String>()
        arrayMap.put(1,"lihua")
        arrayMap.put(2,"liming")
        println(arrayMap)
        arrayMap.remove(2)
        //遍历元素：keySet同HashMap
//        arrayMap.keyAt(i)
    }
}