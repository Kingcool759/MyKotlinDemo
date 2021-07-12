package com.example.mykotlindemo.main

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.mykotlindemo.R
import com.example.mykotlindemo.adapter.MainListViewAdapter
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityMainBinding
import com.example.mykotlindemo.entity.Fruit

@Route(path = "/main/mainActivity")
class MainActivity : AppCompatActivity() {

    val vBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

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
        Fruit("14：连点触发事件使用", R.mipmap.jetpack),
        Fruit("15：判断app中的Service是否开启和停止", R.mipmap.jetpack),
        Fruit("16：防止连续点击实现", R.mipmap.jetpack),
        Fruit("17：PictureSelector使用", R.mipmap.jetpack),
        Fruit("18：Fragment+ViewPager使用(懒加载)", R.mipmap.jetpack),
        Fruit("19：Activity通过ARouter向Fragment传值", R.mipmap.jetpack),
        Fruit("20：实现BaseActivity+BaseViewModel抽离", R.mipmap.jetpack),
        Fruit("21：图片转换Base64格式", R.mipmap.jetpack),
        Fruit("22：实现BasePageViewModel封装抽离", R.mipmap.jetpack),
        Fruit("23：Fragment+ViewPager2使用", R.mipmap.jetpack),
        Fruit("24：弹幕滚动效果", R.mipmap.jetpack),
        Fruit("25：动画实现Loading效果", R.mipmap.jetpack),
        Fruit("26：SparseArray、ArrayMap、HashMap", R.mipmap.jetpack),
        Fruit("27：性能优化-布局优化", R.mipmap.jetpack),
        Fruit("28：Android中Intent时的flags", R.mipmap.jetpack),
        Fruit("29：Kotlin语法糖", R.mipmap.jetpack),
        Fruit("30：TextView如何添加图片", R.mipmap.jetpack),
        Fruit("31：关于扩展函数", R.mipmap.jetpack),
        Fruit("32: Handler解决内存泄露",R.mipmap.jetpack),
        Fruit("33: MMKV存储",R.mipmap.jetpack),
        Fruit("34: Room数据库使用",R.mipmap.jetpack)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(vBinding.root)
        val adapter = MainListViewAdapter(this, R.layout.main_listview_item, fruitList)
        vBinding.mainListView.adapter = adapter
        onClickItem()  //ListView的点击事件处理
    }

    private fun onClickItem() {
        vBinding.mainListView.setOnItemClickListener { parent, view, position, id ->
            val fruit = fruitList[position]
            when (position) {
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
                14 -> {
                    ARouter.getInstance().build(RouterPath.kotlin15).navigation()
                }
                15 -> {
                    ARouter.getInstance().build(RouterPath.kotlin16).navigation()
                }
                16 -> {
                    ARouter.getInstance().build(RouterPath.kotlin17).navigation()
                }
                17 -> {
                    ARouter.getInstance().build(RouterPath.kotlin18).navigation()
                }
                18 -> {
                    ARouter.getInstance().build(RouterPath.kotlin19).navigation()
                }
                19 -> {
                    ARouter.getInstance().build(RouterPath.kotlin20).navigation()
                }
                20 -> {
                    ARouter.getInstance().build(RouterPath.kotlin21).navigation()
                }
                21 -> {
                    ARouter.getInstance().build(RouterPath.kotlin22).navigation()
                }
                22 -> {
                    ARouter.getInstance().build(RouterPath.kotlin23).navigation()
                }
                23 -> {
                    ARouter.getInstance().build(RouterPath.kotlin24).navigation()
                }
                24 -> {
                    ARouter.getInstance().build(RouterPath.kotlin25).navigation()
                }
                25 -> {
                    ARouter.getInstance().build(RouterPath.kotlin26).navigation()
                }
                26 -> {
                    ARouter.getInstance().build(RouterPath.kotlin27).navigation()
                }
                27 -> {
                    ARouter.getInstance().build(RouterPath.kotlin28).navigation()
                }
                28 -> {
                    ARouter.getInstance().build(RouterPath.kotlin29).navigation()
                }
                29 -> {
                    ARouter.getInstance().build(RouterPath.kotlin30).navigation()
                }
                30 -> {
                    ARouter.getInstance().build(RouterPath.kotlin31).navigation()
                }
                31 -> {
                    ARouter.getInstance().build(RouterPath.kotlin32).navigation()
                }
                32 -> {
                    ARouter.getInstance().build(RouterPath.kotlin33).navigation()
                }
                33 -> {
                    ARouter.getInstance().build(RouterPath.kotlin34).navigation()
                }
                else -> {
                    Toast.makeText(this, fruit.name, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}