package com.example.github2.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.github2.databinding.ItemFilmBinding
import com.example.github2.model.FilmModel
import java.util.ArrayList

class FilmAdapter(
    private var listFilm: MutableList<FilmModel>,
    val onItemClick: (modelBook: FilmModel) -> Unit,
) : RecyclerView.Adapter<FilmAdapter.ViewHolder>() {

    @SuppressLint("NotifyDataSetChanged")
    fun setupObserves(modelPictures: ArrayList<FilmModel>) {
        this.listFilm = modelPictures
        notifyDataSetChanged()
    }

    inner class ViewHolder(var binding: ItemFilmBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                onItemClick(listFilm[adapterPosition])
            }

        }

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
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(listFilm[position])
    }

    override fun getItemCount(): Int = listFilm.size
}