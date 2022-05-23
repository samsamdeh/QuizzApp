package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //fullscreen
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
//30

        var btnStart:Button = findViewById(R.id.btnStart)
        var etName:AppCompatEditText = findViewById(R.id.etName)

        btnStart.setOnClickListener {
            if (etName.text.toString().isEmpty()){
                 Toast.makeText(this,
                     "Por favor, insira seu nome",Toast.LENGTH_LONG ).show()
            } else {
                val intent = Intent (this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME,etName.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}