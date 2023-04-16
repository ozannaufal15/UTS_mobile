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

        val image = intent?.extras?.getInt("novelImage")
        val title = intent?.extras?.getString("novelTitle")
        val writer = intent?.extras?.getString("novelWriter")
        val info = intent?.extras?.getInt("novelInfo")
        val arrInfo = resources.getStringArray(info!!)
        val infoItemName = resources.getStringArray(R.array.novelinfoitemname)
        binding.detailNovelImage.setImageResource(image!!)
        binding.detailNovelTitle.text = title
        binding.detailNovelWriter.text = writer
        binding.detailNovelYear.text = infoItemName[0]
        binding.detailNovelYear.append("\n"+arrInfo[0])
        binding.detailNovelGenre.text = infoItemName[1]
        binding.detailNovelGenre.append("\n"+arrInfo[1])
        binding.detailNovelInfo.text = infoItemName[2]
        binding.detailNovelInfo.append("\n"+arrInfo[2])


        val toast = Toast.makeText(this, binding.detailNovelTitle.text, Toast.LENGTH_SHORT)
        toast.show()
    }
}