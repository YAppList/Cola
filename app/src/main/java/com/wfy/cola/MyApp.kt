package com.wfy.cola

import android.app.Application

/**
 * Created by yibh on 2017/12/12.
 */
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        mContext = this
    }

    companion object {
        private var mContext: Application? = null
        fun getContext() = mContext!!
    }

}