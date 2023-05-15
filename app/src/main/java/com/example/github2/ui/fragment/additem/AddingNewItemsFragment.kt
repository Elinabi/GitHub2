package com.example.github2.ui.fragment.additem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.example.github2.databinding.FragmentAddingNewItemsBinding

class AddingNewItemsFragment : Fragment() {

    private lateinit var binding: FragmentAddingNewItemsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddingNewItemsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
    }

    private fun setupListener() {
        binding.saveBtn.setOnClickListener{
            val text = binding.textEt.text.toString()
            val action: NavDirections =
                AddingNewItemsFragmentDirections.actionAddingNewItemsFragment2ToFilmFragment().setTextsave(text)
            findNavController().navigate(action)
        }
    }
}