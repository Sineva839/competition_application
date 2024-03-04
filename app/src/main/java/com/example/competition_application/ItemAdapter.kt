package com.example.competition_application

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(var items: List<ItemCls>, var context: Context):
    RecyclerView.Adapter<ItemAdapter.MyViewHolder>() {

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val image: ImageView = view.findViewById(R.id.imageView)
        val title: TextView = view.findViewById(R.id.title_item)
        val desk: TextView = view.findViewById(R.id.description)
        val progressBar: ProgressBar = view.findViewById(R.id.progress_item)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_dising, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = items[position].title
        holder.desk.text = items[position].desk
        holder.progressBar.progress = items[position].progress

    }
}