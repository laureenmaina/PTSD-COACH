package com.example.ptsdcoachingapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable

class LearnActivity : AppCompatActivity() {

    lateinit var card1:CardView
    lateinit var card2:CardView
    lateinit var card3:CardView
    lateinit var card4:CardView
    lateinit var card5:CardView
    lateinit var card6:CardView
    lateinit var card7:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)


        card1 = findViewById(R.id.card1)
        card2 = findViewById(R.id.card2)
        card3 = findViewById(R.id.card3)
        card4 = findViewById(R.id.card4)
        card5 = findViewById(R.id.card5)
        card6 = findViewById(R.id.card6)
        card7 = findViewById(R.id.card7)



        card1.setOnClickListener {
            var card1 = Intent(this, quiz1Activity::class.java)
            startActivity(card1)

        }
        card2.setOnClickListener {
            var card2 = Intent(this, quiz2Activity::class.java)
            startActivity(card2)
        }

        card3.setOnClickListener {
            var card3 = Intent(this, quiz3Activity::class.java)
            startActivity(card3)
        }
        card4.setOnClickListener {
            var card4 = Intent(this, quiz4Activity::class.java)
            startActivity(card4)
        }
        card5.setOnClickListener {
            var card5 = Intent(this, quiz5Activity::class.java)
            startActivity(card5)
        }
        card6.setOnClickListener {
            var card6 = Intent(this, quiz6Activity::class.java)
            startActivity(card6)
        }
        card7.setOnClickListener {
            var card7 = Intent(this, quiz7Activity::class.java)
            startActivity(card7)
        }
    }}