package com.example.explicitintents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnIntent=findViewById<Button>(R.id.button2)

        btnIntent.setOnClickListener {
            //open a new activity

            intent= Intent(applicationContext,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}