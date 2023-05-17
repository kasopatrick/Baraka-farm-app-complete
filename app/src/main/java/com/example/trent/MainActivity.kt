package com.example.trent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity() : AppCompatActivity(), Parcelable {
    lateinit var mTitle:TextView
    lateinit var dimage:ImageView
    lateinit var dText: TextView
    lateinit var btStart:Button
    lateinit var dimage_2:ImageView

    constructor(parcel: Parcel) : this() {

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mTitle = findViewById(R.id.nTvTitle)
        dimage = findViewById(R.id.Image_1)
        dText = findViewById(R.id.edtText)
        btStart = findViewById(R.id.mBtnStart)
        dimage_2 = findViewById(R.id.Image_2)

        btStart.setOnClickListener {
            var tembea = Intent(this,Users::class.java)
            startActivity(tembea)
        }





    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }


}


