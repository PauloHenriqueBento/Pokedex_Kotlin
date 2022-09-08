package com.paulo.pokedex.domain

data class Pokemon (
    val imageUrl: String,
    val number: Int,
    val name: String,
    val types: List<PokemonType>
) {
    val formatterNumber = number.toString().padStart(3, '0')
}

