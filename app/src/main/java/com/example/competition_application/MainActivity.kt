package com.example.competition_application

import android.content.ClipData.Item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.RecoverySystem
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

        items.add(ItemCls(1,"Junior course","Курс с нуля до джуна","большое описание",0))
        items.add(ItemCls(1,"Midle course","Курс с джуна до мидла","большое описание",200))
        items.add(ItemCls(1,"Senior course","Курс до сеньера + больше скидок","большое описание",500))

        itemList.layoutManager = ConstraintLayout()
        itemList.adapter = ItemAdapter(items,this)

    }
}