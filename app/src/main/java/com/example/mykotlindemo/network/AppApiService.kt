package com.example.mykotlindemo.network

import com.example.mykotlindemo.entity.HomeArticlesResp
import com.example.mykotlindemo.entity.WxAccountsResp
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query


/**
 * @data on 2020/9/27 2:35 PM
 * @auther
 * @describe
 */
interface AppApiService {
    /**
     * 获取wanandroid公众号标题列表
     */
    @GET(AppApi.OFFITIAL_ACCOUNTS)
    fun getOfficialAccounts(): Call<WxAccountsResp?>?

    /**
     * 获取wanandroid首页文章列表
     */
    @GET(AppApi.HOME_ARTICLES)
    fun getHomeArticles():Call<HomeArticlesResp>

    /**
     * 获取wanandroid首页文章列表2（根据page加载数据）
     */

    @GET(AppApi.HOME_ARTICLES_PAGE)
    fun getHomeArticles2(@Path("page") pageNo: Int): Call<HomeArticlesResp>
}