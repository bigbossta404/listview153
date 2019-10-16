package com.example.listview_153

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.R.layout.simple_list_item_1
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val languages = listOf("HTML & CSS","C++", "KOTLIN", "JAVA", "JAVASCRIPT")
        list_view.adapter = ArrayAdapter(this, simple_list_item_1, languages)
        list_view.setOnItemClickListener{parent, view, position, id ->
            Toast.makeText(this, "Kelean memilih:${languages[position]}", Toast.LENGTH_SHORT).show()}
    }
}
