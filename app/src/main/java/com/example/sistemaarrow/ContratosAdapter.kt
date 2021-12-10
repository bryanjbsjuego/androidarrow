package com.example.sistemaarrow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sistemaarrow.model.Contrato



class ContratosAdapter(private val contratos: ArrayList<Contrato>) : RecyclerView.Adapter<ContratosAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val tvcontrato: TextView
        val tvnombreobra: TextView
        val tvubicacion: TextView
        val tvdescripcion: TextView
        val tvfechaalta: TextView


        init {
            // Define click listener for the ViewHolder's View.
            tvcontrato = itemView.findViewById(R.id.tvcontrato)
            tvnombreobra = itemView.findViewById(R.id.tvnombreobra)
            tvubicacion = itemView.findViewById(R.id.tvubicacion)
            tvdescripcion=itemView.findViewById(R.id.tvdescripcion)
            tvfechaalta=itemView.findViewById(R.id.tvfechaalta)


        }

    }
    //Crear un viewholder y regresar un objeto de la clase, inflar el xml
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_contrato,parent,false)
        )
    }
    //Enlazar la data que tenemos en el dataset con la vista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contrato=contratos[position]
        holder.tvcontrato.text =contrato.contrato.toString()
        holder.tvnombreobra.text=contrato.nombre_obra.toString()
        holder.tvubicacion.text=contrato.ubicacion.toString()
        holder.tvdescripcion.text=contrato.descripcion.toString()
        holder.tvfechaalta.text=contrato.fecha_alta.toString()

    }
    //Devolver la cantidad de elementos
    override fun getItemCount(): Int = contratos.size

}