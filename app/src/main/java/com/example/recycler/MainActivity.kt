package com.example.recycler

import android.content.ClipData.Item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.ListAdapter
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.rvList.layoutManager = LinearLayoutManager(this)
        binding.rvList.adapter = Adapter(
            listOf(
                ItemList("Ali","Mohammad"),
                ItemList("Fati","Hasan"),
                ItemList("Ho3ein","Zahra")
            )
        )
    }
}