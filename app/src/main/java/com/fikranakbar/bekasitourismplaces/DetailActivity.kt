package com.fikranakbar.bekasitourismplaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.fikranakbar.bekasitourismplaces.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object {
        const val TOURISM_PLACE_DATA = "tourism_place_data"
    }

    private lateinit var binding: ActivityDetailBinding
    private lateinit var tourismPlace: TourismPlace

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent.getParcelableExtra<TourismPlace>(TOURISM_PLACE_DATA)?.also { tourismPlace = it }

        setBackButton()
        setDetailInformation()
    }

    private fun setDetailInformation() {
        binding.apply {
            tvDescription.text = tourismPlace.desc
            tvTitlePlace.text = tourismPlace.name
            tvLocationContent.text = tourismPlace.location
            tvOperationHoursContent.text = tourismPlace.operationHour
            tvTicketPricesContent.text = tourismPlace.ticketPrice

            Glide.with(this@DetailActivity)
                .load(tourismPlace.imageHeader)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(ivHeader)
        }
    }

    private fun setBackButton() {
        binding.cvBackButton.setOnClickListener {
            finish()
        }
    }
}