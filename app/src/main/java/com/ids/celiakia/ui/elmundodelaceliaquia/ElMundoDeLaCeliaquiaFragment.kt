package com.ids.celiakia.ui.elmundodelaceliaquia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.ids.celiakia.R
import com.ids.celiakia.Titulos


class ElMundoDeLaCeliaquiaFragment : Fragment() {

  private lateinit var elMundoDeLaCeliaquiaModel: ElMundoDeLaCeliaquiaViewModel
    private lateinit var listView : ListView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val v: View = inflater.inflate(R.layout.fragment_elmundodelaceliaquia, container, false)
        val listView: ListView = v.findViewById(R.id.elmundodelaceliaquia_list_view)

// 1
        val titulosList = Titulos.getTitulosFromFile("elmundotitulos.json", v.context)

        val adapter = TitulosAdapter(v.context, titulosList)
        listView.adapter = adapter


    return v
    }
}