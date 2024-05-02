package com.test.excotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ThirdActivity : AppCompatActivity() {

    var dataSource: MutableList<PlanetData> = mutableListOf()
    lateinit var planetListView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        setupList()
    }

    private fun setupList() {
        planetListView = findViewById(R.id.planetListView)

        dataSource = mutableListOf(
            PlanetData("Earth","1 Moon", R.drawable.earth),
            PlanetData("Mercury","1 Moon", R.drawable.mercury),
            PlanetData("Venus","1 Moon", R.drawable.venus),
            PlanetData("Mars","1 Moon", R.drawable.mars),
            PlanetData("Jupiter","1 Moon", R.drawable.jupiter),
            PlanetData("Saturn","1 Moon", R.drawable.saturn)
        )

        val adapter = PlanetCustomAdapter(this, dataSource)
        planetListView.adapter = adapter
    }
}