package com.example.competition_application

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast


open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val DBAcc = getSharedPreferences("dbacc4", Activity.MODE_PRIVATE)
        val editor = DBAcc.edit()

        if(DBAcc.getBoolean("start",true)){
            editor.putBoolean("start",false)
            editor.putFloat("id1",1f)
            editor.putFloat("id2",0.5f)
            editor.putFloat("id3",0.5f)

            Toast.makeText(this,"MESSAGE",Toast.LENGTH_SHORT).show()

            editor.apply()
        }

        val idBuy = intent.getStringExtra("id_buy")
        editor.putFloat("id$idBuy",1F)
        editor.apply()

        Toast.makeText(this,"CREATED $idBuy",Toast.LENGTH_LONG).show()

        val paidOn = intent.getStringExtra("paid")

        val title_jun = findViewById<TextView>(R.id.title1)
        val title_mid = findViewById<TextView>(R.id.title2)
        val title_sen = findViewById<TextView>(R.id.title3)

        val desc_jun = findViewById<TextView>(R.id.description1)
        val desc_mid = findViewById<TextView>(R.id.description2)
        val desc_sen = findViewById<TextView>(R.id.description3)

        val course_info1 = arrayOf<String>("1",title_jun.text.toString(),desc_jun.text.toString())
        val course_info2 = arrayOf<String>("2",title_mid.text.toString(),desc_mid.text.toString())
        val course_info3 = arrayOf<String>("3",title_sen.text.toString(),desc_sen.text.toString())


        val jun_course: LinearLayout = findViewById(R.id.cours1)
        jun_course.alpha = DBAcc.getFloat("id1",0.5f)
        val mid_course: LinearLayout = findViewById(R.id.cours2)
        mid_course.alpha = DBAcc.getFloat("id2",0.5f)
        val sen_course: LinearLayout = findViewById(R.id.cours3)
        sen_course.alpha = DBAcc.getFloat("id3",0.5f)


        val titleList = arrayOf<String>("Разраб1","Разраб2","Разраб3","Разраб4","Разраб5",)
        val descriptionList = arrayOf<String>("Краткое описание","Краткое описание","Краткое описание","Краткое описание","Краткое описание",)
        val descriptionTask =  arrayOf<String>("Описание задания","Описание задания","Описание задания","Описание задания","Описание задания")
        val desc_full=  arrayOf<String>("","Полное описание","Полное описание","Полное описание","Полное описание",)


        val titleList2 = arrayOf<String>("Библиотека Kivy","Разраб2","Разраб3","Разраб4","Разраб5",)
        val descriptionList2 = arrayOf<String>("Курс по библиотеке пайтона kivy","Краткое описание","Краткое описание","Краткое описание","Краткое описание",)
        val descriptionTask2 =  arrayOf<String>("Опишите пару библиотек пайтона , и закрепите полученные знания","Описание задания","Описание задания","Описание задания","Описание задания")
        val desc_full2=  arrayOf<String>("Python является одним из самых популярных языков программирования в мире благодаря своей простоте и широким возможностям. Вместе с тем, Python отличается от других языков своей гибкостью и разнообразием библиотек. Одной из таких библиотек является kivy, фреймворк для создания мультимедийных приложений.","Полное описание","Полное описание","Полное описание","Полное описание",)


        jun_course.setOnClickListener(){
            if(jun_course.alpha == 1f){
                val form = Intent(this, coursesActivity::class.java)
                form.putExtra("set_list_title",titleList)
                form.putExtra("set_list_desc",descriptionList)
                form.putExtra("set_list_fulldesc",descriptionTask)
                form.putExtra("set_list_task",desc_full)
                this.startActivity(form)
            }else{
                val form = Intent(this, buy_Activity::class.java)
                form.putExtra("setlist_buy",course_info1)
                this.startActivity(form)
            }

        }
        mid_course.setOnClickListener(){
            if(mid_course.alpha == 1f){
                val form = Intent(this, coursesActivity::class.java)
                form.putExtra("set_list_title",titleList2)
                form.putExtra("set_list_desc",descriptionList2)
                form.putExtra("set_list_fulldesc",descriptionTask2)
                form.putExtra("set_list_task",desc_full2)

                this.startActivity(form)
            }else{
                val form = Intent(this, buy_Activity::class.java)
                form.putExtra("setlist_buy",course_info2)
                this.startActivity(form)
            }
        }
        sen_course.setOnClickListener(){
            if(sen_course.alpha == 1f){
                val form = Intent(this, coursesActivity::class.java)
                form.putExtra("set_list_title",titleList2)
                form.putExtra("set_list_desc",descriptionList2)
                form.putExtra("set_list_fulldesc",descriptionTask2)
                form.putExtra("set_list_task",desc_full2)
                this.startActivity(form)
            }else{
                val form = Intent(this, buy_Activity::class.java)
                form.putExtra("setlist_buy",course_info3)
                this.startActivity(form)
            }
        }


    }
}