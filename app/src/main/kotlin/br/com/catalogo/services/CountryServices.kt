package br.com.catalogo.services

import br.com.catalogo.domain.Country

// Não permitir paises que não sejam o Brasil
class CountryServices {

    fun validaPais(country: Country) {

        if(country.mcc != 724) {
            throw Exception("O pais ${country.name} não é permitido")
        }

    }


}