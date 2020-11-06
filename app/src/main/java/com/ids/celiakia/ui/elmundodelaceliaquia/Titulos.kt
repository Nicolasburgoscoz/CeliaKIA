package com.ids.celiakia

import android.content.Context
import com.ids.celiakia.ui.elmundodelaceliaquia.ElMundoDeLaCeliaquiaFragment
import org.json.JSONException
import org.json.JSONObject


class Titulos(
    val title: String)
{

    companion object {

        fun getTitulosFromFile(filename: String, context: Context): ArrayList<Titulos> {
            val titulosList = ArrayList<Titulos>()

            try {
                // Load data
                val jsonString = loadJsonFromAsset("elmundotitulos.json", context)
                val json = JSONObject(jsonString)
                val titulos = json.getJSONArray("titulos")

                // Get Titulos objects from data
                (0 until titulos.length()).mapTo(titulosList) {
                    Titulos(titulos.getJSONObject(it).getString("title"))
                }
            } catch (e: JSONException) {
                e.printStackTrace()
            }

            return titulosList
        }

        private fun loadJsonFromAsset(filename: String, context: Context): String? {
            var json: String? = null

            try {
                val inputStream = context.assets.open(filename)
                val size = inputStream.available()
                val buffer = ByteArray(size)
                inputStream.read(buffer)
                inputStream.close()
                json = String(buffer, Charsets.UTF_8)
            } catch (ex: java.io.IOException) {
                ex.printStackTrace()
                return null
            }

            return json
        }
    }
}