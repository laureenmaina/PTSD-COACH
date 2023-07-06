package com.example.ptsdcoachingapp


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button



class CrisisResourceActivity : AppCompatActivity() {

    lateinit var call1:Button
    lateinit var call2:Button
    lateinit var call3:Button
    lateinit var call4:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crisis_resource)


        call1 = findViewById(R.id.btncall1)
        call2 = findViewById(R.id.btncall2)
        call3 = findViewById(R.id.btncall3)
        call4 = findViewById(R.id.btncall4)

        call1.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "911")
            startActivity(dialIntent)
        }

        call2.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0800723253")
            startActivity(dialIntent)
        }

        call3.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0800720308")
            startActivity(dialIntent)
        }

        call4.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0900620800")
            startActivity(dialIntent)
        }

        val buttoncontacts= findViewById<Button>(R.id.add_button)
        buttoncontacts.setOnClickListener {
            val intent=Intent(Intent.ACTION_PICK,ContactsContract.Contacts.CONTENT_URI)
            startActivity(intent)
        }


    }}