package com.example.mykotlindemo.login

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.databinding.ActivityLoginBinding
import com.ooftf.director.app.Director

@Route(path="/main/loginActivity")
class LoginActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(vBinding.root)
//        MyApplication(this.application)     //初始化路由在其中
        vBinding.btnLogin.setOnClickListener(this)
        val iconV:ImageView = findViewById(R.id.iconIv)
        Director.setDebugEntranceView(iconV)
    }
    override fun onClick(p0: View?) {
        ARouter.getInstance().build(RouterPath.main).navigation()
    }
}