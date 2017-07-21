package io.github.juanlucode.fakedata

import io.github.juanlucode.fakedata.model.Country

fun main(args: Array<String>) {
    println("Fake-data!")
    
    val countries: MutableList<Country> = mutableListOf(Country("ESP", "Spain"),
    													Country("FRA", "France")
            )
    
    
    for ( country: Country in countries){
        println(" ${country.code} - ${country.name} ")
    }
}