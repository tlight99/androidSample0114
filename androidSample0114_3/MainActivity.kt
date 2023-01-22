package com.kyle.sample0114_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rdoSecond = findViewById<RadioButton>(R.id.rdoSecond)
        var btnNewActivity = findViewById<Button>(R.id.btnNew)

        btnNewActivity.setOnClickListener{
            var intent : Intent

            if (rdoSecond.isChecked == true)
                intent = Intent(applicationContext, SecondActivity::class.java) // this@MainActivity == applicationContext 와 같다.
            else
                intent = Intent(this@MainActivity, ThirdActivity::class.java)

            startActivity(intent)
        }
    }
}