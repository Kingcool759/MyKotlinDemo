package com.example.mykotlindemo.display2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.entity.Stu
import com.tencent.mmkv.MMKV

@Route(path = RouterPath.kotlin33)
class Kotlin33 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin33)

        val mmkvTV = findViewById<TextView>(R.id.mmkvTV)
        mmkvTV.setOnClickListener {
            //获得默认存储对象
            val mmkv = MMKV.defaultMMKV()
            //以k-v形式存值
            mmkv.encode("a",false)
            mmkv.encode("b","sss")
            mmkv.encode("c",0.99)
            val stu = Stu().apply {
                this.id = "001"
                this.name = "Jacke"
            }
            mmkv.encode("d",stu)
            //通过encode存，decode取
            val test1 = mmkv.decodeBool("a")
            val test2 = mmkv.decodeString("b")
            val test3 = mmkv.decodeDouble("c")
            val test4 = mmkv.decodeParcelable("d",Stu::class.java)
            //打印取出结果集
            println("mmkv=>>$test1")
            println("mmkv=>>$test2")
            println("mmkv=>>$test3")
            println("mmkv=>>${test4.id+test4.name}")
//            I/System.out: mmkv=>>false
//            I/System.out: mmkv=>>sss
//            I/System.out: mmkv=>>0.99
//            I/System.out: mmkv=>>001Jacke
        }
    }
}