package com.example.mykotlindemo.viewmodel

import android.app.Application
import android.util.Log
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableList
import androidx.lifecycle.MutableLiveData
import com.example.mykotlindemo.BR
import com.example.mykotlindemo.R
import com.example.mykotlindemo.base.BaseViewModel
import com.example.mykotlindemo.callback.LiveDataCallback
import com.example.mykotlindemo.entity.DataX
import com.example.mykotlindemo.entity.HomeArticlesResp
import com.example.mykotlindemo.entity.WxAccountsResp
import com.example.mykotlindemo.livedata.FinishData
import com.example.mykotlindemo.network.ApiCallback
import com.example.mykotlindemo.network.AppApiService
import com.example.mykotlindemo.network.NetworkPortal
import com.example.mykotlindemo.utils.toast
import me.tatarka.bindingcollectionadapter2.ItemBinding
import retrofit2.Call
import retrofit2.Response

/**
 * @data on 5/6/21 6:17 PM
 * @auther KC
 * @describe
 */
class Kotlin20ViewModel(application: Application) :BaseViewModel(application) {

    init {
        getHomeArticle()
    }

    var items = ObservableArrayList<DataX>()
    var itemBinding = ItemBinding.of<DataX>(BR.item, R.layout.item_home_list).bindExtra(BR.viewModel,this)

    //获取wanandroid中的首页公众号列表信息
    fun getHomeArticle() {
        NetworkPortal.getService(AppApiService::class.java)?.getHomeArticles()?.enqueue(LiveDataCallback<HomeArticlesResp>(baseLiveData)
                .bindLoading()
                .bindSmartRefresh()
                .doOnResponseSuccess { call, response ->
                    items.clear()
                    items.addAll(response.data.datas)
                })
    }
}