package com.example.examen_parcial1_21133

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private  var Boton_Comprar: Button? = null
    private  var Imagen: ImageView? = null
    private var pie: Button? = null
    private var spinner: Spinner? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val funciones = ArrayAdapter.createFromResource(
            this,
            R.array.Funciones,
            android.R.layout.simple_spinner_item
        )
        funciones.setDropDownViewResource(android.R.layout.simple_spinner_item)
        inicializarVistas()
        clickeos()
    }

    private fun inicializarVistas() {
        Boton_Comprar = findViewById(R.id.button5)
        pie = findViewById(R.id.buttonPIE)
        spinner = findViewById(R.id.spinnerpelis)
        Imagen = findViewById(R.id.imageView)
    }
    private fun clickeos(){
        Boton_Comprar?.setOnClickListener(this)
        pie?.setOnClickListener(this)
        Imagen?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.buttonPIE -> {
                finish()
            }
            R.id.imageView -> {
                Imagen?.setImageResource(R.drawable.modok)
            }
        }
    }
}