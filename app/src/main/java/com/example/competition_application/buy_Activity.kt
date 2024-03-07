package com.example.competition_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class buy_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy)

        val paidButton = findViewById<View>(R.id.paid_button)

        val func = intent.getStringArrayExtra("setlist_buy")

        val title_course = findViewById<TextView>(R.id.title1_buy)
        val description_course = findViewById<TextView>(R.id.description1_buy)

        title_course.text = func?.get(1).toString()
        description_course.text = func?.get(2).toString()

        paidButton.setOnClickListener(){
            val form = Intent(this, card_paid_Activity::class.java)
            form.putExtra("id_buy",func?.get(0).toString())
            this.startActivity(form)

        }
    }
}