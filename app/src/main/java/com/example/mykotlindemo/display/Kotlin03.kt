package com.example.mykotlindemo.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.entity.Fruit

private const val TAG = "Kotlin打印"
private const val c = 3
@Route(path="/main/kotlin03_activity") //ARouter库的注解，用来处理Activity之间的跳转
class Kotlin03 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin03)
        //变量
        variable()
        //函数
        Log.i(TAG,"${sum(2,3)}") //Kotlin打印: 5
        //循环
        repeatExample()
        //数组
        arrayExample()
        //字符串
        stringExample()
        //List
        listExample()
        //when条件语句，代替了Java中的if...else语句（但也能用，因为Kotlin完全继承了Java的财富）
        whenExample()
    }

    //变量
    private fun variable(){
        //1、不可变
        val a = 1
        Log.i(TAG,"a = $a") //Kotlin打印: a = 1
        //2、可变
        var b = 1
        b = 2 //重新对b赋值
        Log.i(TAG,"b = $b") //Kotlin打印: b = 2
        //3、常量
//        private const val c = 3 //class之外声明+定义
        Log.i(TAG,"c = $c") //Kotlin打印: c = 3
    }

    //函数，示例：求和
    private fun sum(a: Int, b: Int): Int = a + b

    //循环
    private fun repeatExample() {
        //循环区间输出
        for (i in 1..9)
        Log.i(TAG,"$i") //Kotlin打印: 1,2,3,4,5,6,7,8,9
        //设置步长
        for (i in 1..9 step 2) //顺序，步长为2
        Log.i(TAG,"$i") //Kotlin打印: 1,3,5,7,9
        //使用downTo倒序
        for (i in 4 downTo 1 step 2) //倒序，步长为2
        Log.i(TAG,"$i") //Kotlin打印: 4,2
        //使用until排除
        for (i in 1 until 4) //1-4 排除掉4
        Log.i(TAG,"$i") //Kotlin打印: 1,2,3
    }

    //数组
    private fun arrayExample() {
        //[1,2,3] 第一种创建方式：使用arrayOf()
        val a = arrayOf(1, 2, 3)
        Log.i(TAG,"${a[0]}") //Kotlin打印: 1
        //[0,2,4] 第二种创建方式：工厂模式
        val b = Array(3) { i -> (i * 2) }
        Log.i(TAG,"${b[1]}") //Kotlin打印: 2
    }

    //字符串
    private fun stringExample() {
        //简单输出字符串，$变量名
        val i = 10
        val s = "i = $i"
        Log.i(TAG,"$s") //Kotlin打印: i = 10
        //花括号任意表达式
        val t = "runoob"
        val str = "$t.length is ${t.length}"
        Log.i(TAG,"$str") //Kotlin打印: runoob.length is 6
    }

    //List列表
    private fun listExample(){
        //1、创建空列表
        val emptyList = emptyList<String>()
        Log.i(TAG,""+emptyList) //Kotlin打印: []
        //2、创建普通列表
        val list = listOf<String>("aaa","bbb","ccc")
        Log.i(TAG,""+list) //Kotlin打印: [aaa, bbb, ccc]
        //3、创建可修改的列表
        val mutList = mutableListOf<String>("111","222","333")
        mutList[1] = "修改"
        Log.i(TAG,""+mutList) //Kotlin打印: [111, 修改, 333]
        //4、创建含对象列表
        val arrayList: ArrayList<Fruit> ?= ArrayList()
        arrayList?.add(0,Fruit("苹果",1))
        arrayList?.add(1,Fruit("梨",2))
        Log.i(TAG,""+arrayList?.get(0)?.name) //Kotlin打印: 苹果
        //值得注意的是，在Kotlin中创建实体类变得无比简洁：
        //class Fruit(val name:String, val imageId:Int) //省略了get和set方法。可以直接通过"对象.属性"拿到值，这是Kotlin内部做好封装的
    }

    //when条件语句
    private fun whenExample(){
        //分支
        val x = 3
        when (x) {
            1 ->Log.i(TAG,"x = 1")
            2 ->Log.i(TAG,"x = 2 ")
//            1,2 -> Log.i(TAG,"x = 1 或者2 ") (多分支条件写法)
            else -> { // 注意这个块
                Log.i(TAG,"x 不是 1 ，也不是 2")
            }
        }
    }
}
