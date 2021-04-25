package com.example.mykotlindemo.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mykotlindemo.entity.HomePageResBean
import com.example.mykotlindemo.network.ApiCallback
import com.example.mykotlindemo.network.AppApiService
import com.example.mykotlindemo.network.NetworkPortal
import retrofit2.Call
import retrofit2.Response

/**
 * @data on 4/25/21 4:50 PM
 * @auther KC
 * @describe
 */
class Kotlin13ViewModel : ViewModel() {

    init {
        getPublicList()
    }

    var mOfficialAccountsList = MutableLiveData<List<HomePageResBean.DataBean>>()


    //获取wanandroid中的首页公众号列表信息
    fun getPublicList() {
        NetworkPortal.getService(AppApiService::class.java)?.getOfficialAccounts()
            ?.enqueue(object : ApiCallback<HomePageResBean?>() {
                override fun onSuccessful(
                    call: Call<HomePageResBean?>,
                    response: Response<HomePageResBean?>
                ) {
                    mOfficialAccountsList.setValue(response.body()?.data)
                }

                override fun onFail(message: String?) {
                    Log.d("onFail", "----------> ")
                }

            })
    }
}