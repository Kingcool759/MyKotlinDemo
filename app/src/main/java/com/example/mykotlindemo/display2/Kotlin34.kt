package com.example.mykotlindemo.display2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewbinding.ViewBinding
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityKotlin34Binding
import com.example.mykotlindemo.room.DBManager
import com.example.mykotlindemo.room.User
import com.example.mykotlindemo.utils.toast

@Route(path = RouterPath.kotlin34)
class Kotlin34 : AppCompatActivity() {
    lateinit var vBinidng: ActivityKotlin34Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vBinidng = ActivityKotlin34Binding.inflate(layoutInflater)
        setContentView(vBinidng.root)
        vBinidng.add.setOnClickListener {
            val i = DBManager.getInstance().insert(User().apply {
                id = 1
                name = "uuuu"
                address = "add"
            })
            toast("新增:$i")
        }
        vBinidng.delete.setOnClickListener {
            val d = DBManager.getInstance().deleteById(1)
            toast("删除:$d")
        }
        vBinidng.update.setOnClickListener {
            val u = DBManager.getInstance().update(User().apply {
                id = 1
                name = "ccc"
                address = "ress"
            })
            toast("更新:$u")
        }
        vBinidng.query.setOnClickListener {
            val q = DBManager.getInstance().queryAll()
            toast("查询:$q")
        }
    }
}