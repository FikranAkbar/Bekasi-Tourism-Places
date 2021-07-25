package com.fikranakbar.bekasitourismplaces

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.fikranakbar.bekasitourismplaces.databinding.ItemRowTourismPlaceBinding

class TourismPlaceAdapter : RecyclerView.Adapter<TourismPlaceAdapter.CustomViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    private val tourismPlaces = ArrayList<TourismPlace>()

    fun setList(list: List<TourismPlace>) {
        tourismPlaces.clear()
        tourismPlaces.addAll(list)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class CustomViewHolder(private val binding: ItemRowTourismPlaceBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: TourismPlace) {
            binding.apply {
                tvTitlePlace.text = data.name
                tvDescription.text = data.desc
                Glide.with(itemView.context)
                    .load(data.imageHeader)
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .into(ivHeader)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TourismPlaceAdapter.CustomViewHolder {
        return CustomViewHolder(
            ItemRowTourismPlaceBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TourismPlaceAdapter.CustomViewHolder, position: Int) {
        holder.bind(tourismPlaces[position])
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(tourismPlaces[position]) }
    }

    override fun getItemCount(): Int {
        return tourismPlaces.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: TourismPlace)
    }
}