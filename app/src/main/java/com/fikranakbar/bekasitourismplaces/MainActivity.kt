package com.fikranakbar.bekasitourismplaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.fikranakbar.bekasitourismplaces.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var tourismPlaceAdapter: TourismPlaceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setTourismPlaceAdapter()
    }

    private fun setTourismPlaceAdapter() {
        tourismPlaceAdapter = TourismPlaceAdapter()
        tourismPlaceAdapter.setList(TourismPlacesData.listData)
        tourismPlaceAdapter.setOnItemClickCallback(object : TourismPlaceAdapter.OnItemClickCallback {
            override fun onItemClicked(data: TourismPlace) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.TOURISM_PLACE_DATA, data)
                startActivity(intent)
            }
        })
        binding.rvTourismPlace.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = tourismPlaceAdapter
        }
    }
}