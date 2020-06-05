package com.component.dagger2demo

import android.util.Log

class SimCard(private val serviceProvider: ServiceProvider) {
    private var TAG = MyUtils.COMMON_TAG

    init {
        TAG = if (MyUtils.getTagType() == MyUtils.TagType.COMMON) {
            MyUtils.COMMON_TAG
        } else {
            javaClass.simpleName
        }
        Log.i(TAG, "SimCard Constructed")
    }

    fun getConnection() {
        serviceProvider.getService()
    }
}