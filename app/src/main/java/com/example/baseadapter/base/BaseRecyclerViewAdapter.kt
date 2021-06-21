package com.example.baseadapter.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baseadapter.interfaces.BindViewHolder

abstract class BaseRecyclerViewAdapter<T>: RecyclerView.Adapter<BaseRecyclerViewAdapter.GenericVH<T>>() {
    private val items = ArrayList<T>()

    fun addToList(items: MutableList<T>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    open class GenericVH<T>(itemView: View): RecyclerView.ViewHolder(itemView), BindViewHolder<T> {
        override fun bind(data: T) {
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenericVH<T> {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return GenericVH(view)
    }

    override fun onBindViewHolder(holder: GenericVH<T>, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

}