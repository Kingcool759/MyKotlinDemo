package com.example.mykotlindemo.display1

import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import java.io.File

@Route(path = RouterPath.kotlin29)
class Kotlin29 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin29)

        /**
         * 【语法糖】
         */
        /**
         * run
         */
        //第一种用法：相当于 r = "xxx"赋值操作
        var r1 = kotlin.run { "xxxxx" }
        //第二种用法：类似于 扩展函数
        var r2 = "a".run {
            this.plus("b")
        }

        /**
         * let
         */
        //定义：fun <T, R> T.let(block: (T) -> R): R
        //功能：调用对象（T）的let函数，则该对象为函数的参数。在函数内可以通过 it 指代该对象。返回值为函数的最后一行或指定return表达式。
        //类似于run，但let在使用中可用于空安全验证，变量?.let{}
        val l = "a".let {
            it.plus("b")
        }
        l?.let {
            //当 l 不为null时代码执行此处
        }


        /**
         * with：跟run 类似
         */
        val w = with("a"){
            this.plus("b")
        }
        //定义：fun <T, R> with(receiver: T, block: T.() -> R): R
        //功能：将对象作为函数的参数，在函数内可以通过 this指代该对象。返回值为函数的最后一行或return表达式。
        var paint1 = Paint()
        paint1.color = Color.BLACK
        paint1.strokeWidth = 1.0f
        paint1.textSize = 18.0f
        paint1.isAntiAlias = true
        //使用with后：
        var paint2 = Paint()
        with(paint2) {
            color = Color.BLACK
            strokeWidth = 1.0f
            textSize = 18.0f
            isAntiAlias = true
        }



        /**
         * apply
         */
        //定义：fun T.apply(block: T.() -> Unit): T
        //功能：调用对象的apply函数，在函数范围内，可以任意调用该对象的任意方法，并返回该对象。
        //跟run类似，但不是返回block（）而是返回自身类型，一般用于对象重新赋值情景
        var paint = Paint()
        paint.textSize = 14.0f
        paint.color = Color.WHITE
        paint.isAntiAlias = false
        //使用apply后：
        var painta = Paint().apply {
            textSize = 14.0f
            color = Color.WHITE
            isAntiAlias = false
        }



        /**
         * also : 跟let 类似
         */
        val a = "a".also {
            it.plus("b")
        }
        //定义：fun  T.also(block: (T) -> Unit): T
        //功能：调用对象的also函数，在函数块内可以通过 it 指代该对象,返回值为该对象本身。（注意其和let函数的区别，let返回的是最后一行，also返回的是对象本身）
        //实例：需要返回对象本身（this）的情况下，例如建造者模式。

        /**
         * takeIf
         */

        //定义：fun T.takeIf(predicate: (T) -> Boolean): T?
        //功能：传递一个函数参数，如果函数结果为true，返回T对象，否则返回null。
        //用法：
        /**
         * 一般用法
        var file = File("filePath")
        if (file.exists()) {
            //do something
        } else {
            return false
        }
        */
        //使用takeIf
//        var file = File("filePath").takeIf { it.exists() }?:return false
        //do something

        /**
         * takeUnless
         */
        //定义：fun T.takeUnless(predicate: (T) -> Boolean): T?
        //功能：与takeIf相反，参数函数返回false时返回T对象，否则返回null，这里不再举例。

        /**
         * 调用： kotlin - 函数可以当变量传参
         */
        funAsArg { 2 }
        funAsArg { funArg() }

        /**
         * repeat
         */
        //定义：fun repeat(times: Int, action: (Int) -> Unit)
        //功能：重复执行action函数times次，times从0开始
        repeat(5){ println("count:$it") }
        //等价于：for (i in 0..4) { println("count:$i") }   /(0..4).forEach{println("count:$it")}
    }

    /**
     * kotlin - 函数可以当变量传参
     */
    fun funAsArg(args:()->Int){}  //args 代表函数，函数无参，返回值类型为Int。

    fun funArg():Int{
        return 1
    }
}

/**
 * Kotlin 的函数式编程
 * 形如：
 */
class ReceiveObject{
    fun exec(invoke:ReceiveObject.() -> Int){}
}