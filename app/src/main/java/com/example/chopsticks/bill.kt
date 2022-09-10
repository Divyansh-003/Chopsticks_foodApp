package com.example.chopsticks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bill : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bill)
        supportActionBar?.hide()
        val mainMenuButton: Button = findViewById(R.id.exitBtn)
        mainMenuButton.setOnClickListener {
            finishAffinity()
        }
    }
}