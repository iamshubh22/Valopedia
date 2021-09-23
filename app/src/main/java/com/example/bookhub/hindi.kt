package com.example.bookhub

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView

class hindi : AppCompatActivity() {

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
        setContentView(R.layout.activity_hindi)
        title="VALOPEDIA ->HINDI STREAMERS"

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
                this@hindi , "SK ROSSI IS HERE!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong=MediaPlayer.create(this@hindi , R.raw.ent);
            mysong.start();
            val intent= Intent(this@hindi ,rossi::class.java)
            startActivity(intent)
        }



        character.setOnClickListener()
        {
            Toast.makeText(
                this@hindi , "FLICK IS HERE!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong=MediaPlayer.create(this@hindi , R.raw.ent);
            mysong.start();
            val intent= Intent(this@hindi ,flick::class.java)
            startActivity(intent)
        }

        learn1.setOnClickListener()
        {
            Toast.makeText(
                this@hindi , "REBEL IS HERE!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong=MediaPlayer.create(this@hindi , R.raw.ent);
            mysong.start();
            val intent= Intent(this@hindi ,rebel::class.java)
            startActivity(intent)
        }

        download.setOnClickListener()
        {
            Toast.makeText(
                this@hindi , "BINKS THIS SIDE !!",
                Toast.LENGTH_SHORT
            ).show()
            mysong=MediaPlayer.create(this@hindi , R.raw.ent);
            mysong.start();
            val intent= Intent(this@hindi ,binks::class.java)
            startActivity(intent)
        }

        chill.setOnClickListener()
        {
            Toast.makeText(
                this@hindi , "ZEREF THIS SIDE!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong=MediaPlayer.create(this@hindi , R.raw.ent);
            mysong.start();
            val intent= Intent(this@hindi ,zeref::class.java)
            startActivity(intent)
        }

        video.setOnClickListener()
        {
            Toast.makeText(
                this@hindi , "ANKITTA THIS SIDE!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong=MediaPlayer.create(this@hindi , R.raw.ent);
            mysong.start();
            val intent= Intent(this@hindi ,ankitta::class.java)
            startActivity(intent)
        }


        btnlog.setOnClickListener {
            Toast.makeText(
                this@hindi , "HAVE A GOOD DAY!!",
                Toast.LENGTH_SHORT
            ).show()
            val intent1= Intent(this@hindi ,LOGIN::class.java)
            startActivity(intent1)
            finish()
        }


    }
}