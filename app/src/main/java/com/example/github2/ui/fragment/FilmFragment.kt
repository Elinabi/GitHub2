package com.example.github2.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.github2.R
import com.example.github2.databinding.FragmentFilmBinding


class FilmFragment : Fragment() {

    private var binding: FragmentFilmBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentFilmBinding.inflate(inflater, container, false)
        return binding!!.root
    }
}