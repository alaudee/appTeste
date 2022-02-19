package com.example.apptop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Binding
        val inputName : EditText = findViewById(R.id.inputName)
        val btnChange : Button = findViewById(R.id.btnChange)

        //Function
        btnChange.setOnClickListener {
            alert("Bem-vindo", "Olá" + inputName.text.toString())
        }
    }

    fun alert(title: String, msg: String) {
        //Criando uma fabrica e executando em cadeia os metodos do builder
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(msg)
            .setPositiveButton("ok", null)
            .create()
            .show()
    }
}