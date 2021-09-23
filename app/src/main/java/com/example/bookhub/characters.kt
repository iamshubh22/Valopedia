package com.example.bookhub


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class characters : AppCompatActivity() {

    lateinit var logBtn_charac: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_characters)

        title="VALOPEDIA ->CHARACTERS"
        logBtn_charac=findViewById(R.id.logBtn_charac)


        logBtn_charac.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "HAVE A GOOD DAY!!",
                Toast.LENGTH_SHORT
            ).show()
            val intent1= Intent(this@characters,LOGIN::class.java)
            startActivity(intent1)
            finish()
        }
    }
}