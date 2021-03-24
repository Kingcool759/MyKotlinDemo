package com.example.mykotlindemo.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.entity.Student

@Route(path = RouterPath.kotlin05)
//接口调用
class Kotlin05 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin05)
        main()
    }
    private fun main(){
        val stu = Student("千夜零一","23")
//        doStudy(stu)
    }
//    private fun doStudy(study: Study){
//        study.readBooks()
//        study.doHomework()
//    }
}
