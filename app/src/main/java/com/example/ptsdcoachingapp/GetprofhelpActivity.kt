package com.example.ptsdcoachingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GetprofhelpActivity : AppCompatActivity() {

    lateinit var button:Button
    lateinit var button2:Button
    lateinit var button3:Button
    lateinit var button4:Button
    lateinit var button5:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getprofhelp)


        button=findViewById(R.id.btnget)
        button2=findViewById(R.id.btnget1)
        button3=findViewById(R.id.btnget2)
        button4=findViewById(R.id.btnget3)
        button5=findViewById(R.id.btnget4)

        button.setOnClickListener {
            var card2 = Intent(this, CrisisResourceActivity::class.java)
            startActivity(card2)
        }

        button2.setOnClickListener {
            var card3 = Intent(this, NeedActivity::class.java)
            startActivity(card3)
        }

        button3.setOnClickListener {
            var card4 = Intent(this, SeekActivity::class.java)
            startActivity(card4)
        }

        button4.setOnClickListener {
            var card5 = Intent(this, HelpActivity::class.java)
            startActivity(card5)
        }

        button5.setOnClickListener {
            var card6 = Intent(this, EmbarassedActivity::class.java)
            startActivity(card6)
        }


    }
}