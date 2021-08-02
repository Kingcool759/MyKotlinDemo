package com.example.mykotlindemo.display2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy


@Route(path = RouterPath.kotlin38)
class Kotlin38 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin38)

        //模版代码
//        Proxy.newProxyInstance(
//            this.classLoader,
//            arrayOf(Runnable::class.java),
//            object : InvocationHandler {
//                override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any {
//                    return method.invoke(proxy, args)
//                }
//            }
//        )

        val p = Proxy.newProxyInstance(
            this.classLoader,
            arrayOf(View.OnClickListener::class.java),
            object : InvocationHandler {
                override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any {
                    println("begin")
                    val result = if(args == null){
                        method!!.invoke(proxy)
                    }else{
                        method!!.invoke(proxy,*args)
                    }
                    println("end")
                    return result
                }
            }
        )
        //设置点击事件
        val contentView = findViewById<View>(R.id.contentView)
        contentView.setOnClickListener(p as View.OnClickListener?)
    }
}