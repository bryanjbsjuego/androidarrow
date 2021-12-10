package com.example.sistemaarrow.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sistemaarrow.ContratosAdapter
import com.example.sistemaarrow.R
import com.example.sistemaarrow.io.ApiService
import com.example.sistemaarrow.model.Contrato
import org.w3c.dom.Text
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



class ContratosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contratos)

        val contratos=ArrayList<Contrato>()

        contratos.add(Contrato(1,"7628738","calle lomas",
            "Escavación","09/02/2021","Calle 5","13/12/2021",
            "29/12/2021",11,345.0,120.0,1,1,
            1,1,1))
        contratos.add(Contrato(2,"HOLA","calle lomas",
            "Escavación","09/02/2021","Calle 5","13/12/2021",
            "29/12/2021",11,345.0,120.0,1,1,
            1,1,1))
        contratos.add(Contrato(3,"Bryan","calle lomas",
            "Escavación","09/02/2021","Calle 5","13/12/2021",
            "29/12/2021",11,345.0,120.0,1,1,
            1,1,1))

        val rvContratos=findViewById<RecyclerView>(R.id.rvContratos)
        rvContratos.layoutManager=LinearLayoutManager(this)
        rvContratos.adapter= ContratosAdapter(contratos)





    }

}