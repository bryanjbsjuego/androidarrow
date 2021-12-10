package com.example.sistemaarrow.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.sistemaarrow.PreferenceHelper
import com.example.sistemaarrow.R
import com.example.sistemaarrow.PreferenceHelper.get
import com.example.sistemaarrow.PreferenceHelper.set

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //peferences para persisitir datos


        val btn_login=findViewById<Button>(R.id.btn_login)

        //val preferences= getSharedPreferences("general",Context.MODE_PRIVATE)

        //val session=preferences.getBoolean("session",false)

       val preferences= PreferenceHelper.defaultPrefs(this)

        if(preferences["session",false]){
            //Validar los datos del usuario antes de iniciar sesión
            goToMenuActivity()
        }

        btn_login.setOnClickListener {

            createSessionPreference()
            goToMenuActivity()

        }
    }

    private fun createSessionPreference(){
        /*val preferences= getSharedPreferences("general",Context.MODE_PRIVATE)
        val editor=preferences.edit()
        editor.putBoolean("session",true)
        editor.apply()*/
        val preferences= PreferenceHelper.defaultPrefs(this)
        preferences["session"]=true
    }

    private fun goToMenuActivity(){
        var lanzar= Intent(this, MenuActivity::class.java)
        startActivity(lanzar)
        finish()
    }
}