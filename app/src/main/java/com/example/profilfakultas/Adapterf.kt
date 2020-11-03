package com.example.profilfakultas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fakultas.view.*

class Adapterf (val itemFakultas: List<DataCl>, val clickListener: (DataCl) -> Unit) :
        RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.fakultas, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(itemFakultas[position], clickListener)
    }

    override fun getItemCount() = itemFakultas.size
    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: DataCl, clickListener: (DataCl) -> Unit) {
            itemView.imgFakultas.setImageResource(data.gbr)
            itemView.nameList.text = data.nama
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}
