package com.example.mykotlindemo.app

import android.app.Application
import com.alibaba.android.arouter.BuildConfig
import com.alibaba.android.arouter.launcher.ARouter

class MyApplication : Application {
    constructor(application: Application?) : super() {
        /**
         * 初始化路由框架
         */
        if (BuildConfig.DEBUG) {
            // 打印日志
            ARouter.openDebug()
            // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
            ARouter.openLog()
        }
        ARouter.init(application)
    }

    constructor() {}
}