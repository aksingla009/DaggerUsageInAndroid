package com.component.dagger2demo

interface Battery{
    /*
    To show case the usage of Dependency injection if any class has a dependency on an interface
    Since the Interface can not be constructed
    Create a new class and implement this interface
    then Get instance of that battery implementation class using Module and Provides

     */

    fun getPower()

}
/*
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

}*/
