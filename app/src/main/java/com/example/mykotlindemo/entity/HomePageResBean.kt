package com.example.mykotlindemo.entity

/**
 * @data on 4/25/21 4:47 PM
 * @auther KC
 * @describe wanAndroid首页列表响应返回体
 */
class HomePageResBean :BaseResponse() {
    var data: List<DataBean>? = null

    class DataBean {
        var courseId: String? = null
        var id: String? = null
        var name: String? = null
        var order: String? = null
        var parentChapterId: String? = null
        var userControlSetTop: String? = null
        var visible: String? = null
    }
}