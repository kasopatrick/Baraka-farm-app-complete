package com.example.trent

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class Contact : AppCompatActivity() {
    lateinit var C_Title:TextView
    lateinit var C_text:TextView
    lateinit var C_img:ImageView
    lateinit var C_email:TextView
    lateinit var C_phone:TextView
    lateinit var C_email_img:ImageButton
    lateinit var C_phone_img :ImageButton
    lateinit var C_sms_img:ImageButton
    lateinit var C_watsapp:ImageButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        C_Title = findViewById(R.id.mTitle)
        C_text = findViewById(R.id.EDTtext)
        C_img = findViewById(R.id.imgView)
        C_email = findViewById(R.id.BTNemail)
        C_phone = findViewById(R.id.BTNcontact)
        C_email_img = findViewById(R.id.imagEmail)
        C_phone_img = findViewById(R.id.imagPhone)
        C_sms_img = findViewById(R.id.imagsms)
        C_watsapp = findViewById(R.id.imagwatsapp)

        C_email_img.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "kasopatrick5@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Job application")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear sir ....")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))

        }
        C_phone_img.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "0728474931"))
            if (ContextCompat.checkSelfPermission(
                    this@Contact,
                    android.Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@Contact,
                    arrayOf<String>(android.Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }
        }
        C_sms_img.setOnClickListener {
            val uri: Uri = Uri.parse("smsto:0728474931")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "Hello there....")
            startActivity(intent)

        }
        C_watsapp.setOnClickListener {

        }





    }
}