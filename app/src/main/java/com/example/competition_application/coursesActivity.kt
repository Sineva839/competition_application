package com.example.competition_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class coursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        val ico = findViewById<ImageView>(R.id.ico1)
        val title = findViewById<TextView>(R.id.title1)
        val desc = findViewById<TextView>(R.id.description1)

        val ico2 = findViewById<ImageView>(R.id.ico2)
        val title2 = findViewById<TextView>(R.id.title2)
        val desc2 = findViewById<TextView>(R.id.description2)

        val ico3 = findViewById<ImageView>(R.id.ico3)
        val title3= findViewById<TextView>(R.id.title3)
        val desc3 = findViewById<TextView>(R.id.description3)

        val ico4 = findViewById<ImageView>(R.id.ico4)
        val title4 = findViewById<TextView>(R.id.title4)
        val desc4 = findViewById<TextView>(R.id.description4)

        val ico5 = findViewById<ImageView>(R.id.ico5)
        val title5 = findViewById<TextView>(R.id.title5)
        val desc5 = findViewById<TextView>(R.id.description5)


    }
}