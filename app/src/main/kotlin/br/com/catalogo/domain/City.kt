package br.com.catalogo.domain

import java.time.LocalDateTime

data class City(
    val id: Int? = null,
    val name: String,
    val country: Country,
    val lastUpdate: LocalDateTime
)
