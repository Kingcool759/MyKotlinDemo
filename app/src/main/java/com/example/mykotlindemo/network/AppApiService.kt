package com.example.mykotlindemo.network

import com.example.mykotlindemo.entity.HomePageResBean
import retrofit2.Call
import retrofit2.http.GET


/**
 * @data on 2020/9/27 2:35 PM
 * @auther
 * @describe
 */
interface AppApiService {
    /**
     * 获取wanandroid首页公众号列表
     */
    @GET(AppApi.OFFITIAL_ACCOUNTS)
    fun getOfficialAccounts(): Call<HomePageResBean?>?
}