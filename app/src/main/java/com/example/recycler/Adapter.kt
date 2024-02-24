package com.example.recycler

import android.content.ClipData.Item
import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recycler.databinding.ItemBinding

class Adapter (val list: List<ItemList>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val currentItem = list[position]
        holder.bind(currentItem)
    }

    override fun getItemCount() = list.size

    class ViewHolder( private val binding: ItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item : ItemList){
            binding.itemContent = item
            binding.executePendingBindings()
        }
    }

}
