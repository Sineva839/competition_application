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

        //val ico = findViewById<ImageView>(R.id.ico1)
        val title = findViewById<TextView>(R.id.title1)
        val desc = findViewById<TextView>(R.id.description1)

        //val ico2 = findViewById<ImageView>(R.id.ico2)
        val title2 = findViewById<TextView>(R.id.title2)
        val desc2 = findViewById<TextView>(R.id.description2)

        //val ico3 = findViewById<ImageView>(R.id.ico3)
        val title3= findViewById<TextView>(R.id.title3)
        val desc3 = findViewById<TextView>(R.id.description3)

       // val ico4 = findViewById<ImageView>(R.id.ico4)
        val title4 = findViewById<TextView>(R.id.title4)
        val desc4 = findViewById<TextView>(R.id.description4)

       // val ico5 = findViewById<ImageView>(R.id.ico5)
        val title5 = findViewById<TextView>(R.id.title5)
        val desc5 = findViewById<TextView>(R.id.description5)

        val title_item = intent.getStringArrayExtra("set_list_title")

        title.text = title_item?.get(0).toString()
        title2.text = title_item?.get(1).toString()
        title3.text = title_item?.get(2).toString()
        title4.text = title_item?.get(3).toString()
        title5.text = title_item?.get(4).toString()

        val desc_item = intent.getStringArrayExtra("set_list_desc")

        desc.text = desc_item?.get(0).toString()
        desc2.text = desc_item?.get(0).toString()
        desc3.text = desc_item?.get(0).toString()
        desc4.text = desc_item?.get(0).toString()
        desc5.text = desc_item?.get(0).toString()

    }
}