package com.example.competition_application

import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class OpenScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_screen)


        val title : TextView = findViewById(R.id.main_title)
        val desc : TextView = findViewById(R.id.main_description)

        title.text = intent.getStringExtra("title_item")
        desc.text = intent.getStringExtra("description_item")

    }
}