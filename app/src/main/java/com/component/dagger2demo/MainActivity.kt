package com.component.dagger2demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var phone: SmartPhone
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

        /* DaggerSmartPhoneComponent
             .builder()
             .memoryCardModule(MemoryCardModule(1024))
             .build()
             .inject(this)*/

        (application as App).smartPhoneComponent.inject(this)
        phone.makeCallWithRecording()


    }
}