package com.ids.celiakia.ui.yahoraquecomo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.ids.celiakia.R

class YAhoraQueComoFragment : Fragment() {

    private lateinit var yahoraquecomoViewModel: YAhoraQueComoViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        yahoraquecomoViewModel =
            ViewModelProviders.of(this).get(YAhoraQueComoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_yahoraquecomo, container, false)
        val textView: TextView = root.findViewById(R.id.y_ahora_que_como)
        yahoraquecomoViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}