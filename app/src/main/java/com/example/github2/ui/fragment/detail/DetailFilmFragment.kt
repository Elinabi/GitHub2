package com.example.github2.ui.fragment.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.github2.R
import com.example.github2.databinding.FragmentDetailFilmBinding

class DetailFilmFragment : Fragment() {

    private var binding: FragmentDetailFilmBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentDetailFilmBinding.inflate(inflater,container,false)
        return binding!!.root
    }
}