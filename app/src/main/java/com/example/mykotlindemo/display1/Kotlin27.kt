package com.example.mykotlindemo.display1

import android.graphics.Rect
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewParent
import android.view.ViewStub
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath

@Route(path = RouterPath.kotlin27)
class Kotlin27 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin27)
        //布局优化
        /**
         * ViewSub默认为gone
         * 这里用代码显示
         */
        val viewStub = findViewById<ViewStub>(R.id.viewStub)
        viewStub.inflate()

        /**
         * 查看View层级
         */
        //include
        val tv1 = findViewById<TextView>(R.id.includeViewChild)
        tv1.post {
            Log.e("Kotlin27",("zjw-include: View-layerCount = ")+getViewLayer(tv1))
//            Log.e("Kotlin27",("zjw-window：height = ")+ window.attributes.height)
        }

        //viewStub
        val tv2 = findViewById<TextView>(R.id.viewStubViewChild)
        Log.e("Kotlin27",("zjw-viewStub: View-layerCount = ")+getViewLayer(tv2))

        //merge
        val tv3 = findViewById<TextView>(R.id.mergeViewChild)
        Log.e("Kotlin27",("zjw-merge: View-layerCount = ")+getViewLayer(tv3))

    }

    private fun getViewLayer(view: View):Int{
        if (view.parent==null||view.parent !is View){
            return 0
        }else {
//            var r = Rect()
//            view.getGlobalVisibleRect(r)
            Log.e("Kotlin27",view.parent.javaClass.name)
//            Log.e("Kotlin27",view.parent.javaClass.name+r)
            return getViewLayer(view.parent as View) + 1
        }
    }
}