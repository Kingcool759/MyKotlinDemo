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
    private val textList = arrayListOf("我的关注","通知开关", "我的徽章", "意见反馈", "我要投稿",
        "我的关注","通知开关", "我的徽章", "意见反馈", "我要投稿",
        "我的关注","通知开关","我的徽章","意见反馈","我要投稿")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin02)
        //使用Recycler
        val layoutManager = LinearLayoutManager(this)
        mRecycler.layoutManager = layoutManager
        val adapter = RecyclerAdapter(textList)
        mRecycler.adapter = adapter
    }
}
