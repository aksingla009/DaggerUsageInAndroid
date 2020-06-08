package com.component.dagger2demo.di.modules

import com.component.dagger2demo.MemoryCard
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule {

    /*
    Marking a function with @Provides tells dagger that this function provides an object of the return data type
    In this case it provides an object of MemoryCard type
     */
    @Provides
    fun providesMemoryCard() : MemoryCard{
        return MemoryCard()
    }
}