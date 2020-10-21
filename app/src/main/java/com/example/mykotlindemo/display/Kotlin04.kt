package com.example.mykotlindemo.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.entity.Person
import com.example.mykotlindemo.entity.Student
import java.nio.file.Path

//类和对象
@Route(path = RouterPath.kotlin04)
class Kotlin04 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin04)
        main()
    }
    private fun main(){
//        val p = Person()
//        val student = Student("123",5)
        val student1 = Student()
//        val student2 = Student("千夜零一",23)
//        val student3 = Student("123",5,"千夜零一",23)
    }
}


