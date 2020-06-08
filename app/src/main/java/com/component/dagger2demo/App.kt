package com.component.dagger2demo

import android.app.Application
import com.component.dagger2demo.di.DaggerSmartPhoneComponent
import com.component.dagger2demo.di.SmartPhoneComponent
import com.component.dagger2demo.di.modules.MemoryCardModule

class App : Application() {

    lateinit var smartPhoneComponent: SmartPhoneComponent

    override fun onCreate() {
        smartPhoneComponent = initDagger()
        super.onCreate()
    }

    /*
    Create a function to initialise dagger related components
    The function should return SmartPhone Component
     */
    private fun initDagger(): SmartPhoneComponent =
        DaggerSmartPhoneComponent
            .builder()
            .memoryCardModule(MemoryCardModule(1024))
            .build()

}