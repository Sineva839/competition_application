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

        val userLogin: EditText = findViewById(R.id.login)
        val userPass: EditText = findViewById(R.id.pass)
        val regButton: View = findViewById(R.id.reg_button)

        regButton.setOnClickListener(){
            val login: String = userLogin.toString().trim()
            val pass: String = userPass.toString().trim()
            var ar =  ByteArray(3)
            if(login == "" || pass == ""){
                Toast.makeText(this,"Необходимо заполнить все поля",Toast.LENGTH_SHORT).show()

            }else{
                val newUser =  UserInfo(login, pass.toInt(), ar )
                val db = DBHELPER(this,null)

                db.addUser(newUser)


            }

        }
    }
}