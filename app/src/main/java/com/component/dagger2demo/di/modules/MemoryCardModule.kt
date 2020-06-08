package com.component.dagger2demo.di.modules

import android.util.Log
import com.component.dagger2demo.MemoryCard
import dagger.Module
import dagger.Provides

/*
Although its discouraged for a module to have a state that is instance variable
But sometimes its a requirement for eg here suppose MemoryCard module needs an instance variable of Sixe which wil be passed at runtime

 */
@Module
class MemoryCardModule(val memorySize : Int) {

    /*
    Marking a function with @Provides tells dagger that this function provides an object of the return data type
    In this case it provides an object of MemoryCard type
     */
    @Provides
    fun providesMemoryCard() : MemoryCard{
        Log.i("COMMON","Size of the Memory Card is $memorySize")
        return MemoryCard()
    }
}