package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewRolledDice: TextView =findViewById(R.id.textViewRolledDice)
        val rollbutton: Button =findViewById(R.id.rollbutton)

        rollbutton.setOnClickListener{
            Toast.makeText(this, "zar atildi", Toast.LENGTH_LONG).show()
        }
    }
}