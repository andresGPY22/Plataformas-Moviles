package com.example.taller1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        determinarEdad()
        tablas()
        listado()
        vehiculos()
        IVA()
        validarCedula()
    }

    fun determinarEdad(){
        println("-----Determinar edad-----")
        val edad = 18

        if(edad<18){
            println("usted es menor de edad")
        }else{
            println("usted es mayor de edad")
        }
    }

    fun tablas(){
        println("-----Tablas de multiplicar-----")
        val numero = 5
        println("-------------Ascendente---------------")
        for(i in 1..10) {
            val resultado1 = numero * i
            val resultado2 = String.format("%s%s%s%s%s", numero, " * ", i, " = ", resultado1)
            println(resultado2)
        }
        println("-------------Descendente---------------")
        for (i in 10 downTo 1){
            val resultado1= numero * i
            val resultado2 = String.format("%s%s%s%s%s",numero," * ",i," = ",resultado1)
            println(resultado2)
        }

    }

    fun listado(){
        println("-----Listado de Plataformas Moviles-----")
        val listas = listOf<String>("Andrés","Joselito","Carlos",
            "Romel", "Diego","Samaniego","Lucy","Maria Antonieta de las Nieves")

        val ordenar = listas.sorted()
        println("Listado de Estudiantes")
        for (listas in ordenar){
            println(listas)
        }
        val grupos = mutableMapOf("Andrés" to "P1","Joselito" to "P2",
            "Carlos" to "P1", "Romel" to "P2", "Diego" to "5",
            "Samaniego" to "P2", "Lucy" to "P2", "Maria Antonieta de las Nieves" to "P1")

        val ordenGrupo = grupos.toSortedMap()
        println("Listado de Estudiantes por Proyectos")
        for (i in ordenGrupo ){
            println("${i.key} - ${i.value}")
        }

    }

    fun vehiculos(){
        println("-----Propiedades de un vehículo-----")
        val car =NewClass(arrayOf(NewClass.traction.Delantera),motor = "El motor es: V6",tipo=" El tipo de vehiculo es: Motorizado",
            capacidad="La capacidad del vehiculo es: 6 personas")
        car.vehiculo()
        println(car.motor)
        println(car.tipo)
        println(car.capacidad)
    }

    fun IVA(){
        println("-----Cálculo del IVA-----")
        val precio = 10
        val iva = precio * 0.12
        val total = precio + iva
        println("El precio es de: " + precio + "\nEl iva es de: " + iva +
                "\n El valor total a pagar es de: " + total)
    }


    fun validarCedula(){
        println("-----Validación de cédula-----")
        val cedula = arrayListOf<Int>(1,1,5,0,6,2,0,0,7,6)
        var total = 0
        var cont = 0
        val final = cedula.last()
        for (x in cedula.indices){
            cont = cedula[x]
            if (x % 2 == 0){
                cont = (cedula[x] * 2)
                if (cont > 9){
                    cont = cont - 9
                }
                total = total + cont
            } else {
                total = total + cont
            }
        }
        total = total - final
        val primero = total.toString().substring(0,1)
        val decimo = (primero.toInt() + 1) * 10
        if (decimo - total == final || decimo - total == 10){
            println("La cedula es valida")
        }else{
            println("La cedula no es valida")
        }
    }
}