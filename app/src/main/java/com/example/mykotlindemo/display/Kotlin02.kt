package com.example.mykotlindemo.display

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.adapter.RecyclerAdapter
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin02Binding

@Route(path = RouterPath.kotlin02)
class Kotlin02 : AppCompatActivity() {
    private val textList = arrayListOf("我的关注","通知开关", "我的徽章", "意见反馈", "我要投稿",
        "我的关注","通知开关", "我的徽章", "意见反馈", "我要投稿",
        "我的关注","通知开关","我的徽章","意见反馈","我要投稿")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vBinding = ActivityKotlin02Binding.inflate(layoutInflater)
        setContentView(vBinding.root)
        //使用Recycler
        val layoutManager = LinearLayoutManager(this)
        vBinding.mRecycler.layoutManager = layoutManager
        val adapter = RecyclerAdapter(textList)
        vBinding.mRecycler.adapter = adapter
    }
}
