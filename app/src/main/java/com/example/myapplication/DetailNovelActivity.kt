package com.example.myapplication

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.widget.Toast
import androidx.core.content.withStyledAttributes
import com.example.myapplication.databinding.ActivityDetailNovelBinding

class DetailNovelActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailNovelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailNovelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image = intent?.extras?.getInt("novelImage")
        val title = intent?.extras?.getString("novelTitle")
        val writer = intent?.extras?.getString("novelWriter")
        val arrInfo = resources.getStringArray(intent.extras?.getInt("novelInfo")!!)
        val infoItemName = resources.getStringArray(R.array.novelinfoitemname)
        val overview = SpannableStringBuilder(infoItemName[2]+"\n\n"+arrInfo[2])
        overview.setSpan(StyleSpan(Typeface.BOLD),0, infoItemName[2].length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        overview.setSpan(ForegroundColorSpan(Color.BLACK),0, overview.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        val genre = SpannableStringBuilder(infoItemName[1]+"\n"+arrInfo[1])
        genre.setSpan(StyleSpan(Typeface.BOLD),0, infoItemName[1].length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        genre.setSpan(ForegroundColorSpan(Color.BLACK),0, infoItemName[1].length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        val year = SpannableStringBuilder(infoItemName[0]+"\n"+arrInfo[0])
        year.setSpan(StyleSpan(Typeface.BOLD),0, infoItemName[0].length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        year.setSpan(ForegroundColorSpan(Color.BLACK),0, infoItemName[0].length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.detailNovelImage.setImageResource(image!!)
        binding.detailNovelTitle.text = title
        binding.detailNovelWriter.text = "by $writer"
        binding.detailNovelYear.text = year
        binding.detailNovelGenre.text = genre
        binding.detailNovelInfo.text = overview

        val toast = Toast.makeText(this, binding.detailNovelTitle.text, Toast.LENGTH_SHORT)
        toast.show()
    }
}