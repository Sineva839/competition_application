package com.example.competition_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        val db = DBHELPER(this, null)
        //Toast.makeText(this, "Login: ${db.checkUser("name839")}", Toast.LENGTH_SHORT).show()

        val userLogin: EditText = findViewById(R.id.login)
        val userPass: EditText = findViewById(R.id.pass)
        val regButton: View = findViewById(R.id.reg_button)

        regButton.setOnClickListener() {
            val login: String = userLogin.text.toString()
            val pass: String = userPass.text.toString()
            if (login == "" || pass == "") {
                Toast.makeText(this, "Данные введены не все", Toast.LENGTH_SHORT).show()
            } else {
                val newUser = UserInfo(login, pass.toInt())
                db.addUser(newUser)
                db.addCourse("first_cours", 1)



                Toast.makeText(this, "Login: ${db.checkUser()} , Pass: $pass", Toast.LENGTH_SHORT).show()

            }
        }

    }
}