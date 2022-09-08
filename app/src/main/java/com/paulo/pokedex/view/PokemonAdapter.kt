package com.paulo.pokedex.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.paulo.pokedex.R
import com.paulo.pokedex.domain.Pokemon

class PokemonAdapter(
    private val items: List<Pokemon>
) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pokemon_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.bindView(item)
    }

    //Equivalente a uma ArrowFunction
    override fun getItemCount() = items.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(item: Pokemon) = with(itemView) {
            val ivPokemon : ImageView = findViewById(R.id.ivPokemon)
            val tvNumber : TextView = findViewById(R.id.tvNumber)
            val tvName : TextView = findViewById(R.id.tvName)
            val tvType1 : TextView = findViewById(R.id.tvType1)
            val tvType2 : TextView = findViewById(R.id.tvType2)

            // TODO: Load image with Glide

            tvNumber.text = "Nº ${item.formatterNumber}"
            tvName.text = item.name
            tvType1.text = item.types[0].name

            if(item.types.size > 1){
                tvType2.visibility = View.VISIBLE
                tvType2.text = item.types[1].name
            } else {
                tvType2.visibility = View.GONE
            }
        }
    }


}