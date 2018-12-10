package com.example.hari.demo4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcom.*

class welcomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcom)

        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        tvW.text = "Welcome To GURUKUL \n $name \n $email"
    }
}
