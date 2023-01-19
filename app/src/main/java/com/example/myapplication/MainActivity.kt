package com.example.myapplication
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnShow.setOnClickListener{
            Log.i("MainActivity", "Button WAs Clicked!")
            Toast.makeText(this,"Button Was Clicked!",Toast.LENGTH_SHORT).show()

        }

        btnSentMessage.setOnClickListener{
                 val message : String = editUserMessage.text.toString()
                 val intent = Intent(this,SecondActivity:: class.java)
            intent.putExtra("user_message",message)
            startActivity(intent)
        }





        }
    }
