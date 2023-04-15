package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.collection.arrayMapOf
import androidx.recyclerview.widget.RecyclerView


class NovelAdapter (val data: List<Novel>): RecyclerView.Adapter<NovelAdapter.MyViewHolder>() {
    class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
        val itemTitleView: TextView = row.findViewById<TextView>(R.id.item_title)
        val itemImageView: ImageView = row.findViewById<ImageView>(R.id.item_image)
        val itemDescView: TextView = row.findViewById<TextView>(R.id.item_description)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_view,
            parent, false)
        return MyViewHolder(layout)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImageView.setImageResource(data.get(position).idImageView)
        holder.itemTitleView.text = data.get(position).title
        holder.itemDescView.text = data.get(position).writer
        holder.row.setOnClickListener {v ->
            run {
                val toast = Toast.makeText(v.context, data.get(position).toString(), Toast.LENGTH_SHORT)
                toast.show()
                val intent = Intent(v.context, DetailNovelActivity::class.java)
                intent.putExtra("novelImage", data.get(position).idImageView.toString())
                intent.putExtra("novelTitle", data.get(position).title)
                intent.putExtra("novelWriter", data.get(position).writer)
                intent.putExtra("novelSynopsis", data.get(position).synopsis)
                v.context.startActivity(intent)
            }
        }
    }
    override fun getItemCount(): Int = data.size
}