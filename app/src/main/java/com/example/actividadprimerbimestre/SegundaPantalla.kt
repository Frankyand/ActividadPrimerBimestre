package com.example.actividadprimerbimestre

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SegundaPantalla : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segunda_pantalla)

        val btnRegresar = findViewById<Button>(R.id.btRegresar)

        btnRegresar.setOnClickListener {
            finish()
        }
    }
}