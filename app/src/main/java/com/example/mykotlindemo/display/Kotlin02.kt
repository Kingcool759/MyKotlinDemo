package com.example.mykotlindemo.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R

@Route(path = "/main/kotlin02_activity")
class Kotlin02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin2)
        //关于函数的修炼
//        Log.i( "onCreate: ", "${sum(2,4)}")  //打印在控制台需要添加${}花括号
//        println("${sum(2,3)}")
        //循环
//        funExample()
        //数组
//        arrayExample()
        //字符串
//        stringExample()
        //条件控制
//        ifExample(5,10)
        //when表达式
        whenExample()
    }

    //求和
    private fun sum(a: Int, b: Int): Int = a + b

    //多种循环
    private fun funExample() {
        //循环区间输出
        for (i in 1..9) println("$i")  //System.out: 1,2,3,4,5,6,7,8,9
        //设置步长
        for (i in 1..9 step 2) println("$i")  //System.out: 1,3,5,7,9
        //使用downTo倒序
        for (i in 4 downTo 1 step 2) println("$i") //System.out: 4,2
        //使用until排除
        for (i in 1 until 4) println("$i")  //System.out: 1,2,3
    }

    //数组
    private fun arrayExample() {
        //[1,2,3] 第一种创建方式：使用arrayOf()
        val a = arrayOf(1, 2, 3)
        println(a[0])   //System.out: 1
        //[0,2,4] 第二种创建方式：工厂模式
        val b = Array(3) { i -> (i * 2) }
        println(b[1])   //System.out: 2
    }

    //字符串
    private fun stringExample() {
        //简单输出字符串，$变量名
        val i = 10
        val s = "i = $i"  //System.out: i = 10
        println(s)
        //花括号任意表达式
        val t = "runoob"
        val str = "$t.length is ${t.length}"
        println(str)
    }

    //if
    private fun ifExample(a: Int, b: Int) {
        //基本
        val x = 0
        if(x>0){
            println("x 大于 0")
        }else if(x==0){
            println("x 等于 0")
        }else{
            println("x 小于 0")
        }
        //输出max值
        val c = if (a>=b) a else b
        println("c 的值为 $c")
    }

    //wen表达式
    private fun whenExample(){
        val x = 3
        //分支
        when (x) {
            1 -> println("x == 1")
            2 -> println("x == 2")
            else -> { // 注意这个块
                println("x 不是 1 ，也不是 2")
            }
        }
        //多分支调用同种方法
        when (x) {
            0, 1 -> print("x == 0 or x == 1")
            else -> print("otherwise")
        }
    }
}
