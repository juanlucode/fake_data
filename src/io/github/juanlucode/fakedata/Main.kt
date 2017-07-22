package io.github.juanlucode.fakedata

import io.github.juanlucode.fakedata.model.Country
import io.github.juanlucode.fakedata.model.PersonCC
import io.github.juanlucode.fakedata.model.TGenre

fun main(args: Array<String>) {
    println("Fake-data!")
    
    val countries: MutableList<Country> = mutableListOf(
            											Country("ESP", "Spain"),
                                                        Country("FRA", "France")
                                          )
    
    
    for ( country: Country in countries){
        println(" ${country.code} - ${country.name} ")
    }
    
    
    
    val personCC = PersonCC()
    println("> Genre ? (F)emale, (M)ale or both (empty): ")
    personCC.genre = when ( readLine() ) {
        				"F" -> TGenre.FEMALE
        				"M" -> TGenre.MALE
        				else -> {null}
    }
    var age: String?
    do {
	    println("> Minimum Age (0 - 100): ")
	    age = readLine()
	    
	    personCC.minAge = if (age == null) 0
        				else
						    try{
						        age.toInt()
						    }  catch(e: NumberFormatException) {
						        0
						    }
    } while(!(personCC.minAge >= 0 && personCC.minAge <= 100) )
    
    do {
        println("> Maximum age (${personCC.minAge} - 100): ")
        age = readLine()
        personCC.maxAge = if (age == null) 0
                        else
                            try{
                                age.toInt()
                            }  catch(e: NumberFormatException) {
                                0
                            }
        
    } while (!(personCC.maxAge >= personCC.minAge && personCC.maxAge <= 100) )
    
    var amount: String?
    do {
        println("> Amount of persons (1 - 1000): ")
        amount = readLine()
        personCC.amount = if (amount == null) 1
        				else
                            try{
                                amount.toInt()
                            }  catch(e: NumberFormatException) {
                                0
                            }            
    } while (!(personCC.amount > 0 && personCC.amount <= 1000))
    
    println(personCC)
    
}