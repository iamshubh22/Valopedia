package com.example.bookhub

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.text.Layout
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.cardview.widget.CardView

class music : AppCompatActivity() {

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
        setContentView(R.layout.activity_music)
        title = "VALOPEDIA -> MUSIC LIST"

        btnlog = findViewById(R.id.btnlog)
        modes1 = findViewById(R.id.modes1)
        character = findViewById(R.id.character)
        learn1 = findViewById(R.id.learn1)
        download = findViewById(R.id.download)
        chill = findViewById(R.id.chill)
        video = findViewById(R.id.video)






        modes1.setOnClickListener()
        {
            Toast.makeText(
                this@music, "Legends Never Die",
                Toast.LENGTH_SHORT
            ).show()
            val intent1 = Intent(this@music, Song1::class.java)
            startActivity(intent1)
        }

        character.setOnClickListener()
        {
            Toast.makeText(
                this@music, "Devil Eyes",
                Toast.LENGTH_SHORT
            ).show()
            val intent2 = Intent(this@music, Song2::class.java)
            startActivity(intent2)
        }


    }
}