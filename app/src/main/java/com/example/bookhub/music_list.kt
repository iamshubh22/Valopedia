package com.example.bookhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class music_list : AppCompatActivity() {

    lateinit var btnSong1: Button
    lateinit var mysong: android.media.MediaPlayer
    lateinit var btnStop1: Button
    lateinit var btnSong2: Button
    lateinit var mysong1: android.media.MediaPlayer
    lateinit var btnStop2: Button
    lateinit var btnSong3: Button
    lateinit var mysong2: android.media.MediaPlayer
    lateinit var btnStop3: Button
    lateinit var btnSong4: Button
    lateinit var mysong3: android.media.MediaPlayer
    lateinit var btnStop4: Button
    lateinit var btnSong5: Button
    lateinit var mysong4: android.media.MediaPlayer
    lateinit var btnStop5: Button
    lateinit var btnSong6: Button
    lateinit var mysong5: android.media.MediaPlayer
    lateinit var btnStop6: Button
    lateinit var logBtn_music:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_list)

        title = "VALOPEDIA -> MUSIC LIST"

        btnSong1 = findViewById(R.id.btnSong1)
        btnStop1 = findViewById(R.id.btnStop1)
        btnSong2 = findViewById(R.id.btnSong2)
        btnStop2 = findViewById(R.id.btnStop2)
        btnSong3 = findViewById(R.id.btnSong3)
        btnStop3 = findViewById(R.id.btnStop3)
        btnSong4 = findViewById(R.id.btnSong4)
        btnStop4 = findViewById(R.id.btnStop4)
        btnSong5 = findViewById(R.id.btnSong5)
        btnStop5 = findViewById(R.id.btnStop5)
        btnSong6 = findViewById(R.id.btnSong6)
        btnStop6 = findViewById(R.id.btnStop6)
        logBtn_music=findViewById(R.id.logBtn_music)



        btnSong1.setOnClickListener()
        {
            Toast.makeText(
                this@music_list, "ENJOY YOUR SONG !!",
                Toast.LENGTH_SHORT
            ).show()
            //mysong = android.media.MediaPlayer.create(this@music_list, R.raw.brown);
            mysong.start()
        }

        btnStop1.setOnClickListener()
        {
            Toast.makeText(
                this@music_list, "SONG STOPPED !!",
                Toast.LENGTH_SHORT
            ).show()
            mysong.pause()

        }

        btnSong2.setOnClickListener()
        {
            Toast.makeText(
                this@music_list, "ENJOY YOUR SONG !!",
                Toast.LENGTH_SHORT
            ).show()
            //mysong1 = android.media.MediaPlayer.create(this@music_list, R.raw.fight);
            mysong1.start();

        }

        btnStop2.setOnClickListener()
        {
            Toast.makeText(
                this@music_list, "SONG STOPPED !!",
                Toast.LENGTH_SHORT
            ).show()
            mysong1.pause()

        }


        btnSong3.setOnClickListener()
        {
            Toast.makeText(
                this@music_list, "ENJOY YOUR SONG !!",
                Toast.LENGTH_SHORT
            ).show()
            //mysong2 = android.media.MediaPlayer.create(this@music_list, R.raw.montero);
            mysong2.start();

        }

        btnStop3.setOnClickListener()
        {
            Toast.makeText(
                this@music_list, "SONG STOPPED !!",
                Toast.LENGTH_SHORT
            ).show()
            mysong2.pause()

        }

        btnSong4.setOnClickListener()
        {
            Toast.makeText(
                this@music_list, "ENJOY YOUR SONG !!",
                Toast.LENGTH_SHORT
            ).show()
            //mysong3 = android.media.MediaPlayer.create(this@music_list, R.raw.hope);
            mysong3.start();

        }

        btnStop4.setOnClickListener()
        {
            Toast.makeText(
                this@music_list, "SONG STOPPED !!",
                Toast.LENGTH_SHORT
            ).show()
            mysong3.pause()

        }

        btnSong5.setOnClickListener()
        {
            Toast.makeText(
                this@music_list, "ENJOY YOUR SONG !!",
                Toast.LENGTH_SHORT
            ).show()
            mysong4 = android.media.MediaPlayer.create(this@music_list, R.raw.legends);
            mysong4.start();

        }

        btnStop5.setOnClickListener()
        {
            Toast.makeText(
                this@music_list, "SONG STOPPED !!",
                Toast.LENGTH_SHORT
            ).show()
            mysong4.pause()

        }

        btnSong6.setOnClickListener()
        {
            Toast.makeText(
                this@music_list, "ENJOY YOUR SONG !!",
                Toast.LENGTH_SHORT
            ).show()
            mysong5 = android.media.MediaPlayer.create(this@music_list, R.raw.devil);
            mysong5.start();

        }

        btnStop6.setOnClickListener()
        {
            Toast.makeText(
                this@music_list, "SONG STOPPED !!",
                Toast.LENGTH_SHORT
            ).show()
            mysong5.pause()

        }


        logBtn_music.setOnClickListener()
        {
            Toast.makeText(
                this@music_list, "HAVE A GOOD DAY!!",
                Toast.LENGTH_SHORT
            ).show()
            val intent1= Intent(this@music_list,LOGIN::class.java)
            startActivity(intent1)
            finish()
        }

    }
}