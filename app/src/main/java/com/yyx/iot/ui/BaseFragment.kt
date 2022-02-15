package com.yyx.iot.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment

/**
 *Date: 2022/2/14
 *Author: 锅得铁
 *#
 */
abstract class BaseFragment : Fragment() {
    lateinit var rootView: View
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(layoutId(), container, false)
        return rootView
    }

    protected abstract fun layoutId(): Int

    /**
     *   拦截回退栈
     */
    fun registerBackPressed(block: () -> Unit) = activity?.onBackPressedDispatcher?.addCallback(
        this,
        object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                block()
            }
        })

}