package com.example.tugas_retrofite

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas_retrofite.databinding.ItemDoaBinding
import com.example.tugas_retrofite.model.Doa

class DoaAdapter (private val listDoa: List<Doa>) :RecyclerView.Adapter<DoaAdapter.ItemDoaViewHolder>() {
    inner class ItemDoaViewHolder (private val binding: ItemDoaBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Doa) {
            with(binding){
                txtName.text = data.doa
                txtAyat.text = data.ayat
                txtArtinya.text = data.artinya
                txtLatin.text = data.latin
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemDoaViewHolder {
        val binding = ItemDoaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemDoaViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listDoa.size
    }

    override fun onBindViewHolder(holder: ItemDoaViewHolder, position: Int) {
        holder.bind(listDoa[position])
    }
}