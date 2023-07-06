package com.example.ptsdcoachingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class ManagesympActivity : AppCompatActivity() {

    lateinit var sound1:Button
    lateinit var sound2:Button
    lateinit var sound3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_managesymp)


        sound1=findViewById(R.id.btnman2)
        sound2=findViewById(R.id.btnman3)
        sound3=findViewById(R.id.btnman4)




        sound1.setOnClickListener {
            var sound1 = Intent(this, MainFragments::class.java)
            startActivity(sound1)
        }
        sound2.setOnClickListener {
            var sound1 = Intent(this, BreathActivity::class.java)
            startActivity(sound1)
        }
        sound3.setOnClickListener {
            var sound1 = Intent(this, QuotesActivity::class.java)
            startActivity(sound1)
        }





    }
}