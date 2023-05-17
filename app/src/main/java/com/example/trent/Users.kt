package com.example.trent

import android.annotation.SuppressLint
import android.content.Intent
import android.icu.text.CaseMap.Title
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class Users : AppCompatActivity() {
    lateinit var title: TextView
    lateinit var img:ImageView
    lateinit var btview:Button
    lateinit var advice:Button
    lateinit var contact:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users2)
        title = findViewById(R.id.mtitle)
        img = findViewById(R.id.imageV)
        btview = findViewById(R.id.mbtnview)
        advice = findViewById(R.id.mbtnadvice)
        contact = findViewById(R.id.mbtncontact)

        btview.setOnClickListener {
            var beba = Intent(this,SignInActivity::class.java)
            startActivity(beba)

        }
        advice.setOnClickListener {

        }
        contact.setOnClickListener {
            var lift = Intent(this,Contact::class.java)
            startActivity(lift)

        }



    }
}