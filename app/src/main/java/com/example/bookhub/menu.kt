package com.example.bookhub

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView

class menu : AppCompatActivity() {

   lateinit var btnlog:Button
   lateinit var modes1:CardView
   lateinit var character:CardView
   lateinit var learn1:CardView
   lateinit var download:CardView
   lateinit var chill:CardView
   lateinit var video:CardView
   lateinit var mysong:MediaPlayer




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        title="VALOPEDIA -> MENU"

        btnlog=findViewById(R.id.btnlog)
        modes1=findViewById(R.id.modes1)
        character=findViewById(R.id.character)
        learn1=findViewById(R.id.learn1)
        download=findViewById(R.id.download)
        chill=findViewById(R.id.chill)
        video=findViewById(R.id.video)






        modes1.setOnClickListener()
        {
            Toast.makeText(
                this@menu, "WELCOME TO VALORANT MODES PAGE!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong=MediaPlayer.create(this@menu, R.raw.wel);
            mysong.start();
            val intent1= Intent(this@menu,modes::class.java)
            startActivity(intent1)
        }



        character.setOnClickListener()
        {
            Toast.makeText(
                this@menu, "WELCOME TO CHARACTERS PAGE!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong=MediaPlayer.create(this@menu, R.raw.choose);
            mysong.start();
            val intent2= Intent(this@menu,characters::class.java)
            startActivity(intent2)
        }

        chill.setOnClickListener()
        {
            Toast.makeText(
                this@menu, "WELCOME TO MUSIC GALLERY!!",
                Toast.LENGTH_SHORT
            ).show()
            val intent3= Intent(this@menu,music::class.java)
            startActivity(intent3)
        }

        learn1.setOnClickListener()
        {
            Toast.makeText(
                this@menu, "WELCOME TO GALLERY!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong=MediaPlayer.create(this@menu, R.raw.wel);
            mysong.start();
            val intent4= Intent(this@menu,gallery::class.java)
            startActivity(intent4)
        }


        btnlog.setOnClickListener {
            Toast.makeText(
                this@menu, "HAVE A GOOD DAY!!",
                Toast.LENGTH_SHORT
            ).show()
            val intent5= Intent(this@menu,LOGIN::class.java)
            startActivity(intent5)
            finish()
        }


    }
}