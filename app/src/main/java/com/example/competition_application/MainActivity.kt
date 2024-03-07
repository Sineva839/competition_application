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

        val paidOn = intent.getStringExtra("paid")


        val jun_course: LinearLayout = findViewById(R.id.cours1)
        jun_course.alpha = DBAcc.getFloat("id1",0.5f)
        val mid_course: LinearLayout = findViewById(R.id.cours2)
        mid_course.alpha = DBAcc.getFloat("id2",0.5f)
        val sen_course: LinearLayout = findViewById(R.id.cours3)
        sen_course.alpha = DBAcc.getFloat("id3",0.5f)

        val listItems1 = arrayListOf<ItemCls>()
        listItems1.add(ItemCls(1,"Разраб1","Краткое описание","большое описание","задание"))
        listItems1.add(ItemCls(2,"Разраб2","Краткое описание","большое описание","задание"))
        listItems1.add(ItemCls(3,"Разраб3","Краткое описание","большое описание","задание"))
        listItems1.add(ItemCls(4,"Разраб4","Краткое описание","большое описание","задание"))
        listItems1.add(ItemCls(5,"Разраб5","Краткое описание","большое описание","задание"))

        val listItems2 = arrayListOf<ItemCls>()
        listItems1.add(ItemCls(1,"Разраб1","Краткое описание","большое описание","задание"))
        listItems1.add(ItemCls(2,"Разраб2","Краткое описание","большое описание","задание"))
        listItems1.add(ItemCls(3,"Разраб3","Краткое описание","большое описание","задание"))
        listItems1.add(ItemCls(4,"Разраб4","Краткое описание","большое описание","задание"))
        listItems1.add(ItemCls(5,"Разраб5","Краткое описание","большое описание","задание"))

        val titleList = arrayOf<String>("Разраб1","Разраб2","Разраб3","Разраб4","Разраб5",)
        val descriptionList = arrayOf<String>("Краткое описание","Краткое описание","Краткое описание","Краткое описание","Краткое описание",)


        jun_course.setOnClickListener(){
            if(jun_course.alpha == 1f){
                val form = Intent(this, coursesActivity::class.java)
                form.putExtra("set_list_title",titleList)
                form.putExtra("set_list_desc",descriptionList)
                this.startActivity(form)
            }else{
                val form = Intent(this, buy_Activity::class.java)
                form.putExtra("setlist",listItems1)
                this.startActivity(form)
            }

        }
        mid_course.setOnClickListener(){
            if(mid_course.alpha == 1f){
                val form = Intent(this, coursesActivity::class.java)
                form.putExtra("setlist",listItems2)
                this.startActivity(form)
            }else{
                val form = Intent(this, buy_Activity::class.java)
                form.putExtra("setlist",listItems2)
                this.startActivity(form)
            }
        }
        sen_course.setOnClickListener(){
            if(sen_course.alpha == 1f){
                val form = Intent(this, coursesActivity::class.java)
                form.putExtra("setlist",listItems2)
                this.startActivity(form)
            }else{
                val form = Intent(this, buy_Activity::class.java)
                form.putExtra("setlist",listItems2)
                this.startActivity(form)
            }
        }


    }
}