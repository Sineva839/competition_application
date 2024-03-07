package com.example.competition_application

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class card_paid_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_paid)

        val paid = findViewById<View>(R.id.paid_main_button)

        paid.setOnClickListener(){
            val form = Intent(this, MainActivity::class.java)
            form.putExtra("paid",true)
            form.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            this.startActivity(form)

        }
    }
}