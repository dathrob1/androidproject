package com.example.teleapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class CallmebackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_callmeback)

    }
    fun callmeback(view: View){
        val editText = findViewById(R.id.callmebackreciever) as EditText
        var number: Int = editText.text.toString().toInt()
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "*807*"+ number+ Uri.encode("#")))
        startActivity(intent)
    }
}