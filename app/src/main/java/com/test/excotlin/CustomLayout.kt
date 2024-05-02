package com.test.excotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import java.util.zip.Inflater

class CustomLayout(private val context: Context, private val list: List<String>): BaseAdapter() {
    override fun getCount(): Int {
        return  list.size
    }

    override fun getItem(position: Int): Any {
        return  list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val infrate = context.getSystemService(
            Context.LAYOUT_INFLATER_SERVICE
        ) as LayoutInflater

        val customView: View
        if (convertView == null) {
            customView = infrate.inflate(R.layout.custom_layout, parent, false)
        } else {
            customView = convertView
        }

        val item =  getItem(position) as String

        val titleTextView = customView.findViewById<TextView>(R.id.customListTextView)

        titleTextView.text = item.toString()

        return  customView
    }

}