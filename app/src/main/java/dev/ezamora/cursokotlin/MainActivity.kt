package dev.ezamora.cursokotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import dev.ezamora.cursokotlin.google.calculator.CalculatorActivity
import dev.ezamora.cursokotlin.google.dice.DiceActivity
import dev.ezamora.cursokotlin.openwebinar.course01.exampleList.ListOpenWebinarActivity
import dev.ezamora.cursokotlin.openwebinar.course01.basic.BasicConcept
import dev.ezamora.cursokotlin.openwebinar.course01.basic.Colecciones
import dev.ezamora.cursokotlin.openwebinar.course01.basic.Extenciones

import dev.ezamora.cursokotlin.openwebinar.course01.basic.ClassAndConstructor
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    val TAG = ":::TAG"
    var classAndConstructor = ClassAndConstructor();
    var basicConcept = BasicConcept();
    var extenciones = Extenciones();
    var colleciones = Colecciones();


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //label.text = "holiii desde clase mainActivity"

        val btnListOpenWebinar: Button = findViewById(R.id.btnListOpenWebinar)
        val btnDice: Button = findViewById(R.id.btnDice)
        val btnCalculator: Button = findViewById(R.id.btnCalculator)

        btnListOpenWebinar.setOnClickListener(this)
        btnDice.setOnClickListener(this)
        btnCalculator.setOnClickListener(this)

    }


    private fun basicConcept() {
        //  classAndConstructor.main()
        //  basicConcept.main()
        //extenciones.main()
        // colleciones.main()

    }

    override fun onClick(v: View?) {
        if (v != null) {
            if (v.id == btnListOpenWebinar.id) {
                //Toast.makeText(this, "HOliiiii", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, ListOpenWebinarActivity::class.java).apply {
                }
                startActivity(intent)
            }
            if (v.id == btnDice.id) {
                val intent = Intent(this, DiceActivity::class.java).apply { }
                startActivity(intent)
            }
            if (v.id == btnCalculator.id) {
                val intent = Intent(this, CalculatorActivity::class.java).apply {}
                startActivity(intent)
            }
        }

    }


}


