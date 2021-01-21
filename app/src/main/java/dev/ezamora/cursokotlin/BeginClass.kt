package dev.ezamora.cursokotlin

import android.util.Log



class BeginClass {
    val TAG = ":::TAG"

     fun variableAndconstante(){
        var myFirstVariable = "Hellow World!"
        val myFirstConstant = "Hellow Constante"
        // myFirstConstant="ddd";
        Log.d(TAG,myFirstVariable)

    }

     fun typeOfdata(){
        val seconValue = 3
        val firstValue = 6
        val suma: Int = firstValue + seconValue
        val resta: Int = firstValue - seconValue
        val mult: Int = firstValue * seconValue
        val div: Int = firstValue / seconValue
        val resto: Int = firstValue % seconValue

        //para comvertir una variable string $

        Log.d(TAG,"el resultado es $div" )

    }

    private fun nullSafety(){
        val nullString : String?=null

        if (nullString!= null){

        }

        nullString.let {
            if (nullString != null) {
                Log.d(TAG,nullString)
            }
        }?: kotlin.run {
            if (nullString != null) {
                Log.d(TAG,nullString)
            }
        }
    }


    private fun sumFuction (x: Int,y: Int): Int {
        return x+y;
    }


}