package com.component.dagger2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val battery = Battery()
        val memoryCard = MemoryCard()

        val serviceProvider = ServiceProvider()
        val simCard = SimCard(serviceProvider)

        val phone = SmartPhone(battery, simCard, memoryCard)
        phone.makeCallWithRecording()
    }
}