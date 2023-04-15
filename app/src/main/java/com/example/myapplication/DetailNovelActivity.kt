package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityDetailNovelBinding

class DetailNovelActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailNovelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailNovelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image = intent?.extras?.getString("novelImage")
        val title = intent?.extras?.getString("novelTitle")
        val writer = intent?.extras?.getString("novelWriter")
        val synopsis = intent?.extras?.getString("novelSynopsis")
        if (image != null) {
            binding.detailNovelImage.setImageResource(image.toInt())
        }
        binding.detailNovelTitle.text = title
        binding.detailNovelWriter.text = writer
        binding.detailNovelInfo.text = synopsis

        val toast = Toast.makeText(this, binding.detailNovelTitle.text, Toast.LENGTH_SHORT)
        toast.show()
    }
}