package com.example.sistemaarrow.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.sistemaarrow.PreferenceHelper
import com.example.sistemaarrow.PreferenceHelper.set
import com.example.sistemaarrow.R

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        val btn_contratos=findViewById<Button>(R.id.btn_contratos)

        btn_contratos.setOnClickListener {
            //Toast.makeText(this,getString(R.string.please_fill_login), Toast.LENGTH_SHORT).show()
            var lanzar= Intent(this, ContratosActivity::class.java)
            startActivity(lanzar)
        }

        val btn_cerrar=findViewById<Button>(R.id.btn_cerrar)

        btn_cerrar.setOnClickListener {
            clearSessionPreference()
            var lanzar= Intent(this, MainActivity::class.java)
            startActivity(lanzar)
            finish()
        }
    }

    private fun clearSessionPreference(){
        /*val preferences= getSharedPreferences("general", Context.MODE_PRIVATE)
        val editor=preferences.edit()
        editor.putBoolean("session",false)
        editor.apply()*/
        val preferences= PreferenceHelper.defaultPrefs(this)
        preferences["session"]=false
    }
}