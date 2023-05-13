package com.example.github2.ui.fragment.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.github2.databinding.FragmentDetailFilmBinding

class DetailFilmFragment : Fragment() {

    private lateinit var binding: FragmentDetailFilmBinding
    private val args by navArgs<DetailFilmFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentDetailFilmBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        val image = args.img
        Glide.with(binding.imgDetail.context).load(image).into(binding.imgDetail)
        binding.tvDetail.text = args.name
    }
}