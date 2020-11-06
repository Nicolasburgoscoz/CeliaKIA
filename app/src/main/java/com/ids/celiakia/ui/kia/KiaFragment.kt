package com.ids.celiakia.ui.kia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.ids.celiakia.R
import com.ids.celiakia.Titulos
import com.ids.celiakia.ui.elmundodelaceliaquia.TitulosAdapter


class KiaFragment : Fragment() {

//      private lateinit var elMundoDeLaCeliaquiaModel: ElMundoDeLaCeliaquiaViewModel
        private lateinit var kialistView : ListView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val v: View = inflater.inflate(R.layout.fragment_kia, container, false)
        val kialistView: ListView = v.findViewById(R.id.kia_list_view)

        val valores = arrayOf(
            "KIA",
            "Historia de KIA",
            "Sobre nosotros",
            "Explicación de la función de KIA en la App"
        )

        val adapter = KiaListAdapter(v.context, valores)
        kialistView.adapter = adapter
        return v
        }
    }