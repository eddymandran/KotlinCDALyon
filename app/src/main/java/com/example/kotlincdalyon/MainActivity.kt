package com.example.kotlincdalyon

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TAG = "Mainactivity"
        // add button
        val button = findViewById<Button>(R.id.start_new_activity_btn)
        button.setOnClickListener{
            val intent = Intent(this, NewActivity::class.java)
            //Add action
            intent.action =Intent.ACTION_VIEW
            //add category
            intent.addCategory("user")
            //add Extrat
            intent.putExtra("name", "Eddy")
            intent.putExtra("age", 25)
            startActivity(intent)
        }
        //Log
        Log.v("Mainactivity", "Verbose message")
        Log.d("Mainactivity", "Debug message")
        Log.i(TAG, "Info message")
        Log.w(TAG, "Warning message")
        Log.e(TAG, "error message")


    }
}