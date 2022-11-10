package com.example.pruebaparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_procesar.*

class Procesar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_procesar)
        val extras = intent.extras
        val nombres = extras?.getString("nombre")?:"sin nombre"
        val pesos = extras?.getInt("peso")?:-1
        val hombros = extras?.getInt("hombro")?:-1
        val colas = extras?.getInt("cola")?:-1
        val caculos= hombros + colas + pesos

        tvnombre.setText("El IMC de " + nombres +"es: ")
        tvcalculototal.setText("= " )

        /*if (edad< 18) {
            var mensajeEdad = "Usted es menor de edad"
            tvedad.setText(mensajeEdad)
        }else{
            var mensajeEdad = "Usted es mayor de edad"
            tvedad.setText(mensajeEdad)
        }*/



        button5.setOnClickListener{
            val saltar: Intent = Intent(this, MainActivity::class.java)
            startActivity(saltar)
        }
    }



}