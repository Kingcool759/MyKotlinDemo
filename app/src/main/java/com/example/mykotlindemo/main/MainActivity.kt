package com.example.mykotlindemo.main

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.mykotlindemo.R
import com.example.mykotlindemo.adapter.MainListViewAdapter
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.entity.Fruit
import kotlinx.android.synthetic.main.activity_main.*


@Route(path = "/main/mainActivity")
class MainActivity : AppCompatActivity(){

    private val fruitList = ArrayList<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView() // 初始化
        val adapter = MainListViewAdapter(this,R.layout.main_listview_item,fruitList)
        main_listView.adapter = adapter
        onClickItem()  //点击事件
    }
    private fun initView(){
        fruitList.add(Fruit("01：Kotlin中使用ARout进行页面跳转",R.mipmap.jetpack))
        repeat(20){
            fruitList.add(Fruit("00：Kotlin",R.mipmap.jetpack))
        }
    }
    private fun onClickItem(){
        main_listView.setOnItemClickListener { parent, view, position, id ->
            val fruit = fruitList[position]
            when(position){
                0->{
                    ARouter.getInstance().build(RouterPath.other).navigation()
                }
                1->{
                    Toast.makeText(this,fruit.name,Toast.LENGTH_SHORT).show()
                }
                else->{
                    Toast.makeText(this,fruit.name,Toast.LENGTH_SHORT).show()

                }
            }
        }
    }
}