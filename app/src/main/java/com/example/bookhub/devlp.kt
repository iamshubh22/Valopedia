package com.example.bookhub

import android.widget.Toast


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class devlp : AppCompatActivity() {



    lateinit var back: Button
    lateinit var btnlog:Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_devlp)

        title="VALOPEDIA->DEVELOPER PROFILE"

        back = findViewById(R.id.back)
        btnlog=findViewById(R.id.btnlog)
        back.setOnClickListener {
            val intent = Intent(this@devlp,PAGE_FIRST::class.java)
            Toast.makeText(
                this@devlp, "WELCOME BACK TO HOME PAGE!!",
                Toast.LENGTH_SHORT
            ).show()
            startActivity(intent)
        }

        btnlog.setOnClickListener {
            Toast.makeText(
                this@devlp, "HAVE A GOOD DAY!!",
                Toast.LENGTH_SHORT
            ).show()
            val intent1= Intent(this@devlp,LoginActivity2::class.java)
            startActivity(intent1)
            finish()
        }
    }
}