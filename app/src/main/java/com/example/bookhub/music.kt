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
    lateinit var cold: CardView
    lateinit var cradles:CardView
    lateinit var name:CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music)
        title = "VALOPEDIA -> MUSIC LIST"

        btnlog = findViewById(R.id.btnlog)
        modes1 = findViewById(R.id.modes1)
        character = findViewById(R.id.character)
        cold=findViewById(R.id.cold)
        cradles=findViewById(R.id.cradles)
        name=findViewById(R.id.name)





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

        cold.setOnClickListener()
        {
            Toast.makeText(
                this@music, "Cold",
                Toast.LENGTH_SHORT
            ).show()
            val intent3 = Intent(this@music, Song3::class.java)
            startActivity(intent3)
        }

        cradles.setOnClickListener()
        {
            Toast.makeText(
                this@music, "Cradles",
                Toast.LENGTH_SHORT
            ).show()
            val intent4 = Intent(this@music, Song4::class.java)
            startActivity(intent4)
        }


        name.setOnClickListener()
        {
            Toast.makeText(
                this@music, "Remember The Name",
                Toast.LENGTH_SHORT
            ).show()
            val intent5 = Intent(this@music, Song5::class.java)
            startActivity(intent5)
        }

    }
}