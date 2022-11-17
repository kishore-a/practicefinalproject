package com.example.practiceproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Applepie : AppCompatActivity() {
    private lateinit var comment: TextView
    private lateinit var buttonsaved: Button
    private var textInputModel:UserTextInputModel=UserTextInputModel(this)
    private lateinit var comments: EditText

    private fun loadthetext(){
        comment.text=textInputModel.loadText()
    }
    private fun savethetext(s:String){
        this.textInputModel.saveText(s)
    }

    private fun setupCallbacks(){
        this.buttonsaved.setOnClickListener{
            comment.text = comments.text.toString()
            val t=this.comments.text
            if(t!=null){
                this.savethetext(t.toString())
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_applepie)
        buttonsaved=findViewById(R.id.buttontest)
        comment=findViewById(R.id.comment)
        comments=findViewById(R.id.commentinp)
        this.loadthetext()
        this.setupCallbacks()
    }
}