package com.example.competition_application

import android.content.ClipData.Item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.RecoverySystem
import android.text.BoringLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.RecyclerListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemList : RecyclerView= findViewById(R.id.item_list_1)
        val items = arrayListOf<ItemCls>()

        val accessOpen: Boolean = true
        val accessOpen2: Boolean = false

        items.add(ItemCls(1,1,"Junior course","Начало курса","большое описание",30,0,"simple_pit",accessOpen))
        items.add(ItemCls(1,2,"Junior course","Изучение основ","большое описание",20,0,"simple_pit",accessOpen))
        items.add(ItemCls(1,3,"Junior course","Практика на деле","большое описание",70,0,"simple_pit",accessOpen))

        items.add(ItemCls(2,1,"Midle course","Начало курса","большое описание",0,99,"midle_pit",accessOpen2))
        items.add(ItemCls(2,2,"Midle course","Изучение основ","большое описание",0,99,"midle_pit",accessOpen2))

        items.add(ItemCls(3,1,"Senior course","Начало курса","большое описание",0,199,"senior_pit",accessOpen2))
        items.add(ItemCls(4,2,"Senior course2","Изучение основ","большое описание",0,199,"senior_pit",accessOpen2))
        items.add(ItemCls(5,3,"Senior course3","Практика на деле","большое описание",0,199,"senior_pit",accessOpen2))

        itemList.layoutManager = LinearLayoutManager(this)
        itemList.adapter = ItemAdapter(items,this)

    }
}