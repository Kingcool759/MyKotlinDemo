package com.example.mykotlindemo.app

import androidx.multidex.MultiDexApplication
import com.alibaba.android.arouter.BuildConfig
import com.alibaba.android.arouter.launcher.ARouter
import com.didichuxing.doraemonkit.DoraemonKit
import com.ooftf.director.app.Director

class MyApplication : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            // 打印日志
            ARouter.openDebug()
            // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
            ARouter.openLog()
        }
        ARouter.init(this)
        //dokit
//        DoraemonKit.install(this);
        Director.init("f562df65d7e2ae3455476b06f9e9dc20",false)
    }
}