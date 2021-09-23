package com.example.bookhub

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.app.*

class PAGE_FIRST : AppCompatActivity() {
    var tile_new: String? = "name"

    lateinit var etNAME: EditText
    lateinit var etid: EditText
    lateinit var btnONE: Button
    lateinit var btntwo: Button
    lateinit var drawer_layout: DrawerLayout
    lateinit var nav_view: NavigationView
    lateinit var toolbar: Toolbar
    lateinit var intentD: Intent
    lateinit var intentM:Intent
    lateinit var intentL:Intent
    lateinit var intentI:Intent



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app)

        drawer_layout=findViewById(R.id.drawer_layout)
        nav_view=findViewById(R.id.nav_view)
        toolbar=findViewById(R.id.tool)





        nav_view.bringToFront()
        val actionBar=supportActionBar
        actionBar?.title="Valopedia->Home"
        val toggle=ActionBarDrawerToggle(this,drawer_layout,toolbar,R.string.open,R.string.close)
        toggle.isDrawerIndicatorEnabled=true
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        nav_view.setCheckedItem(R.id.nav_home)
        nav_view.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.nav_home -> {


                    Toast.makeText(this@PAGE_FIRST, "HOME PAGE IS HERE", Toast.LENGTH_SHORT)
                        .show()
                }
                R.id.nav_about -> {

                    Toast.makeText(this@PAGE_FIRST, "ABOUT PAGE IS HERE", Toast.LENGTH_SHORT)
                        .show()
                }
                R.id.nav_menu -> {
                    intentM = Intent(this@PAGE_FIRST, menu::class.java)
                    startActivity(intentM)
                    Toast.makeText(this@PAGE_FIRST, "MENU PAGE IS HERE", Toast.LENGTH_SHORT)
                        .show()
                }
                R.id.nav_log -> {
                    intentL = Intent(this@PAGE_FIRST, LOGIN::class.java)
                    startActivity(intentL)
                    Toast.makeText(this@PAGE_FIRST, "HAVE A GOOD DAY", Toast.LENGTH_SHORT)
                        .show()
                }
                R.id.nav_profile -> {
                    intentD = Intent(this@PAGE_FIRST, devlp::class.java)
                    startActivity(intentD)
                    Toast.makeText(this@PAGE_FIRST, "MY PROFILE IS HERE", Toast.LENGTH_SHORT)
                        .show()
                }
                R.id.nav_connect ->
                    Toast.makeText(this@PAGE_FIRST, "LET'S CONNECT", Toast.LENGTH_SHORT)
                        .show()
                R.id.nav_indian -> {
                    intentI = Intent(this@PAGE_FIRST, hindi::class.java)
                    startActivity(intentI)
                    Toast.makeText(this@PAGE_FIRST, "INDIAN STREAMERS PAGE", Toast.LENGTH_SHORT)
                        .show()
                }
                R.id.nav_foreign ->
                    Toast.makeText(this@PAGE_FIRST, "FOREIGN STREAMERS PAGE", Toast.LENGTH_SHORT)
                        .show()
            }

            return@setNavigationItemSelectedListener true


        }

        if (intent != null) {
            tile_new = intent.getStringExtra("name")
        }
        title = tile_new

        etNAME= findViewById(R.id.etNAME)
        etid= findViewById(R.id.etid)
        btnONE= findViewById(R.id.btnONE)
        btntwo = findViewById(R.id.btntwo)

        btnONE.setOnClickListener {
            if(TextUtils.isEmpty(etNAME.getText())){
                Toast.makeText(
                    this@PAGE_FIRST, "PLEASE ENTER YOUR NAME!!",
                    Toast.LENGTH_SHORT
                ).show()

                etNAME.setError( "YOUR NAME IS REQUIRED!" )
            }
            else if(TextUtils.isEmpty(etid.getText())){
                Toast.makeText(
                    this@PAGE_FIRST, "PLEASE ENTER YOUR ID!!",
                    Toast.LENGTH_SHORT
                ).show()

                etid.setError( "YOUR ID IS REQUIRED" )
            }
            else
            {
                Toast.makeText(
                    this@PAGE_FIRST, "WE WELCOME YOU!!",
                    Toast.LENGTH_SHORT
                ).show()
                val message = etNAME.text.toString()
                val message1 =etid.text.toString()


                val intent = Intent(this@PAGE_FIRST, message_screen::class.java)


                intent.putExtra("Message", message)
                intent.putExtra("Message1", message1)

                startActivity(intent)

            }
        }
        btntwo.setOnClickListener {
            Toast.makeText(
                this@PAGE_FIRST, "HAVE A GOOD DAY!!",
                Toast.LENGTH_SHORT
            ).show()
            val intent1= Intent(this@PAGE_FIRST,LOGIN::class.java)
            startActivity(intent1)
            finish()
        }

    }
    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}
