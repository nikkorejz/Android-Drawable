package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private var counter = 0

    data class Contact(val name: String, val phone: String) {
        override fun toString(): String {
            return "$name ($phone)"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val arr = arrayOf("String 1", "String 2", "String 3",)
        val arr = arrayOf(
            Contact("Peter", "123"),
            Contact("Joe", "456"),
            Contact("Kate", "789"),
        )
        val listView: ListView = findViewById(R.id.ListView)
        listView.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            arr
        )
    }

    fun onClick(v: View) {
        counter++
        if (counter > Random.nextInt(3, 10)) {
            v.isEnabled = false
        }
    }
}