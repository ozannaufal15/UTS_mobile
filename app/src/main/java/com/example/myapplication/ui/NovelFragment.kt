package com.example.myapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Novel
import com.example.myapplication.NovelAdapter
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentNovelBinding

class NovelFragment : Fragment() {
    private var _binding: FragmentNovelBinding? = null
    private val binding get() = _binding!!
    private var listNovel: List<Novel> = Novel.getListNovel(15)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentNovelBinding.inflate(inflater, container, false)
        val root = binding.root
        val rv = binding.novelRv
        rv.layoutManager = LinearLayoutManager(activity)
        rv.adapter = NovelAdapter(listNovel)

        return root
    }
}