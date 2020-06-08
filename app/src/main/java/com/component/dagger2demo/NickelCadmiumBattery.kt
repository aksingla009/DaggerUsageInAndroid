package com.component.dagger2demo

import android.util.Log
import javax.inject.Inject

class NickelCadmiumBattery @Inject constructor(): Battery {
    private var TAG = MyUtils.COMMON_TAG

    init {
        TAG = if (MyUtils.getTagType() == MyUtils.TagType.COMMON) {
            MyUtils.COMMON_TAG
        } else {
            javaClass.simpleName
        }
        Log.i(TAG, "Nickel Cadmium Battery Constructed")
    }

    override fun getPower() {
        Log.i(TAG, "Get Power From Nickel Cadmium Battery")
    }
}