package com.example.github2.ui.fragment.film

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.github2.R
import com.example.github2.databinding.FragmentFilmBinding
import com.example.github2.model.FilmModel
import com.example.github2.repository.FilmRepository
import com.example.github2.ui.adapter.FilmAdapter
import com.example.github2.ui.fragment.additem.AddingNewItemsFragment
import com.example.github2.ui.fragment.detail.DetailFilmFragment

class FilmFragment : Fragment() {

    private var binding: FragmentFilmBinding? = null
    private val listFilm = mutableListOf<FilmModel>()
    private val filmAdapter = FilmAdapter(listFilm, this::onItemClick)
    private val args by navArgs<FilmFragmentArgs>()
    private val repository = FilmRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentFilmBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initialize()
        setupListener()
        getData()
    }

    private fun setupListener() {
        binding?.btnAdd?.setOnClickListener {
            findNavController().navigate(R.id.action_filmFragment_to_addingNewItemsFragment2)
        }
    }

    private fun initialize() {
        binding?.filmRecView?.adapter = filmAdapter
        listFilm.addAll(repository.getListPictures())
    }

    private fun getData() {

        if (args.textsave.isNotEmpty()) {
            listFilm.add(FilmModel("", args.textsave))
        }else{
            Log.e("ELSE", "NOT DATA", )
        }
    }

    private fun onItemClick(filmModel: FilmModel) {
        findNavController().navigate(
            FilmFragmentDirections.actionFilmFragmentToDetailFilmFragment(
                filmModel.img,
                filmModel.name
            )
        )
    }
}