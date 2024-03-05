package com.example.competition_application

import android.content.ClipData.Item
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.RecoverySystem
import android.text.BoringLayout
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.RecyclerListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Работа с кнопкой входа в систему
        val butt_login : ImageView = findViewById(R.id.login_button)

        butt_login.setOnClickListener(){
            this.startActivity(Intent(this,AuthActivity::class.java))
        }

        val itemList : RecyclerView= findViewById(R.id.item_list_1)
        val items = arrayListOf<ItemCls>()

        val accessOpen: Boolean = true
        val accessOpen2: Boolean = false


        val testText1 = "Курс \"Продвинутая разработка на Python для Middle-разработчиков\" предназначен для разработчиков, уже обладающих базовыми знаниями Python и желающих углубить свои навыки в этом языке программирования. Этот курс предоставляет структурированный подход к изучению продвинутых концепций и техник Python, необходимых для успешного участия в проектах различного уровня сложности."
        val testText2 = "Курс \"Основы разработки на Python для Junior-разработчиков\" предназначен для начинающих программистов, которые хотят освоить основы языка Python и начать свой путь в сфере разработки программного обеспечения. Этот курс предоставляет фундаментальные знания и практические навыки, необходимые для эффективного изучения и использования Python в различных проектах."
        val testText3 = "Курс \"Продвинутая разработка на Python для Senior-разработчиков\" разработан для опытных программистов, которые стремятся расширить свои знания и навыки в области разработки на Python и достичь уровня Senior-разработчика. Этот курс предоставляет глубокие знания и передовые методы, необходимые для решения сложных задач и лидерства в проектах Python."
        // Курсы
        items.add(ItemCls(1,1,"Junior course","Начало курса",testText2,0,0,"simple_pit",accessOpen))
        items.add(ItemCls(1,2,"Junior course","Изучение основ",testText2,0,0,"simple_pit",accessOpen))
        items.add(ItemCls(1,3,"Junior course","Практика на деле",testText2,0,0,"simple_pit",accessOpen))

        items.add(ItemCls(2,1,"Midle course","Начало курса",testText1,0,99,"midle_pit",accessOpen2))
        items.add(ItemCls(2,2,"Midle course","Изучение основ",testText1,0,99,"midle_pit",accessOpen2))

        items.add(ItemCls(3,1,"Senior course","Начало курса",testText3,0,199,"senior_pit",accessOpen2))
        items.add(ItemCls(3,2,"Senior course2","Изучение основ",testText3,0,199,"senior_pit",accessOpen2))
        items.add(ItemCls(3,3,"Senior course3","Практика на деле",testText3,0,199,"senior_pit",accessOpen2))

        itemList.layoutManager = LinearLayoutManager(this)
        itemList.adapter = ItemAdapter(items,this)

    }
}