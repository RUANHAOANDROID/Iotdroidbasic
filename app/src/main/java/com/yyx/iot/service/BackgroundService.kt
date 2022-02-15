package com.yyx.iot.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
/**
 *Date: 2022/2/15
 *Author: 锅得铁
 *# 该服务运行在后台负责 MQ消息的发送，订阅，过滤，处理
 * 在前台页面播放欢迎界面或者其他操作时也能正常作出逻辑控制

 */
class BackgroundService : Service() {
    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

}