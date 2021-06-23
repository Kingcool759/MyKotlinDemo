package com.example.mykotlindemo.display1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.ArrayMap
import android.util.SparseArray
import android.widget.TextView
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.entity.Person

@Route(path = RouterPath.kotlin26)
class Kotlin26 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin26)

        val textView = findViewById<TextView>(R.id.tv)
        textView.text = "/**\n" +
                "         * SparseArray\n" +
                "         */\n" +
                "        //创建集合\n" +
                "        val sparseArray = SparseArray<Person>()\n" +
                "        //增加元素,两种方式:append、put\n" +
                "        sparseArray.append(1,Person(\"Jake1\",\"21\"))\n" +
                "        sparseArray.append(2,Person(\"Jake2\",\"22\"))\n" +
                "        sparseArray.put(3,Person(\"Jake3\",\"23\"))\n" +
                "        sparseArray.put(4,Person(\"Jake4\",\"24\"))\n" +
                "        println(sparseArray)\n" +
                "        //删除元素，两种方式:remove、delete\n" +
                "        sparseArray.remove(4)\n" +
                "        sparseArray.delete(3)\n" +
                "        println(sparseArray)\n" +
                "        //修改元素，两种方式:append、put\n" +
                "        sparseArray.append(1, Person(\"lile1\",\"18\"))\n" +
                "        sparseArray.append(2,Person(\"lile2\",\"19\"))\n" +
                "        //遍历元素，两种方式：根据key、根据value\n" +
                "//        sparseArray.keyAt(i)\n" +
                "//        sparseArray.valueAt(i)\n" +
                "        /**\n" +
                "         * ArrayMap\n" +
                "         */\n" +
                "        val arrayMap = ArrayMap<Int,String>()\n" +
                "        arrayMap.put(1,\"lihua\")\n" +
                "        arrayMap.put(2,\"liming\")\n" +
                "        println(arrayMap)\n" +
                "        arrayMap.remove(2)\n" +
                "        //遍历元素：keySet同HashMap\n" +
                "//        arrayMap.keyAt(i)"
    }

    private fun useFunction(){
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