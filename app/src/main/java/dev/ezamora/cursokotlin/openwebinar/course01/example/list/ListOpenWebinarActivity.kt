package dev.ezamora.cursokotlin.openwebinar.course01.example.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import dev.ezamora.cursokotlin.R
import dev.ezamora.cursokotlin.openwebinar.course01.model.CarModel
import kotlinx.android.synthetic.main.activity_list_open_webinar.*

class ListOpenWebinarActivity : AppCompatActivity() {

    private var carList: MutableList<CarModel> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_open_webinar)
        initCarList()
        mainList.layoutManager = LinearLayoutManager(this)
        mainList.adapter = CustomCarAdapter(carList, object: CustomCarAdapter.CustomListener {
            override fun clickOnCarItem(carModel: CarModel) {
                Toast.makeText(this@ListOpenWebinarActivity,
                    "Click: " + carModel.brand,
                    Toast.LENGTH_SHORT).show()
            }

            override fun longClickOnCarItem(carModel: CarModel) {
                Toast.makeText(this@ListOpenWebinarActivity,
                    "LongClick: " + carModel.brand,
                    Toast.LENGTH_SHORT).show()
            }

        })
    }


    private fun initCarList() {
        carList = (1..100).map {
            CarModel("Marca" + it.toString(), it.toString())
        }.toMutableList()
    }

}