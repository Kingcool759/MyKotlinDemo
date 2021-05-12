package com.example.mykotlindemo.viewmodel

import android.app.Application
import com.example.mykotlindemo.R
import com.example.mykotlindemo.base.BasePageViewModel
import com.example.mykotlindemo.callback.LiveDataCallback
import com.example.mykotlindemo.entity.DataX
import com.example.mykotlindemo.entity.HomeArticlesResp
import com.example.mykotlindemo.network.AppApiService
import com.example.mykotlindemo.network.NetworkPortal
import com.example.mykotlindemo.utils.logd

/**
 * @data on 5/10/21 9:50 AM
 * @auther 页面加载数据
 * @describe
 */
class Kotlin22ViewModel(application: Application) :BasePageViewModel<DataX>(application) {

    init {
        refresh()
    }

    override fun requestData(page: Int) {
        NetworkPortal.getService(AppApiService::class.java)?.getHomeArticles2(page)?.enqueue(
            LiveDataCallback<HomeArticlesResp>(baseLiveData)
                .bindSmartRefresh()
                .bindStateLayout()
                .doOnResponseSuccess { _, response ->
                logd("home article list data size is ----->", response.data.datas.size.toString())
                handleItemData(page, response.data.datas)
            })
    }

    override fun getItemLayoutId(): Int {
        return R.layout.item_home_list2
    }
}