package com.example.baseadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.baseadapter.adapter.RecyclerViewAdapter
import com.example.baseadapter.base.BaseRecyclerViewAdapter
import com.example.baseadapter.databinding.ActivityMainBinding
import com.example.baseadapter.models.Item

class MainActivity : AppCompatActivity() {

    private val randomList: MutableList<Item> = mutableListOf()
    private lateinit var adapter: RecyclerViewAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    private fun init() {
        recyclerInit()
        addToList()
    }
    private fun recyclerInit() {
        adapter = RecyclerViewAdapter()
        binding.recylcer.layoutManager = LinearLayoutManager(this)
        binding.recylcer.adapter = adapter
    }
    private fun addToList() {

        repeat(16) {
            randomList.add(Item("saswauli", "basefragmenti"))
        }
        adapter.addToList(randomList)
    }

}