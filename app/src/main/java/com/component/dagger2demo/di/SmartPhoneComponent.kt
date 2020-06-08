package com.component.dagger2demo.di

import com.component.dagger2demo.SmartPhone
import com.component.dagger2demo.di.modules.MemoryCardModule
import dagger.Component

/*
To use Dagger2 generated codes for dependency injection we also need an Interface annotated with @Component annotation
 */
/*
If you are using any modules for classes which you do not own then make sure you let the component know about all such modules
From where Component will fetch the dependency form their respective providers
So link all the modules to this component
 */
@Component(modules = [MemoryCardModule::class])
interface SmartPhoneComponent {

    /*
    Now we can write an abstract method to get the dependency we want
    name of the method is not important
    But the return type of the method should be the type of dependency we want
     */

    fun getSmartPhone() : SmartPhone
}