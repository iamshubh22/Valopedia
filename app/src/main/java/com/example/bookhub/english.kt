package com.example.bookhub

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.cardview.widget.CardView

class english : AppCompatActivity() {
    lateinit var btnlog: Button
    lateinit var modes1: CardView
    lateinit var character: CardView
    lateinit var learn1: CardView
    lateinit var download: CardView
    lateinit var chill: CardView
    lateinit var video: CardView
    lateinit var mysong: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english)
        title="VALOPEDIA->ENGLISH STREAMERS"

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
                this@english , "NINJA IS HERE!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong=MediaPlayer.create(this@english, R.raw.ent);
            mysong.start();
            val intent= Intent(this@english ,ninja::class.java)
            startActivity(intent)
        }



        character.setOnClickListener()
        {
            Toast.makeText(
                this@english , "SUBROZA IS HERE!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong=MediaPlayer.create(this@english , R.raw.ent);
            mysong.start();
            val intent= Intent(this@english ,subroza::class.java)
            startActivity(intent)
        }

        learn1.setOnClickListener()
        {
            Toast.makeText(
                this@english , "AVERAGE JONAS IS HERE!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong=MediaPlayer.create(this@english , R.raw.ent);
            mysong.start();
            val intent= Intent(this@english ,jonas::class.java)
            startActivity(intent)
        }

        download.setOnClickListener()
        {
            Toast.makeText(
                this@english , "FLEXINJA THIS SIDE !!",
                Toast.LENGTH_SHORT
            ).show()
            mysong=MediaPlayer.create(this@english , R.raw.ent);
            mysong.start();
            val intent= Intent(this@english ,binks::class.java)
            startActivity(intent)
        }

        chill.setOnClickListener()
        {
            Toast.makeText(
                this@english , "SHROUD THIS SIDE!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong=MediaPlayer.create(this@english , R.raw.ent);
            mysong.start();
            val intent= Intent(this@english ,shroud::class.java)
            startActivity(intent)
        }

        video.setOnClickListener()
        {
            Toast.makeText(
                this@english , "TENZ THIS SIDE!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong=MediaPlayer.create(this@english , R.raw.ent);
            mysong.start();
            val intent= Intent(this@english ,tenz::class.java)
            startActivity(intent)
        }


        btnlog.setOnClickListener {
            Toast.makeText(
                this@english , "HAVE A GOOD DAY!!",
                Toast.LENGTH_SHORT
            ).show()
            val intent1= Intent(this@english ,LoginActivity2::class.java)
            startActivity(intent1)
            finish()
        }

    }
}