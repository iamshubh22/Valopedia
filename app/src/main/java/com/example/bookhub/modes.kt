package com.example.bookhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class modes : AppCompatActivity() {
    lateinit var logBtn_mode: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modes)

        title="VALOPEDIA ->MODES"

        logBtn_mode=findViewById(R.id.logBtn_mode)


        logBtn_mode.setOnClickListener()
        {
            Toast.makeText(
                this@modes, "HAVE A GOOD DAY!!",
                Toast.LENGTH_SHORT
            ).show()
            val intent1= Intent(this@modes,LoginActivity2::class.java)
            startActivity(intent1)
            finish()
        }

    }
}