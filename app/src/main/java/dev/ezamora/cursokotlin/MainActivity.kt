package dev.ezamora.cursokotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    val TAG = ":::TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val beginClass = BeginClass()
        beginClass.variableAndconstante();
        beginClass.typeOfdata();
        beginClass.clases()
        Log.d(TAG,"*******************************************")
        val retoFirst= RetoFirts()
        retoFirst.retornaRetoFirst()
        val exersice= Exercise()
        exersice.calculo()
        Log.d(TAG,"*******************************************")
        val conditions= Conditionals()
        conditions.conditionalIf()
        conditions.coditionalWhen()
        conditions.conditionalFor()
        Log.d(TAG,"*******************************************")
        val retoSecond = RetoSecond()
//        condicionalesIf()
//        condicionalesWhen()
//        listados()
//        bucleFor()
//        bucleWhile()
//        bucleDoWhile()
//        controlDeErrores()
        retoSecond.botDeSeguridad()



    }

    private fun condicionalesIf() {
        val firstNumber = 10
        val secondNumber = 5
        val booleanValue = false

        if (firstNumber < secondNumber) {
            Log.d(TAG, "Primera opcion")

            if (secondNumber == 4) {
            } else {
            }
        } else if (booleanValue) {
            Log.d(TAG, "Segunda opcion")
        } else if (booleanValue) {
            Log.d(TAG, "Segunda opcion")
        } else if (booleanValue) {
            Log.d(TAG, "Segunda opcion")
        } else {
            Log.d(TAG, "Tercera opcion")
        }

        val edad: Int = if (!booleanValue) {
            17
        } else {
            26
        }

        Log.d(TAG, edad.toString())
    }

    private fun condicionalesWhen() {
//        val language = "Scala"
//
//        when (language) {
//            "Kotlin", "Scala" -> {
//                Log.d(TAG, "Se ha seleccionado Kotlin")
//            }
//            "Java" -> Log.d(TAG, "Se ha seleccionado Java")
//            "Python" -> Log.d(TAG, "Se ha seleccionado Python")
//            "Ruby" -> Log.d(TAG, "Se ha seleccionado Ruby")
//            else -> Log.d(TAG, "Se ha seleccionado otro lenguaje")
//        }

        val myNumber = 94
        when (myNumber) {
            in 0..10 -> {
                Log.d(TAG, "Se ha seleccionado Kotlin")
            }
            40 -> {
                Log.d(TAG, "Se ha seleccionado Java")
            }
            in 80..119 -> {
                Log.d(TAG, "Se ha seleccionado Python")
            }
            120 -> {
                Log.d(TAG, "Se ha seleccionado Ruby")
            }
            else -> Log.d(TAG, "Se ha seleccionado otro lenguaje")
        }
    }

    private fun listados() {
        val myList = listOf("Rodrigo", "Raquel", "David", "Lorena", "Allison")
        val myArrayList = arrayListOf("Rodrigo", "Raquel", "David", "Lorena", "Allison")

        val listItem = myList[2]

        myArrayList[2] = "Sandra"
        val arrayListItem = myArrayList[2]

        myArrayList.removeAt(3)

        Log.d(TAG, myArrayList.toString())
    }

    private fun bucleFor() {
        val myArrayList = arrayListOf("Rodrigo", "Raquel", "David", "Lorena", "Allison")

//        for (persona in myArrayList) {
//            Log.d(TAG, persona)
//        }

//        for (position in 0 until 5) {
//            Log.d(TAG, position.toString())
//        }

//        for (position in 0..10 step 3) {
//            Log.d(TAG, position.toString())
//        }

        for (position in 10 downTo 3 step 2) {
            Log.d(TAG, position.toString())
        }
    }

    private fun bucleWhile() {
        var myNumber = 0

        while (myNumber <= 10) {
            Log.d(TAG, myNumber.toString())
            myNumber += 3
        }
    }

    private fun bucleDoWhile() {
        var myNumber = 1

        do {
            Log.d(TAG, myNumber.toString())
            myNumber++
        } while (myNumber <= 10)
    }

    private fun controlDeErrores() {
        val myArrayList = arrayListOf(1, 2, 3, 4, 5)
        val myString: String = "Hola"

        try {
            for (position in 0..myArrayList.size) {
                Log.d(TAG, myString)
            }
        } catch (exception: Exception) {
            exception.printStackTrace()
            Log.d(TAG, "Catch")
        } finally {
            Log.d(TAG, "Finally")
        }
    }





}