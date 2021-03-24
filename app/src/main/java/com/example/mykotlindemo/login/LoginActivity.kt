package com.example.mykotlindemo.login

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.mykotlindemo.R
import com.example.mykotlindemo.app.MyApplication
import com.example.mykotlindemo.arout.RouterPath
import kotlinx.android.synthetic.main.activity_login.*

@Route(path="/main/loginActivity")
class LoginActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
//        MyApplication(this.application)     //初始化路由在其中
        btn_login.setOnClickListener(this)
    }
    override fun onClick(p0: View?) {
        ARouter.getInstance().build(RouterPath.main).navigation()
    }
}