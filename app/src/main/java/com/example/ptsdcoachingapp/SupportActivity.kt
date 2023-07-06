package com.example.ptsdcoachingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class SupportActivity : AppCompatActivity() {
    lateinit var support:CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_support)

        support=findViewById(R.id.card1)


        support.setOnClickListener {
            var mycard = Intent(this, GrowyoursupportActivity::class.java)
            startActivity(mycard)
        }
    }
}