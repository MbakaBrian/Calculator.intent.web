package com.example.calculatorintelweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var Buttoncalc:Button ?= null
    var ButtonIntent:Button ?= null
    var ButtonWeb:Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Buttoncalc=findViewById(R.id.calculator)
        ButtonIntent=findViewById(R.id.intent)
        ButtonWeb=findViewById(R.id.Web)

        Buttoncalc!!.setOnClickListener {
        val intent= Intent(this,calculator_activity::class.java)
            startActivity(intent)
        }

        ButtonIntent!!.setOnClickListener {
            val intent=Intent(this,intent_activity::class.java)
            startActivity(intent)
        }
        ButtonWeb!!.setOnClickListener {
        val intent=Intent(this,Web_activity::class.java)
            startActivity(intent)
        }
    }
}