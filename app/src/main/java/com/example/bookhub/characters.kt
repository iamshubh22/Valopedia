package com.example.bookhub


import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_characters.*

class characters : AppCompatActivity() {

    lateinit var logBtn_charac: Button
    lateinit var btnAstra:Button
    lateinit var btnBrim:Button
    lateinit var btnBreach:Button
    lateinit var btnCypher:Button
    lateinit var btnJett:Button
    lateinit var btnKayo:Button
    lateinit var btnKill: Button
    lateinit var btnOmen: Button
    lateinit var btnPheonix:Button
    lateinit var btnSage:Button
    lateinit var btnRaze:Button
    lateinit var btnReyna:Button
    lateinit var btnSkye:Button
    lateinit var btnYoru:Button
    lateinit var btnSova:Button
    lateinit var btnV:Button
    lateinit var mysong:MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_characters)

        title="VALOPEDIA ->CHARACTERS"
        logBtn_charac=findViewById(R.id.logBtn_charac)
        btnAstra=findViewById(R.id.btnAstra)
        btnBrim=findViewById(R.id.btnBrim)
        btnBreach=findViewById(R.id.btnBreach)
        btnCypher=findViewById(R.id.btnCypher)
        btnJett=findViewById(R.id.btnJett)
        btnKayo=findViewById(R.id.btnKayo)
        btnKill=findViewById(R.id.btnKill)
        btnOmen=findViewById(R.id.btnOmen)
        btnPheonix=findViewById(R.id.btnPheonix)
        btnSage=findViewById(R.id.btnSage)
        btnRaze=findViewById(R.id.btnRaze)
        btnSkye=findViewById(R.id.btnSkye)
        btnReyna=findViewById(R.id.btnReyna)
        btnYoru=findViewById(R.id.btnYoru)
        btnV=findViewById(R.id.btnV)
        btnSova=findViewById(R.id.btnSova)

        btnAstra.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "Astra!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong= MediaPlayer.create(this@characters, R.raw.astra);
            mysong.start();
            val intent1= Intent(this@characters,astra::class.java)
            startActivity(intent1)
        }

        btnBrim.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "Brimstone!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong= MediaPlayer.create(this@characters, R.raw.brim);
            mysong.start();
            val intent2= Intent(this@characters,brim::class.java)
            startActivity(intent2)
        }

        btnBreach.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "Breach!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong= MediaPlayer.create(this@characters, R.raw.breach);
            mysong.start();
            val intent3= Intent(this@characters,breach::class.java)
            startActivity(intent3)
        }

        btnCypher.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "Cypher!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong= MediaPlayer.create(this@characters, R.raw.cypher);
            mysong.start();
            val intent4= Intent(this@characters,cypher::class.java)
            startActivity(intent4)
        }

        btnJett.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "Jett!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong= MediaPlayer.create(this@characters, R.raw.jett);
            mysong.start();
            val intent5= Intent(this@characters,jett::class.java)
            startActivity(intent5)
        }


        btnKayo.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "Kay/o!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong= MediaPlayer.create(this@characters, R.raw.kayo);
            mysong.start();
            val intent6= Intent(this@characters,kayo::class.java)
            startActivity(intent6)
        }

        btnKill.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "Killjoy!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong= MediaPlayer.create(this@characters, R.raw.kj);
            mysong.start();
            val intent7= Intent(this@characters,kill::class.java)
            startActivity(intent7)
        }

        btnOmen.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "Omen!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong= MediaPlayer.create(this@characters, R.raw.om);
            mysong.start();
            val intent8= Intent(this@characters,omen::class.java)
            startActivity(intent8)
        }

        btnPheonix.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "Pheonix!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong= MediaPlayer.create(this@characters, R.raw.pheo);
            mysong.start();
            val intent9= Intent(this@characters,pheo::class.java)
            startActivity(intent9)
        }

        btnSage.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "Sage!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong= MediaPlayer.create(this@characters, R.raw.sge);
            mysong.start();
            val intent10= Intent(this@characters,sage::class.java)
            startActivity(intent10)
        }

        btnRaze.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "Raze!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong= MediaPlayer.create(this@characters, R.raw.raze);
            mysong.start();
            val intent11= Intent(this@characters,raze::class.java)
            startActivity(intent11)
        }

        btnReyna.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "Reyna!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong= MediaPlayer.create(this@characters, R.raw.rey);
            mysong.start();
            val intent12= Intent(this@characters,reyna::class.java)
            startActivity(intent12)
        }

        btnSkye.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "Skye!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong= MediaPlayer.create(this@characters, R.raw.sk);
            mysong.start();
            val intent13= Intent(this@characters,skye::class.java)
            startActivity(intent13)
        }

        btnYoru.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "Yoru!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong= MediaPlayer.create(this@characters, R.raw.yo);
            mysong.start();
            val intent14= Intent(this@characters,yoru::class.java)
            startActivity(intent14)
        }

        btnSova.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "Sova!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong= MediaPlayer.create(this@characters, R.raw.sova);
            mysong.start();
            val intent15= Intent(this@characters,sova::class.java)
            startActivity(intent15)
        }


        btnV.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "Sova!!",
                Toast.LENGTH_SHORT
            ).show()
            mysong= MediaPlayer.create(this@characters, R.raw.vip);
            mysong.start();
            val intent16= Intent(this@characters,viper::class.java)
            startActivity(intent16)
        }


        logBtn_charac.setOnClickListener()
        {
            Toast.makeText(
                this@characters, "HAVE A GOOD DAY!!",
                Toast.LENGTH_SHORT
            ).show()
            val intentL= Intent(this@characters,LoginActivity2::class.java)
            startActivity(intentL)
            finish()
        }
    }
}