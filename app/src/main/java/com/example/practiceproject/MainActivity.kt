package com.example.practiceproject

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image= findViewById<ImageView>(R.id.imageView10)
        val applepie=findViewById<ImageView>(R.id.imageView11)
        val button=findViewById<Button>(R.id.button2)

        image.setOnClickListener {
            Log.i(TAG,"Selected Omelette")
            val intent = Intent(this, Omelette::class.java)
            startActivity(intent)

        }
        applepie.setOnClickListener {
            Log.i(TAG,"Selected Apple Pie")
            val intent1=Intent(this,Applepie::class.java)
            startActivity(intent1)

        }
        button.setOnClickListener {
            Log.i(TAG,"Selected to view video")
            val intent2=Intent(this,VideoDescription::class.java)
            startActivity(intent2)
        }
    }

}