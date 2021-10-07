package com.example.bookhub

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
//import android.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
class message_screen : AppCompatActivity() {

    lateinit var txtMessage: TextView
    lateinit var btn1: Button
    lateinit var btnlog:Button
    lateinit  var mysong:MediaPlayer






    var message = "Custom Message"
    var message1 = "custom message 1"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message_screen)




        title="VALOPEDIA -> DETAILS"

        txtMessage= findViewById(R.id.txtMessage)

        btn1=findViewById(R.id.btn1)
        btnlog=findViewById(R.id.btnlog)

        btn1.setOnClickListener()
        {
            Toast.makeText(
                this@message_screen, "WELCOME TO MENU!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong=MediaPlayer.create(this@message_screen, R.raw.kill);
            mysong.start();
            val intent = Intent(this@message_screen, menu::class.java)
            startActivity(intent)
        }

        btnlog.setOnClickListener {
            Toast.makeText(
                this@message_screen, "HAVE A GOOD DAY!!",
                Toast.LENGTH_SHORT
            ).show()
            val intent1= Intent(this@message_screen,LoginActivity2::class.java)
            startActivity(intent1)
            finish()
        }


        if (intent != null) {
            message = intent.getStringExtra("Message").toString()
            message1 =intent.getStringExtra("Message1").toString()

            val txtMessage=findViewById<TextView>(R.id.txtMessage)

            txtMessage.text="YOUR NAME IS -> \t" + message + "\n" + "\n"+ "YOUR VALORANT ID IS ->\t" + message1



        }

    }





}