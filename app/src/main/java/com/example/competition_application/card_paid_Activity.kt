package com.example.competition_application

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Date

class card_paid_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_paid)

        val num1 = findViewById<EditText>(R.id.num_edt1)
        val dat1 = findViewById<EditText>(R.id.dat_edt1)
        val num2 = findViewById<EditText>(R.id.num_edt2)

        val paid = findViewById<View>(R.id.paid_main_button)

        val buyId = intent.getStringExtra("id_buy")

        paid.setOnClickListener(){
            if(num1.text.toString() == "" || dat1.text.toString() == "" || num2.text.toString() == ""){
                Toast.makeText(this,"Не все поля заполнены",Toast.LENGTH_SHORT).show()
            }else if(num1.text.length < 16 || num2.text.length < 3) {
                Toast.makeText(this,"Поля введены не правильно",Toast.LENGTH_SHORT).show()
            }else{
                val form = Intent(this, MainActivity::class.java)
                form.putExtra("paid", true)
                form.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                form.putExtra("id_buy", buyId)


                this.startActivity(form)
            }
        }
    }
}