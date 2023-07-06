package com.example.ptsdcoachingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class LearnMainActivity : AppCompatActivity() {

    lateinit var card1: CardView
    lateinit var card2: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_main)

        card1=findViewById(R.id.card1)
        card2=findViewById(R.id.card2)


        card1.setOnClickListener {
            var card1 = Intent(this, LearnActivity::class.java)
            startActivity(card1)

        }
        card2.setOnClickListener {
            var card2 = Intent(this, GetprofhelpActivity::class.java)
            startActivity(card2)
        }
    }
}