package com.example.mykotlindemo.entity

/**
 * @data on 2020/10/20 11:18 PM
 * @auther
 * @describe
 */
class Student(sno: String,grade: Int, name: String, age: Int) : Person(name, age) {
    init {
        println("同学"+name+",目前上"+grade+"年级"+",学号是"+sno+",现在"+age+"岁了。")
    }
    constructor(name: String, age: Int) : this("", 0, name, age) {
        println("同学"+name+",今年"+age+"岁了。")
    }

    constructor() : this("", 0){
    }
}