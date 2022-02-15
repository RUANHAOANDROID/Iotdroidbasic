package com.yyx.iot.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yyx.iot.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            //TODO 根据设备ID加载不同UI
            if (true) {
                faceDevice()
            } else {
                doorDevices()
            }

        }
    }

    /**
     * 横屏门禁设备
     */
    private fun doorDevices() {
        //TODO 加载门禁设备主界面
    }

    /**
     * 竖屏 人脸核验设备
     */
    private fun faceDevice() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, MainFragment.newInstance())
            .commitNow()
    }
}