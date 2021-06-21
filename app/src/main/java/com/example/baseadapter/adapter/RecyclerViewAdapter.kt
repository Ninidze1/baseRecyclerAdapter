package com.example.baseadapter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.baseadapter.base.BaseRecyclerViewAdapter
import com.example.baseadapter.databinding.ItemLayoutBinding
import com.example.baseadapter.models.Item

class RecyclerViewAdapter: BaseRecyclerViewAdapter<Item>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenericVH<Item> {
        val view = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(view)
    }

    inner class MyViewHolder(private var binding: ItemLayoutBinding): GenericVH<Item>(binding.root){
        override fun bind(data: Item) {
            binding.name.text = data.name
            binding.surname.text = data.surname
        }
    }
}