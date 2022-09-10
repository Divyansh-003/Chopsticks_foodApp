package com.example.chopsticks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class address : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address)
        supportActionBar?.hide()
        val submitButton: Button = findViewById(R.id.submitBtn)
        submitButton.setOnClickListener {
            val intent = Intent(this, bill::class.java)
            startActivity(intent)



        }

    }
}

