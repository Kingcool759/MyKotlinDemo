package com.example.mykotlindemo.entity

/**
 * @data on 4/25/21 4:45 PM
 * @auther KC
 * @describe 网络请求返回基本类型
 */
open class BaseResponse {
    var error = 0
    var msg: String? = null
    val isSuccess: Boolean
        get() = error == 0
}