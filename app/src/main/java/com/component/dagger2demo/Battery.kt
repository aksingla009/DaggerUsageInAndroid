package com.component.dagger2demo

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor() {
    private var TAG = MyUtils.COMMON_TAG

    init {
        TAG = if (MyUtils.getTagType() == MyUtils.TagType.COMMON) {
            MyUtils.COMMON_TAG
        } else {
            javaClass.simpleName
        }
        Log.i(TAG, "Battery Constructed")
    }

    fun getPower() {
        Log.i(TAG, "Battery Power is Available")
    }

}
