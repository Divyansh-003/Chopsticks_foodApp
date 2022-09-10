package com.example.chopsticks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils.*
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.animation.AnimationUtils
import kotlinx.coroutines.delay

class Splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        val launchButton: Button =findViewById(R.id.launchBtn)
        launchButton.setOnClickListener{
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
}