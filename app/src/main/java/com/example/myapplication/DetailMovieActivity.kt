package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityDetailMovieBinding

class DetailMovieActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO get an Object of Novel
        val image = intent?.extras?.getString("movieImage")
        val title = intent?.extras?.getString("movieTitle")
        val year = intent?.extras?.getString("movieYear")
        val synopsis = intent?.extras?.getString("movieSynopsis")
        if (image != null) {
            binding.detailMovieImage.setImageResource(image.toInt())
        }
        binding.detailMovieTitle.text = title
        binding.detailMovieYear.text = year
        binding.detailMovieInfo.text = synopsis
    }
}