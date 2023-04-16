package com.example.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(val data: List<Movie>): RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
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
        holder.itemDescView.text = data.get(position).year
        holder.row.setOnClickListener {v ->
            run {
                val intent = Intent(v.context, DetailMovieActivity::class.java)
                intent.putExtra("movieImage", data.get(position).idImageView)
                intent.putExtra("movieTitle", data.get(position).title)
                intent.putExtra("movieYear", data.get(position).year)
                intent.putExtra("movieInfo", data.get(position).info)
                v.context.startActivity(intent)
            }
        }
    }
    override fun getItemCount(): Int = data.size
}