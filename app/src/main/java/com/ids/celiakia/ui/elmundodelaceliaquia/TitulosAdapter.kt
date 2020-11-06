package com.ids.celiakia.ui.elmundodelaceliaquia

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.ids.celiakia.R
import com.ids.celiakia.Titulos

class TitulosAdapter(private val context: Context,
                     private val dataSource: ArrayList<Titulos>) : BaseAdapter() {

    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    //1
    override fun getCount(): Int {
        return dataSource.size
    }

    //2
    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    //3
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    //4
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Get view for row item
        val rowView = inflater.inflate(R.layout.list_item_titulos, parent, false)

        // Get title element
        val titleTextView = rowView.findViewById(R.id.titulos_list_title) as TextView

        // 1
        val titulos = getItem(position) as Titulos

// 2
        titleTextView.text = titulos.title
        return rowView
    }

}