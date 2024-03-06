package com.example.competition_application

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(var items: List<ItemCls>, var context: Context):
    RecyclerView.Adapter<ItemAdapter.MyViewHolder>() {

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        var image: ImageView = view.findViewById(R.id.imageView)
        var title: TextView = view.findViewById(R.id.title_item)
        var mainLiner: LinearLayout = view.findViewById(R.id.main_liner)
        var desk: TextView = view.findViewById(R.id.description)
        var progressBar: ProgressBar = view.findViewById(R.id.progress_item)

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
        holder.mainLiner.alpha = 0.5F
        if (items[position].access_valid) {
            holder.mainLiner.alpha = 1F
        }

        var imageId = context.resources.getIdentifier(
            items[position].icos,
            "drawable",
            context.packageName
        )
        holder.image.setImageResource(imageId)

        holder.mainLiner.setOnClickListener(){
            if(items[position].access_valid) {
                val intent = Intent(context, OpenScreen::class.java)

                intent.putExtra("description_item", items[position].mainDesk)
                intent.putExtra("title_item", items[position].title)
                intent.putExtra("img_item", items[position].icos)

                context.startActivity(intent)
            }else{
                Toast.makeText(context,"Этот курс не доступен вам!",Toast.LENGTH_SHORT).show()

            }
        }

    }
}