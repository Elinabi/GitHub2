package com.example.github2.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.github2.databinding.FragmentFilmBinding
import com.example.github2.model.FilmModel
import com.example.github2.ui.adapter.FilmAdapter

@Suppress("CAST_NEVER_SUCCEEDS")
class FilmFragment : Fragment() {

    private var binding: FragmentFilmBinding? = null
    private var viewModel: FilmViewModel? = null
    private val listFilm = mutableListOf<FilmModel>()
    private val filmAdapter = FilmAdapter(listFilm,this::onItemClick)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentFilmBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this)[FilmViewModel::class.java]

        initialize()
        setupObserves()
    }

    private fun initialize() {
        binding?.mangaRecView?.adapter = filmAdapter
    }

    private fun setupObserves() {
        viewModel?.getListPictures()?.observe(viewLifecycleOwner){
            filmAdapter.setupObserves(it as ArrayList<FilmModel>)
        }
    }

    private fun onItemClick(filmModel: FilmModel) {
        findNavController().navigate(FilmFragmentDirections.actionFilmFragmentToDetailFilmFragment(
            filmModel.img,
            filmModel.name)
        )
    }
}