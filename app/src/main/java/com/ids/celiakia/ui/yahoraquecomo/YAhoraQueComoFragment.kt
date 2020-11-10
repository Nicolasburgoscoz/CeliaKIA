package com.ids.celiakia.ui.yahoraquecomo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.ids.celiakia.R
import com.ids.celiakia.ui.elmundodelaceliaquia.TitulosAdapter


class YAhoraQueComoFragment : Fragment() {

//    private lateinit var yAhoraQueComoModel: YAhoraQueComoViewModel
    private lateinit var recipelistView : ListView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val v: View = inflater.inflate(R.layout.fragment_yahoraquecomo, container, false)
        val listView: ListView = v.findViewById(R.id.recipe_list_view)

// 1
        val recipeList = Recipe.getRecipesFromFile("recipes.json", v.context)

        val adapter = RecipeAdapter(v.context, recipeList)
        listView.adapter = adapter

        return v
    }
}