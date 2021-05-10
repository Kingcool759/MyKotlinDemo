package com.example.mykotlindemo.network

/**
 * @data on 2020/9/27 2:34 PM
 * @auther armStrong
 * @describe
 */
object AppApi {

     /**
      *   基础URL
      *   BaseUrl的末尾必须是以/结尾。
      */
     const val BaseURL = "https://www.wanandroid.com/"

     /**
      *   获取wanAndroid网站公众号列表：
      */
     const val OFFITIAL_ACCOUNTS = "wxarticle/chapters/json"

     /**
      *   获取wanAndroid网站首页文章列表：
      */
     const val HOME_ARTICLES="article/list/0/json"

     /**
      *   获取wanAndroid网站首页文章列表2：
      */
     const val HOME_ARTICLES_PAGE="article/list/{page}/json"
}