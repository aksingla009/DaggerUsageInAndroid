package com.component.dagger2demo

class MyUtils {
    enum class TagType {
        COMMON, CLASS
    }

    companion object {
        const val COMMON_TAG: String = "COMMON"

        //String TAG will be defined in their own classes
        fun getTagType(): TagType {
            return TagType.CLASS
        }

    }

}