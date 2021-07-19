package com.example.mykotlindemo.service

import android.app.IntentService
import android.content.Intent
import android.util.Log

/**
 * @data on 2021/7/19 1:58 下午
 * @auther
 * @describe
 */
class WorkService(name: String?) : IntentService(name) {
    override fun onHandleIntent(intent: Intent?) {
        Log.e("sss","WorkService => onHandleIntent")
    }
}
