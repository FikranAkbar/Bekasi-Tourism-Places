package com.fikranakbar.bekasitourismplaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fikranakbar.bekasitourismplaces.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object {
        const val TOURISM_PLACE_DATA = "tourism_place_data"
    }

    private lateinit var binding: ActivityDetailBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}