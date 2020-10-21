package com.example.mykotlindemo.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.adapter.RecyclerAdapter
import com.example.mykotlindemo.arout.RouterPath
import kotlinx.android.synthetic.main.activity_kotlin02.*

@Route(path = RouterPath.kotlin02)
class Kotlin02 : AppCompatActivity() {
    private val textList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin02)
        //使用Recycler
        initTextList()
        val layoutManager = LinearLayoutManager(this)
        mRecycler.layoutManager = layoutManager
        val adapter = RecyclerAdapter(textList)
        mRecycler.adapter = adapter
    }
    private fun initTextList(){
        textList.add("我的关注")
        textList.add("观察记录")
        textList.add("通知开关")
        textList.add("我的徽章")
        textList.add("意见反馈")
        textList.add("我要投稿")
        textList.add("我的关注")
        textList.add("观察记录")
        textList.add("通知开关")
        textList.add("我的徽章")
        textList.add("意见反馈")
        textList.add("我要投稿")
    }
}
