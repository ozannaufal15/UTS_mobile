package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailNovelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_novel)

        //TODO get an Object of Novel
        val novel = intent?.extras?.getString("id").toString()
    }
}