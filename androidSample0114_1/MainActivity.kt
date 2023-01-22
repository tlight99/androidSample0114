package com.kyle.sample0114

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnNewActivity = findViewById<Button>(R.id.btnNewActivity)
        btnNewActivity.setOnClickListener {
            var intent = Intent(applicationContext, SecondActivity::class.java) // applicationContext 현재 페이지 => mainActivity.kt
            startActivity(intent)
        }
    }
}