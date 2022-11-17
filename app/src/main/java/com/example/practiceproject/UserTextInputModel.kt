package com.example.practiceproject

import android.content.ContentValues.TAG
import android.content.Context
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import java.io.File

class UserTextInputModel(_context: Context) {
    private var context:Context=_context
    private val textFileName="userInput.txt"

    private fun makeFile():File {
    return File(this.context.filesDir,this.textFileName)
    }

    fun saveText(s: String){
        val file=this.makeFile()
        file.delete()
        Log.i(TAG,"File created")
        file.writeText(s)
    }
    fun loadText(): String {
        Log.i(TAG,"Came to userTextInput")
        val file=this.makeFile()
        var s=""
        if(file.exists()){

            Log.i(TAG,"Printing from the File")
            s=file.readText()
            println(s)
        }
        return s
    }

}
