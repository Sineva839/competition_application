package com.example.competition_application

import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView

class OpenScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_screen)


        val title : TextView = findViewById(R.id.main_title)
        val desc : TextView = findViewById(R.id.main_description)
        val task : TextView = findViewById(R.id.task_description)
        val videoView = findViewById<VideoView>(R.id.video_item)

        val infoHome = intent.getStringExtra("set_list_title")
        val infoTask = intent.getStringExtra("set_list_task")
        val infoDesk = intent.getStringExtra("set_list_fulldesc")

        title.text = infoHome.toString()
        desc.text = infoDesk.toString()
        task.text = infoTask.toString()


    }
}