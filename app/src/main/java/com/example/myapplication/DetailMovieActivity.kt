package com.example.myapplication

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.widget.Toast
import com.example.myapplication.databinding.ActivityDetailMovieBinding

class DetailMovieActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image = intent?.extras?.getInt("movieImage")
        val title = intent?.extras?.getString("movieTitle")
        val year = intent?.extras?.getString("movieYear")
        val arrInfo = resources.getStringArray(intent.extras?.getInt("movieInfo")!!)
        val infoItemName = resources.getStringArray(R.array.movieinfoitemname)
        val overview = SpannableStringBuilder(infoItemName[2]+"\n\n"+arrInfo[2])
        overview.setSpan(StyleSpan(Typeface.BOLD),0, infoItemName[2].length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        overview.setSpan(ForegroundColorSpan(Color.BLACK),0, overview.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        val genre = SpannableStringBuilder(infoItemName[1]+"\n"+arrInfo[1])
        genre.setSpan(StyleSpan(Typeface.BOLD),0, infoItemName[1].length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        genre.setSpan(ForegroundColorSpan(Color.BLACK),0, infoItemName[1].length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        val director = SpannableStringBuilder(infoItemName[0]+"\n"+arrInfo[0])
        director.setSpan(StyleSpan(Typeface.BOLD),0, infoItemName[0].length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        director.setSpan(ForegroundColorSpan(Color.BLACK),0, infoItemName[0].length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.detailMovieImage.setImageResource(image!!)
        binding.detailMovieTitle.text = title
        binding.detailMovieYear.text = year
        binding.detailMovieDirector.text = director
        binding.detailMovieGenre.text = genre
        binding.detailMovieInfo.text = overview

        val toast = Toast.makeText(this, binding.detailMovieTitle.text, Toast.LENGTH_SHORT)
        toast.show()
    }
}