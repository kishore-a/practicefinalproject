package com.example.practiceproject

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image= findViewById<ImageView>(R.id.imageView10)
        image.setOnClickListener {
            Log.i(TAG,"Hello from omelette")
            val intent = Intent(this, Omelette::class.java)
            startActivity(intent)

        }
    }

}