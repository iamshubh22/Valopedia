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
    lateinit var afraid:CardView
    lateinit var fight:CardView
    lateinit var rumors:CardView
    lateinit var fed:CardView
    lateinit var uper:CardView
    lateinit var sia:CardView
    lateinit var know:CardView
    lateinit var take:CardView
    lateinit var low:CardView
    lateinit var invi:CardView
    lateinit var care:CardView
    lateinit var great:CardView
    lateinit var dang:CardView
    lateinit var mont:CardView
    lateinit var rox:CardView


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
        afraid=findViewById(R.id.afraid)
        fight=findViewById(R.id.fight)
        rumors=findViewById(R.id.rumors)
        fed=findViewById(R.id.fed)
        uper=findViewById(R.id.uper)
        sia=findViewById(R.id.sia)
        know=findViewById(R.id.know)
        take=findViewById(R.id.take)
        low=findViewById(R.id.low)
        invi=findViewById(R.id.invi)
        care=findViewById(R.id.care)
        great=findViewById(R.id.great)
        dang=findViewById(R.id.dang)
        mont=findViewById(R.id.mont)
        rox=findViewById(R.id.rox)






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

        afraid.setOnClickListener()
        {
            Toast.makeText(
                this@music, "Not Afraid",
                Toast.LENGTH_SHORT
            ).show()
            val intent6 = Intent(this@music, Song6::class.java)
            startActivity(intent6)
        }

        fight.setOnClickListener()
        {
            Toast.makeText(
                this@music, "Fight Back",
                Toast.LENGTH_SHORT
            ).show()
            val intent7 = Intent(this@music, Song7::class.java)
            startActivity(intent7)
        }

        rumors.setOnClickListener()
        {
            Toast.makeText(
                this@music, "Rumors",
                Toast.LENGTH_SHORT
            ).show()
            val intent8 = Intent(this@music, Song8::class.java)
            startActivity(intent8)
        }

        fed.setOnClickListener()
        {
            Toast.makeText(
                this@music, "Fed Up",
                Toast.LENGTH_SHORT
            ).show()
            val intent9 = Intent(this@music, Song9::class.java)
            startActivity(intent9)
        }

        uper.setOnClickListener()
        {
            Toast.makeText(
                this@music, "SuperHeros",
                Toast.LENGTH_SHORT
            ).show()
            val intent10 = Intent(this@music, Song10::class.java)
            startActivity(intent10)
        }

        sia.setOnClickListener()
        {
            Toast.makeText(
                this@music, "Unstoppable",
                Toast.LENGTH_SHORT
            ).show()
            val intent11 = Intent(this@music, Song11::class.java)
            startActivity(intent11)
        }

        know.setOnClickListener()
        {
            Toast.makeText(
                this@music, "More than you know",
                Toast.LENGTH_SHORT
            ).show()
            val intent12 = Intent(this@music, Song12::class.java)
            startActivity(intent12)
        }

        take.setOnClickListener()
        {
            Toast.makeText(
                this@music, "Whatever It Takes",
                Toast.LENGTH_SHORT
            ).show()
            val intent13 = Intent(this@music, Song13::class.java)
            startActivity(intent13)
        }

        low.setOnClickListener()
        {
            Toast.makeText(
                this@music, "Industry Baby",
                Toast.LENGTH_SHORT
            ).show()
            val intent14 = Intent(this@music, Song14::class.java)
            startActivity(intent14)
        }

        invi.setOnClickListener()
        {
            Toast.makeText(
                this@music, "Invisible",
                Toast.LENGTH_SHORT
            ).show()
            val intent15 = Intent(this@music, Song15::class.java)
            startActivity(intent15)
        }

        care.setOnClickListener()
        {
            Toast.makeText(
                this@music, "Careless",
                Toast.LENGTH_SHORT
            ).show()
            val intent16 = Intent(this@music, Song16::class.java)
            startActivity(intent16)
        }

        great.setOnClickListener()
        {
            Toast.makeText(
                this@music, "Grateful",
                Toast.LENGTH_SHORT
            ).show()
            val intent17 = Intent(this@music, Song17::class.java)
            startActivity(intent17)
        }

        dang.setOnClickListener()
        {
            Toast.makeText(
                this@music, "2 Dangerous",
                Toast.LENGTH_SHORT
            ).show()
            val intent18 = Intent(this@music, Song18::class.java)
            startActivity(intent18)
        }

        mont.setOnClickListener()
        {
            Toast.makeText(
                this@music, "Montero",
                Toast.LENGTH_SHORT
            ).show()
            val intent19 = Intent(this@music, Song19::class.java)
            startActivity(intent19)
        }

        rox.setOnClickListener()
        {
            Toast.makeText(
                this@music, "Roxanne",
                Toast.LENGTH_SHORT
            ).show()
            val intent20 = Intent(this@music, Song20::class.java)
            startActivity(intent20)
        }
    }
}