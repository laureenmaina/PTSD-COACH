package com.example.ptsdcoachingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {
    lateinit var card1:CardView
    lateinit var card2:CardView
    lateinit var card3:CardView
    lateinit var card4:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        card1=findViewById(R.id.cardLearn)
        card2=findViewById(R.id.cardSupport)
        card3=findViewById(R.id.cardCrisis)
        card4=findViewById(R.id.cardAbout)



        card1.setOnClickListener {
            var mycard = Intent(this, LearnMainActivity::class.java)
            startActivity(mycard)
        }

        card2.setOnClickListener {
            var mycard1 = Intent(this, SupportActivity::class.java)
            startActivity(mycard1)
        }

        card3.setOnClickListener {
            var mycard3 = Intent(this, ManagesympActivity::class.java)
            startActivity(mycard3)
        }

        card4.setOnClickListener {
            var mycard4 = Intent(this, AboutActivity::class.java)
            startActivity(mycard4)
        }

    }
}