package com.example.myapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Movie
import com.example.myapplication.MovieAdapter
import com.example.myapplication.databinding.FragmentMovieBinding

class MovieFragment : Fragment() {

    private var _binding: FragmentMovieBinding? = null
    private val binding get() = _binding!!
    private var listMovie: List<Movie> = Movie.getListNovel(15)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentMovieBinding.inflate(inflater, container, false)
        val root = binding.root

        // Create RecyclerView and attach its adapter
        val rv = binding.movieRv
        rv.layoutManager = LinearLayoutManager(activity)
        rv.adapter = MovieAdapter(listMovie)
        return root
    }
}