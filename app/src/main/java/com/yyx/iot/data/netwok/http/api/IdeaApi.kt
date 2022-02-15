package com.yyx.iot.data.netwok.http.api

import retrofit2.Call
import retrofit2.http.GET

/**
 *Date: 2022/2/14
 *Author: 锅得铁
 *# 定义服务交互接口
 */
interface IdeaApi {
    //GET | POST  | DELETE .....
    @GET("iot/getInfo")
    fun getInfo(): Call<MutableList<Any>>
}