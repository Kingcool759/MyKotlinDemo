package com.example.mykotlindemo.display1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath

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
        val l = "a".let {
            it.plus("b")
        }

        /**
         * with：跟run 类似
         */
        val w = with("a"){
            this.plus("b")
        }

        /**
         * apply
         */
        //跟run类似，但不是返回block（）而是返回自身类型

        /**
         * also : 跟let 类似
         */
        val a = "a".also {
            it.plus("b")
        }

        /**
         * takeIf
         */

        /**
         * takeUnless
         */

        /**
         * 调用： kotlin - 函数可以当变量传参
         */
        funAsArg { 2 }
        funAsArg { funArg() }
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