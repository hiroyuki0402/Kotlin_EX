package com.test.excotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class SecondActivity : AppCompatActivity() {

    lateinit var myListView: ListView

    var dataSource: MutableList<String> = mutableListOf()

    lateinit var myAdapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        myListView = findViewById(R.id.myListView)

        dataSource = initiateData()

//        myAdapter = ArrayAdapter(
//            this,
//            android.R.layout.simple_list_item_1,
//            dataSource
//        )

        val myCustomAdapter = CustomLayout(this, dataSource)

        myListView.adapter = myCustomAdapter

    }


    private fun initiateData(): MutableList<String>  {
        return mutableListOf("swiftui","swift","java","kotlin")
    }
}