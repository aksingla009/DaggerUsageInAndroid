package com.component.dagger2demo

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SmartPhone @Inject constructor(
    private val battery: Battery,
    private val simCard: SimCard,
    private val memoryCard: MemoryCard
) {

    private var TAG = MyUtils.COMMON_TAG

    init {
        TAG = if (MyUtils.getTagType() == MyUtils.TagType.COMMON) {
            MyUtils.COMMON_TAG
        } else {
            javaClass.simpleName
        }

        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailability()
        Log.i(TAG, "Phone is Constructed")
    }

    fun makeCallWithRecording() {
        Log.i(TAG, "Calling ... ")
    }
}