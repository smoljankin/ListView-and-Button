package com.example.probalist

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

   private val catNames = mutableListOf("Рыжик", "Барсик", "Мурзик")// используем адаптер данных

    private lateinit var adapter: ArrayAdapter<String>
    private val itemList: MutableList<String> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lv : ListView = findViewById(R.id.listview)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, itemList)
        lv.adapter = adapter

    }
    fun onClick(view: View?) {
        val resultTextView: TextView = findViewById(R.id.textView)

        resultTextView.text = "12345"

        val lv : ListView = findViewById(R.id.listview)

        val newData = "Новий елемент"

        catNames.add(newData)
        itemList.add(newData)
// Оновлюємо адаптер
        adapter.notifyDataSetChanged()

    }
}