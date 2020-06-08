package com.component.dagger2demo.di.modules

import com.component.dagger2demo.Battery
import com.component.dagger2demo.NickelCadmiumBattery
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NCBatteryModule {

    /*
    Since we have already constructed an instance of NickelCadmiumBattery using Constructor injection we need not construct it again
    @Provides
    fun providesNCBattery(): Battery {
        return NickelCadmiumBattery()
    }
    */

/*
    @Provides
    fun providesNCBattery(nickelCadmiumBattery: NickelCadmiumBattery): Battery {
        return nickelCadmiumBattery
    }
    */

   /*
    Since we already have an instance of Battery now no need to even return it specifically
    just make the class abstract and create this as an abstract function*/


    @Binds
    abstract fun bindsNCBattery(nickelCadmiumBattery: NickelCadmiumBattery): Battery

}