package com.example.competition_application

import android.content.ClipData.Item
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.RecoverySystem
import android.text.BoringLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jun_course: LinearLayout = findViewById(R.id.one_cours)
        jun_course.alpha = 1f
        val mid_course: LinearLayout = findViewById(R.id.two_cours)
        jun_course.alpha = 0.5f
        val sen_course: LinearLayout = findViewById(R.id.three_cours)
        jun_course.alpha = 0.5f


    }
}