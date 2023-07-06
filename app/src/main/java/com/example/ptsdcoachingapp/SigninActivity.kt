package com.example.ptsdcoachingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SigninActivity : AppCompatActivity() {

    lateinit var myemail: EditText
    lateinit var mypassword: EditText
    lateinit var myconfpassword: EditText
    lateinit var signup: Button
    lateinit var mylogin: TextView
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

           myemail = findViewById(R.id.email)
            mypassword = findViewById(R.id.password)
            myconfpassword = findViewById(R.id.confirm_password)
            signup = findViewById(R.id.button)
            mylogin = findViewById(R.id.textview)
            auth = Firebase.auth

            mylogin.setOnClickListener {
                val intent = Intent(this,LoginActivity::class.java)
                startActivity(intent)
                finish()
            }

            signup.setOnClickListener {
                SignUpUser()
            }
        }

        private fun SignUpUser(){
            val email=myemail.text.toString()
            val pass= mypassword.text.toString()
            val confirmpass= myconfpassword.text.toString()

            if (email.isBlank()|| pass.isBlank() ||confirmpass.isBlank()){
                Toast.makeText(this,"Email and password cant be blank", Toast.LENGTH_SHORT).show()
                return

            } else if (pass != confirmpass){
                Toast.makeText(this, "Password does not match", Toast.LENGTH_SHORT).show()
                return
            }
            auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this){
                if (it.isSuccessful){
                    Toast.makeText(this,"Signed up successful", Toast.LENGTH_SHORT).show()

                }else{
                    Toast.makeText(this,"Failed to create", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
