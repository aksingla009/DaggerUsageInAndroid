package com.component.dagger2demo.di

import com.component.dagger2demo.SmartPhone
import dagger.Component

/*
To use Dagger2 generated codes for dependency injection we also need an Interface annotated with @Component annotation
 */
@Component
interface SmartPhoneComponent {

    /*
    Now we can write an abstract method to get the dependency we want
    name of the method is not important
    But the return type of the method should be the type of dependency we want
     */

    fun getSmartPhone() : SmartPhone
}