package com.yyx.iot

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

/**
 *Date: 2022/2/14
 *Author: 锅得铁
 *#
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        context = this
        MultiDex.install(context)
    }

    companion object {
        //提供单一全局context
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }
}