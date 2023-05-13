package com.example.github2.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.github2.databinding.ItemFilmBinding
import com.example.github2.model.FilmModel

class FilmAdapter(private var listFilm : MutableList<FilmModel>) : RecyclerView.Adapter<FilmAdapter.ViewHolder>() {

    class ViewHolder(var binding: ItemFilmBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(filmModel: FilmModel) {
            Glide.with(binding.ivImage.context)
                .load(filmModel.img)
                .into(binding.ivImage)
            binding.txtName.text = filmModel.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemFilmBinding.inflate(
            LayoutInflater.from(
                parent.context
            ), parent,
            false
        ))
    }

    override fun getItemCount(): Int = listFilm.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(listFilm[position])
    }
}