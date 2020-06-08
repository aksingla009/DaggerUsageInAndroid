package com.component.dagger2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.component.dagger2demo.di.DaggerSmartPhoneComponent

class MainActivity : AppCompatActivity() {

    private lateinit var phone: SmartPhone
    //We want Dagger to Construct an instance of smartphone and send it to the mainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val battery = Battery()
        val memoryCard = MemoryCard()
        val serviceProvider = ServiceProvider()
        val simCard = SimCard(serviceProvider)
        val phone1 = SmartPhone(battery, simCard, memoryCard)*/

        /*val phone = SmartPhone(
            Battery(),
            SimCard(ServiceProvider()),
            MemoryCard()
        )
        phone.makeCallWithRecording()*/

        phone = DaggerSmartPhoneComponent.create().getSmartPhone()
        phone.makeCallWithRecording()


    }
}