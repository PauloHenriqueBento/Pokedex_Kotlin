package com.paulo.pokedex.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.paulo.pokedex.R
import com.paulo.pokedex.domain.Pokemon
import com.paulo.pokedex.domain.PokemonType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.rvPokemons)

        val bulbasaur = Pokemon(
            "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/001.png",
            1,
            "Bulbasaur",
            listOf(
                PokemonType("Grass"),
                PokemonType("poison")
            )
        )
        val pokemons = listOf(bulbasaur, bulbasaur, bulbasaur, bulbasaur, bulbasaur)

        val layoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = PokemonAdapter(pokemons)
    }
}