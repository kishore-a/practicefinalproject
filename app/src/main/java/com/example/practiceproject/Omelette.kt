package com.example.practiceproject

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class Omelette : AppCompatActivity() {

    lateinit var textInput: EditText
    @SuppressLint("WrongViewCast")

    private val textInputModel:UserTextInputModel=UserTextInputModel(this)
    private lateinit var textField: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        this.loadthetext()
        super.onCreate(savedInstanceState)
        val img=findViewById<ImageView>(R.id.imageView4)
        setContentView(R.layout.activity_omelette)
        textInput=findViewById(R.id.editTextTextPersonName)

//        buttonsave.setOnClickListener{
//            println("Hi")
////            println("Done")
////            savethetext(textInput)
////            Log.i(TAG, textInput.text.toString())
//        }

        setContentView(R.layout.activity_omelette)
        this.loadthetext()

    }

    private fun savethetext(s: EditText) {
        this.textInputModel.saveText(s)
        Log.i(TAG,"Saved the msg")

    }
    private fun loadthetext(){
    Log.i(TAG,"Came to omelette")
    if(::textField.isInitialized){
        this.textField.text=this.textInputModel.loadText()

    }


    }

//

}