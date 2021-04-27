package com.example.mykotlindemo.display

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin04Binding

//类和对象
@Route(path = RouterPath.kotlin04)
class Kotlin04 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vBinding = ActivityKotlin04Binding.inflate(layoutInflater)
        setContentView(vBinding.root)
        main()
    }
    private fun main(){
//        val p = Person()
//        val student = Student("123",5)
//        val student1 = Student()
//        val student2 = Student("千夜零一",23)
//        val student3 = Student("123",5,"千夜零一",23)
//        if (vBin.text.toString().isEmpty()){
//            Toast.makeText(this,"请输入数据",Toast.LENGTH_SHORT).show()
//        }

        //merge:1

        //merge:2
    }
}


