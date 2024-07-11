package com.example.explicitintents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val btnIntent2=findViewById<Button>(R.id.button)

        btnIntent2.setOnClickListener {
            //open a new activity

            intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}