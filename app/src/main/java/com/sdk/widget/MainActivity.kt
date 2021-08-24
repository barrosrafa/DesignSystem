package com.sdk.widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sdk.component.BaseAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = BaseAdapter {
            GreenView(it)
        }.apply {
            items = mutableListOf(
                User("Rafael", "rafael@gmail.com"),
                User("Rafael2", "rafael2@gmail.com")
            )
        }
    }
}
