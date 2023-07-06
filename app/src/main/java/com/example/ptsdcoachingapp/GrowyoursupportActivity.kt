package com.example.ptsdcoachingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class GrowyoursupportActivity : AppCompatActivity() {
    lateinit var card1:CardView
    lateinit var card2:CardView
    lateinit var card3:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_growyoursupport)

        card1=findViewById(R.id.cardtrust)
        card2=findViewById(R.id.cardalone)
        card3=findViewById(R.id.cardgrow)


        card1.setOnClickListener {
            var mycard = Intent(this, TrustActivity::class.java)
            startActivity(mycard)
        }

        card2.setOnClickListener {
            var mycard1 = Intent(this, AloneActivity::class.java)
            startActivity(mycard1)
        }

        card3.setOnClickListener {
            var mycard2 = Intent(this, GrowActivity::class.java)
            startActivity(mycard2)
        }

    }
}