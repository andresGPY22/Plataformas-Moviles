package com.example.pruebaparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView
import android.widget.Toast;
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_ventana2.*

class Ventana2 : AppCompatActivity() {

    private var seleccion:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana2)

        val generos:Spinner = findViewById(R.id.spinner1)
        val razas:Spinner= findViewById(R.id.spinner2)
        val tipocalculo:Spinner = findViewById(R.id.spinner3)
        val listageneros = arrayOf("Genero", "Macho", "Hembra")
        val listarazas = arrayOf("Raza", "Mini toy", "Pequeña", "Mediana", "Grande", "Gigante")
        val listacalculo = arrayOf("Tipo calculo", "Calculo Hembra", "Calculo Macho")

        var adaptor1: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_spinner_item,listageneros)
        generos?.adapter=adaptor1

        var adaptor2: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_spinner_item,listarazas)
        razas?.adapter=adaptor2

        var adaptor3: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_spinner_item,listacalculo)
        tipocalculo?.adapter=adaptor3



        button4.setOnClickListener{
            var saltar: Intent = Intent(this, Procesar::class.java)

            var nombre:String=id_nombre.text.toString()
            var Peso=id_peso.text.toString()
            var peso:Int = Integer.parseInt(Peso)
            var Hombro=id_hombro.text.toString()
            var hombro:Int = Integer.parseInt(Hombro)
            var Cola=id_cola.text.toString()
            var cola:Int = Integer.parseInt(Cola)


            saltar.putExtra("nombre",nombre)
            saltar.putExtra("peso",peso)
            saltar.putExtra("hombro",hombro)
            saltar.putExtra("cola",cola)
            startActivity(saltar)

        }





    }
}