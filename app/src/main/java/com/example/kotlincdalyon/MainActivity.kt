package com.example.kotlincdalyon

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // add button
        val button = findViewById<Button>(R.id.start_new_activity_btn)
        button.setOnClickListener{
            val intent = Intent(this, NewActivity::class.java)
            startActivity(intent)
        }
    }
}