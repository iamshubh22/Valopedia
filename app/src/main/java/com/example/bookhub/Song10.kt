package com.example.bookhub

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.ImageButton
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_song1.*

class Song10 : AppCompatActivity() {
    lateinit var play: ImageButton
    lateinit var pause: ImageButton
    lateinit var stop: ImageButton

    private var mp: MediaPlayer?=null
    private var currentSong : MutableList<Int> = mutableListOf(R.raw.uper)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_song10)
        supportActionBar!!.hide()

        play=findViewById(R.id.play)
        pause=findViewById(R.id.pause)
        stop=findViewById(R.id.stop)
        controlSound(currentSong[0])

    }

    private fun controlSound(id:Int){

        play.setOnClickListener {
            Toast.makeText(
                this@Song10, "Song is playing!",
                Toast.LENGTH_SHORT
            ).show()
            if(mp==null)
            {
                mp=MediaPlayer.create(this,id)
                Log.d("music","ID: $(mp!!.audioSessionId}")

                initialiseSeekBar()
            }
            mp?.start()
            Log.d("music","Duration: $(mp!!.duration/1000}seconds")
        }

        pause.setOnClickListener {
            Toast.makeText(
                this@Song10, "Song is paused!",
                Toast.LENGTH_SHORT
            ).show()
            if(mp!==null)
                mp?.pause()
            Log.d("music","Paused at: $(mp!!.currentPosition/1000}seconds")
        }

        stop.setOnClickListener {
            Toast.makeText(
                this@Song10, "Song is Stopped!",
                Toast.LENGTH_SHORT
            ).show()
            if(mp!==null)
            {
                mp?.stop()
                mp?.reset()
                mp?.release()
                mp=null
            }
        }

        seek1.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seek1: SeekBar?, progress: Int, fromUser: Boolean) {
                if(fromUser) mp?.seekTo(progress)
            }

            override fun onStartTrackingTouch(seek1: SeekBar?) {

            }

            override fun onStopTrackingTouch(seek1: SeekBar?) {

            }

        })



    }
    private fun initialiseSeekBar() {
        seek1.max = mp!!.duration

        val handler = Handler()
        handler.postDelayed(object : Runnable {


            override fun run() {
                try {
                    seek1.progress = mp!!.currentPosition
                    handler.postDelayed(this, 1000)
                } catch (e: Exception) {
                    seek1.progress = 0
                }
            }
        }, 0)


    }

    override fun onBackPressed() {
        mp?.stop()
        super.onBackPressed()
    }
}