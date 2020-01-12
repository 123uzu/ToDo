package com.example.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import com.example.todoapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val list_view = findViewById<ListView>(R.id.list_view)

    val inputText = findViewById<EditText>(R.id.inputText)

    val text = inputText.text.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = ArrayList<String>()
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, input)
        list_view.adapter = adapter


        saveBtn.setOnClickListener{

            input.add(text)
            inputText.setText("")
        }

    }


}
