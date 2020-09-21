package com.example.mykotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.mykotlindemo.app.MyApplication
import com.example.mykotlindemo.arout.RouterPath
import kotlinx.android.synthetic.main.activity_main.*



@Route(path = "/main/mainActivity")
class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyApplication(this.application)
        btn_go.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        //点击事件
//       startActivity(Intent(this,OtherActivity::class.java))
        //路由跳转
        ARouter.getInstance().build(RouterPath.other).navigation()
    }
}