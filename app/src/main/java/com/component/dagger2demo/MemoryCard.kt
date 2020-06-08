package com.component.dagger2demo

import android.util.Log
import javax.inject.Inject

//Lets Assume we do not OWN Memory Card class so we can not modify MemoryCard Class
//So we will Create a Memory Card Module which will provide required dependency by looking at return type of provider method
//class MemoryCard @Inject constructor(){
class MemoryCard {
    private var TAG = MyUtils.COMMON_TAG

    init {
        TAG = if (MyUtils.getTagType() == MyUtils.TagType.COMMON) {
            MyUtils.COMMON_TAG
        } else {
            javaClass.simpleName
        }
        Log.i(TAG, "MemoryCard Constructed")
    }

    fun getSpaceAvailability() {
        Log.i(TAG, "Memory Space is Available")
    }
}