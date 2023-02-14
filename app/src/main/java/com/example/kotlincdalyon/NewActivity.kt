package com.example.kotlincdalyon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_activity)

        val TAG = "NewActivity"
        // Definir mon action
        var action = intent.action

        // category
        val isUserview = intent.hasCategory("user")

        // charge mes extra dans le bundle
        val extras: Bundle? = intent.extras

        val name = extras?.getString("name")
        val age = extras?.getInt("age")

        Log.i(TAG, "action: $action, isUserViewer: $isUserview, name: ${name}, age: ${age}")
    }
}