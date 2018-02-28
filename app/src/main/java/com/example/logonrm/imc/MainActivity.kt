package com.example.logonrm.imc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btCalcular.setOnClickListener {
            val telaResultado = Intent(this, ResultadoActivity::class.java)

            telaResultado.putExtra("PESO",
                tvPeso.editText?.text.toString())

            telaResultado.putExtra("ALTURA",
                tvAltura.editText?.text.toString())

            startActivity(telaResultado)
        }

        btLimpar.setOnClickListener {
            tvAltura.editText?.setText("")
            tvPeso.editText?.setText("")
            tvPeso.requestFocus()
        }
    }
}
