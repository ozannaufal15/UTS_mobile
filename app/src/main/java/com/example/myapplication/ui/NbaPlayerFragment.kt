package com.example.myapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.NbaPlayer
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentNbaPlayerBinding

class NbaPlayerFragment : Fragment() {

    private var _binding: FragmentNbaPlayerBinding? = null
    private val binding get() = _binding!!
    private var listNbaPlayer: List<NbaPlayer>

    init {
        listNbaPlayer = listOf(
            NbaPlayer(),
            NbaPlayer(),
            NbaPlayer(),
            NbaPlayer(),
            NbaPlayer(),
            NbaPlayer(),
            NbaPlayer())
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentNbaPlayerBinding.inflate(inflater, container, false)
        val root = binding.root
        return root
    }
}