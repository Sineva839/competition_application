package com.example.competition_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class coursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        val cours1: LinearLayout = findViewById(R.id.cours1)
        val cours2: LinearLayout = findViewById(R.id.cours2)
        val cours3: LinearLayout = findViewById(R.id.cours3)
        val cours4: LinearLayout = findViewById(R.id.cours4)
        val cours5: LinearLayout = findViewById(R.id.cours5)

        val course_info1 = arrayOf<String>("","О курсе","Задание")
        val course_info2 = arrayOf<String>("Название курса","О курсе","Задание")
        val course_info3 = arrayOf<String>("Название курса","О курсе","Задание")
        val course_info4 = arrayOf<String>("Название курса","О курсе","Задание")
        val course_info5 = arrayOf<String>("Название курса","О курсе","Задание")

        val fullTask= intent.getStringArrayExtra("set_list_task")
        val fullDesk = intent.getStringArrayExtra("set_list_fulldesc")
        val fullTitle = intent.getStringArrayExtra("set_list_title")


        cours1.setOnClickListener(){  val form = Intent(this, OpenScreen::class.java)
            form.putExtra("set_list_task",fullTask?.get(0).toString())
            form.putExtra("set_list_fulldesc",fullDesk?.get(0).toString())
            form.putExtra("set_list_title",fullTitle?.get(0).toString())

            this.startActivity(form)}
        cours2.setOnClickListener(){val form = Intent(this, OpenScreen::class.java)
            form.putExtra("set_list_task",fullTask?.get(1).toString())
            form.putExtra("set_list_fulldesc",fullDesk?.get(1).toString())
            form.putExtra("set_list_home",fullTitle?.get(1).toString())

            this.startActivity(form)}
        cours3.setOnClickListener(){val form = Intent(this, OpenScreen::class.java)
            form.putExtra("set_list_task",fullTask?.get(2).toString())
            form.putExtra("set_list_fulldesc",fullDesk?.get(2).toString())
            form.putExtra("set_list_home",fullTitle?.get(2).toString())

            this.startActivity(form)}
        cours4.setOnClickListener(){val form = Intent(this, OpenScreen::class.java)
            form.putExtra("set_list_task",fullTask?.get(3).toString())
            form.putExtra("set_list_fulldesc",fullDesk?.get(3).toString())
            form.putExtra("set_list_home",fullTitle?.get(3).toString())

            this.startActivity(form)}
        cours5.setOnClickListener(){val form = Intent(this, OpenScreen::class.java)
            form.putExtra("set_list_task",fullTask?.get(4).toString())
            form.putExtra("set_list_fulldesc",fullDesk?.get(4).toString())
            form.putExtra("set_list_home",fullTitle?.get(4).toString())

            this.startActivity(form)}


        //val ico = findViewById<ImageView>(R.id.ico1)
        val title = findViewById<TextView>(R.id.title1_buy)
        val desc = findViewById<TextView>(R.id.description1_buy)

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