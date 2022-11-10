package com.example.pruebaparcial

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener{
            var saltar: Intent = Intent(this, Ventana2::class.java)
            startActivity(saltar)
        }
        button2.setOnClickListener{
            var saltar: Intent = Intent(this, Ventana2::class.java)
            startActivity(saltar)
        }
        button3.setOnClickListener{
            var saltar: Intent = Intent(this, Ventana2::class.java)
            startActivity(saltar)
        }
    }
}