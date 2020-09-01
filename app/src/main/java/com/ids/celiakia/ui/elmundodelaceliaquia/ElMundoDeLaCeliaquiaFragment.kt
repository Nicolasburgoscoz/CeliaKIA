package com.ids.celiakia.ui.elmundodelaceliaquia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.ids.celiakia.R

class ElMundoDeLaCeliaquiaFragment : Fragment() {

    private lateinit var elMundoDeLaCeliaquiaModel: ElMundoDeLaCeliaquiaViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        elMundoDeLaCeliaquiaModel =
            ViewModelProviders.of(this).get(ElMundoDeLaCeliaquiaViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_elmundodelaceliaquia, container, false)
        val textView: TextView = root.findViewById(R.id.text_elmundodelaceliaquia)
        elMundoDeLaCeliaquiaModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}