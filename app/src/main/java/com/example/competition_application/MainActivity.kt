package com.example.competition_application

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val DBAcc = getSharedPreferences("dbacc", Activity.MODE_PRIVATE)
        val editor = DBAcc.edit()

        if(DBAcc.getBoolean("start",true)){
            editor.putBoolean("start",false)
            editor.putFloat("id1",1f)
            editor.putFloat("id2",0.5f)
            editor.putFloat("id3",0.5f)

            Toast.makeText(this,"MESSAGE",Toast.LENGTH_SHORT).show()

            editor.apply()
        }

        val jun_course: LinearLayout = findViewById(R.id.cours1)
        jun_course.alpha = DBAcc.getFloat("id1",0.5f)
        val mid_course: LinearLayout = findViewById(R.id.cours2)
        mid_course.alpha = DBAcc.getFloat("id2",0.5f)
        val sen_course: LinearLayout = findViewById(R.id.cours3)
        sen_course.alpha = DBAcc.getFloat("id3",0.5f)

        val course1 = arrayListOf<String>("Начало верстки","Вы научитись верстать","simple_pit")
        val course2 = arrayListOf<String>("Изучаем ООП","Вы поймете что такое ООП","simple_pit")
        val course3 = arrayListOf<String>("Делаем первый проект","Вы научитись проектированию","simple_pit")
        val course4 = arrayListOf<String>("Почти конец","Вы научитись терпеть конец обработки","simple_pit")
        val course5 = arrayListOf<String>("Конец страданий","Вы научитись пушить в мастер без комитов","simple_pit")

        val list = arrayListOf<ArrayList<String>>(course1,course2,course3,course4,course5)

        val course1a = arrayListOf<String>("Начало верстки","Вы научитись верстать","midle_pit")
        val course2a = arrayListOf<String>("Изучаем ООП","Вы поймете что такое ООП","senior_pit")
        val course3a = arrayListOf<String>("Делаем первый проект","Вы научитись проектированию","midle_pit")
        val course4a = arrayListOf<String>("Почти конец","Вы научитись терпеть конец обработки","senior_pit")
        val course5a = arrayListOf<String>("Конец страданий","Вы научитись пушить в мастер без комитов","senior_pit")

        val list_a = arrayListOf<ArrayList<String>>(course1a,course2a,course3a,course4a,course5a)

        jun_course.setOnClickListener(){
            if(jun_course.alpha == 1f){
                val form = Intent(this, coursesActivity::class.java)
                form.putExtra("jun",list)
                this.startActivity(form)
            }else {
                val an_form = Intent(this, buy_Activity::class.java)
                this.startActivity(an_form)
            }
        }
        mid_course.setOnClickListener(){
            if(jun_course.alpha == 1f){
                val form = Intent(this, coursesActivity::class.java)
                form.putExtra("mid",list_a)
                this.startActivity(form)
            }else {
                val an_form = Intent(this, buy_Activity::class.java)
                this.startActivity(an_form)
            }
        }
        sen_course.setOnClickListener(){
            if(jun_course.alpha == 1f){
                val form = Intent(this, coursesActivity::class.java)
                form.putExtra("sen",list_a)
                this.startActivity(form)
            }else {
                val an_form = Intent(this, buy_Activity::class.java)
                this.startActivity(an_form)
            }
        }


    }
}