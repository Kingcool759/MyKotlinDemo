package com.example.mykotlindemo.entity

/**
 * @data on 4/1/21 12:27 AM
 * @auther KC
 * @describe 探究Kotlin的init{}、构造方法、伴生对象执行顺序
 */
class Coffee(val tease:String,val price:Double) {
    //初始化代码块
    init {
        println("init1")
    }
    init {
        println("init2")
    }
    //次构造函数
    constructor(tease:String) : this("bad",15.8){
        println("constructor")
    }
    //伴生对象
    companion object {

        val flag = false

        fun plus(num1:Int,num2:Int):Int {
            return num1+num2
        }

        init {
            println("companion object init1")
        }
        init {
            println("companion object init2")
        }
    }
}
//主方法验证
fun main(args:Array<String>){
    val coffe = Coffee("e") //用于验证
    /**
     * 验证结果：先后排序
     * companion object init1
     * companion object init2
     * init1
     * init2
     * constructor
     * 总结：伴生对象 > 初始化代码块 > 构造函数 （先>后）
     */
//    val coffee = Coffee("good",9.9) //正常对象创建
//    println(Coffee.flag)  //用于验证伴生对象调用
//    println(Coffee.plus(1,1)) //用于验证伴生对象调用
}