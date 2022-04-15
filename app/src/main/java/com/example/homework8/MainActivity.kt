package com.example.homework8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework8.models.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val user = User(edt_text1.text.toString(), edt_text2.text.toString().toInt())
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("keyUser", user)
            startActivity(intent)
        }
    }
}