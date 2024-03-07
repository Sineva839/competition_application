package com.example.competition_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class buy_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy)

        val paidButton = findViewById<View>(R.id.paid_button)

        paidButton.setOnClickListener(){
            val form = Intent(this, card_paid_Activity::class.java)
            this.startActivity(form)
        }
    }
}