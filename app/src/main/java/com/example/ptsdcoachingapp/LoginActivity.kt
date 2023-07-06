package com.example.ptsdcoachingapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var signup: TextView
    lateinit var myemail: EditText
    private lateinit var login: Button
    private lateinit var mypassword1: EditText
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


            myemail = findViewById(R.id.email1)
            mypassword1 = findViewById(R.id.password1)
            login = findViewById(R.id.button1)
            signup = findViewById(R.id.text1)

            auth = FirebaseAuth.getInstance()

            login.setOnClickListener {
                login()
            }

            signup.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        private fun login(){
            val email=myemail.text.toString()
            val pass=mypassword1.text.toString()

            auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this){
                if (it.isSuccessful){
                    Toast.makeText(this,"Successfully loggedIn", Toast.LENGTH_LONG).show()
                    val intent= Intent(this, DashboardActivity::class.java)
                    startActivity(intent)
                } else
                    Toast.makeText(this,"Log in failed", Toast.LENGTH_LONG).show()
            }
        }
    }
