package com.example.calculadorafromjavatokt2

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.calculadorafromjavatokt2.R

class MainActivity : AppCompatActivity() {
    private var cifra_01: EditText? = null
    private var cifra_02: EditText? = null
    private var resultado: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cifra_01 = findViewById(R.id.cifra_01)
        cifra_02 = findViewById(R.id.cifra_02)
        resultado = findViewById(R.id.resultado)
    }

    fun sumar(view: View?) {
        val resultadoNumero =
            cifra_01!!.text.toString().toInt() + cifra_02!!.text.toString().toInt()
        resultado!!.text = resultadoNumero.toString() + ""
        Log.d("operacionSuma", "Boton suma apretado")
    }

    fun restar(view: View?) {
        val resultadoNumero =
            cifra_01!!.text.toString().toInt() - cifra_02!!.text.toString().toInt()
        resultado!!.text = resultadoNumero.toString() + ""
        Log.d("operacionResta", "Boton resta apretado")
    }

    fun multiplicar(view: View?) {
        val resultadoNumero =
            cifra_01!!.text.toString().toInt() * cifra_02!!.text.toString().toInt()
        resultado!!.text = resultadoNumero.toString() + ""
        Log.d("operacionMult", "Boton multiplicacion apretado")
    }

    fun dividir(view: View?) {
        val resultadoNumero =
            cifra_01!!.text.toString().toInt() / cifra_02!!.text.toString().toInt()
        resultado!!.text = resultadoNumero.toString() + ""
        Log.d("operacionDiv", "Boton division apretado")
    }
}