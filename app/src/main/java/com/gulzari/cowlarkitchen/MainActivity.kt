package com.gulzari.cowlarkitchen

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        setTheme(R.style.AppTheme)

        val startersCard = findViewById<CardView>(R.id.card_view_starters)
        val mainsCard = findViewById<CardView>(R.id.card_view_mains)
        val dessertsCard = findViewById<CardView>(R.id.card_view_desserts)

        startersCard.setOnClickListener{

            val startersActivityIntent = Intent(this@MainActivity, StarterActivity::class.java)
            startActivity(startersActivityIntent)
        }

        mainsCard.setOnClickListener{

            val mainCoursesActivityIntent = Intent(this@MainActivity, MainCoursesActivity::class.java)
            startActivity(mainCoursesActivityIntent)
        }

        val emailTextView = findViewById<TextView>(R.id.text_view_email_address)
        emailTextView.setOnClickListener{
            val launchEmailAppIntent = Intent(Intent.ACTION_SENDTO)
            launchEmailAppIntent.data = Uri.parse("mailto:muhammad.mujtaba.cowlar@gmail.com")
            startActivity(launchEmailAppIntent)
        }


        dessertsCard.setOnClickListener{

            val dessertsActivityIntent = Intent(this@MainActivity, DesertsActivity::class.java)
            startActivity(dessertsActivityIntent)
        }
    }
}