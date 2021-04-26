package com.example.mykotlindemo.main

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.mykotlindemo.R
import com.example.mykotlindemo.adapter.MainListViewAdapter
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.entity.Fruit
import com.ooftf.director.app.Director
import kotlinx.android.synthetic.main.activity_main.*


@Route(path = "/main/mainActivity")
class MainActivity : AppCompatActivity(){
    private val fruitList = listOf<Fruit>(
        Fruit("01：Kotlin中使用ARouter", R.mipmap.jetpack),
        Fruit("02：Kotlin中使用Recyler", R.mipmap.jetpack),
        Fruit("03：Kotlin中使用变量、语法、函数", R.mipmap.jetpack),
        Fruit("04：Kotlin中使用构造函数", R.mipmap.jetpack),
        Fruit("05：Kotlin中接口interface使用", R.mipmap.jetpack),
        Fruit("06：RecyclerView拖拽冲排序", R.mipmap.jetpack),
        Fruit("07：Glide三级缓存实战", R.mipmap.jetpack),
        Fruit("08：BitmapUtil实战", R.mipmap.jetpack),
        Fruit("09：MerrgObservalList使用", R.mipmap.jetpack),
        Fruit("10：ViewBinding使用", R.mipmap.jetpack),
        Fruit("11：ViewPager2使用", R.mipmap.jetpack),
        Fruit("12：Room使用", R.mipmap.jetpack),
        Fruit("13：didi-Dokit接入使用", R.mipmap.jetpack),
        Fruit("14：连点触发事件使用", R.mipmap.jetpack)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = MainListViewAdapter(this, R.layout.main_listview_item, fruitList)
        main_listView.adapter = adapter
        onClickItem()  //ListView的点击事件处理
    }

    private fun onClickItem(){
        main_listView.setOnItemClickListener { parent, view, position, id ->
            val fruit = fruitList[position]
            when(position){
                0 -> {
                    ARouter.getInstance().build(RouterPath.kotlin01).navigation()
                }
                1 -> {
                    ARouter.getInstance().build(RouterPath.kotlin02).navigation()
                }
                2 -> {
                    ARouter.getInstance().build(RouterPath.kotlin03).navigation()
                }
                3 -> {
                    ARouter.getInstance().build(RouterPath.kotlin04).navigation()
                }
                4 -> {
                    ARouter.getInstance().build(RouterPath.kotlin05).navigation()
                }
                5 -> {
                    ARouter.getInstance().build(RouterPath.kotlin06).navigation()
                }
                6 -> {
                    ARouter.getInstance().build(RouterPath.kotlin07).navigation()
                }
                7 -> {
                    ARouter.getInstance().build(RouterPath.kotlin08).navigation()
                }
                8 -> {
                    ARouter.getInstance().build(RouterPath.kotlin09).navigation()
                }
                9 -> {
                    ARouter.getInstance().build(RouterPath.kotlin10).navigation()
                }
                10 -> {
                    ARouter.getInstance().build(RouterPath.kotlin11).navigation()
                }
                11 -> {
                    ARouter.getInstance().build(RouterPath.kotlin12).navigation()
                }
                12 -> {
                    ARouter.getInstance().build(RouterPath.kotlin13).navigation()
                }
                13 -> {
                    ARouter.getInstance().build(RouterPath.kotlin14).navigation()
                }
                else->{
                    Toast.makeText(this, fruit.name, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}