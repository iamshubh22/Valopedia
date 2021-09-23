package com.example.bookhub


import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LOGIN : AppCompatActivity() {


    lateinit var mainID: EditText
    lateinit var mainpass: EditText
    lateinit var mainbtn: Button
    lateinit var mainText: TextView
    lateinit var mainText1: TextView
    lateinit var mysong: MediaPlayer
    val validId = arrayOf("shubh", "demon", "thanos", "avengers")
    val validPass = arrayOf("shubh", "demon", "thanos", "avengers")




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_login)
        mysong=MediaPlayer.create(this@LOGIN, R.raw.valo);
        mysong.start()
        title = "Valopedia Log In"

        mainID = findViewById(R.id.mainID)
        mainpass = findViewById(R.id.mainpass)
        mainbtn = findViewById(R.id.mainbtn)
        mainText = findViewById(R.id.mainText)
        mainText1 = findViewById(R.id.mainText1)


        mainbtn.setOnClickListener {

            val Id = mainID.text.toString()
            val pass = mainpass.text.toString()
            var name = "name"
            mysong.pause()


            if ((validId.contains(Id)) && (validPass.contains(pass))) {
                val intent = Intent(this@LOGIN, PAGE_FIRST::class.java)
                if (pass == validPass[0] && Id==validId[0]) {

                    name = "VALOPEDIA -> SHUBH"
                    Toast.makeText(
                        this@LOGIN, "YOU ARE A VALORANT NOW!!",
                        Toast.LENGTH_SHORT
                    ).show()
                    intent.putExtra("name", name)
                    startActivity(intent)
                } else if (pass == validPass[1]&& Id==validId[1]) {

                    name = "VALOPEDIA -> DEMON"
                    Toast.makeText(
                        this@LOGIN, "YOU ARE A VALORANT NOW!!",
                        Toast.LENGTH_SHORT
                    ).show()
                    intent.putExtra("name", name)

                    startActivity(intent)
                } else if (pass == validPass[2]&& Id==validId[2]) {

                    name = "VALOPEDIA -> THANOS"
                    Toast.makeText(
                        this@LOGIN, "YOU ARE A VALORANT NOW!!",
                        Toast.LENGTH_SHORT
                    ).show()
                    intent.putExtra("name", name)

                    startActivity(intent)
                } else if (pass == validPass[3]&& Id==validId[3]) {

                    name = "VALOPEDIA -> AVENGERS"
                    Toast.makeText(
                        this@LOGIN, "YOU ARE A VALORANT NOW!!",
                        Toast.LENGTH_SHORT
                    ).show()
                    intent.putExtra("name", name)

                    startActivity(intent)
                }

            } else {
                Toast.makeText(
                    this@LOGIN, "INVALID CREDENTIALS",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }


    }

}





