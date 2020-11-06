package com.ids.celiakia.ui.kia

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.ids.celiakia.R
import com.ids.celiakia.Titulos

class KiaListAdapter(private val context: Context,
                     private val dataSource: Array<String>) : BaseAdapter() {

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
    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Get view for row item
        val rowView = inflater.inflate(R.layout.kia_item_titulos, parent, false)

        // Get title element
        val titleTextView = rowView.findViewById(R.id.kia_list_title) as TextView

        // 1
        val valores = getItem(position)

// 2
        titleTextView.text = valores as CharSequence?
        return rowView
    }

}