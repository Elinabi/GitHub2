package com.example.github2.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
}