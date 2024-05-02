package com.test.excotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
import java.util.zip.Inflater

class PlanetCustomAdapter(val contex: Context, val planets: List<PlanetData>): BaseAdapter() {
    override fun getCount(): Int {
        return  planets.size
    }

    override fun getItem(position: Int): Any {
        return planets[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = contex.getSystemService(
            Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val view: View
        if (convertView == null) {
             view = inflater.inflate(R.layout.planet_list_layout, parent, false)
        } else {
            view = convertView
        }

        val item = getItem(position) as PlanetData

        val textView = view.findViewById<TextView>(R.id.titleTextView)
        val descriptionView = view.findViewById<TextView>(R.id.textViewDescripTion)
        val imageView = view.findViewById<ImageView>(R.id.imageView)

        textView.text = item.title
        descriptionView.text = item.moonCount
        imageView.setImageResource(item.image)

        return  view

    }
}