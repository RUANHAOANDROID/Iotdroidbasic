package com.yyx.iot.data.netwok.http

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

/**
 *Date: 2022/2/14
 *Author: 锅得铁
 *# 创建对应服务，retrofit通过动态代理生成API请求代码
 * create(ideaapi)
 */
object ServiceCreator {

    private const val BASE_URL = "http://iot.test/"

    private val httpClient = OkHttpClient.Builder()

    private val builder = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(httpClient.build())
        .addConverterFactory(ScalarsConverterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())


    private val retrofit = builder.build()

    fun <T> create(serviceClass: Class<T>): T = retrofit.create(serviceClass)

}