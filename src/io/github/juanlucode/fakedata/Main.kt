package io.github.juanlucode.fakedata

import io.github.juanlucode.fakedata.model.PersonCC
import io.github.juanlucode.fakedata.model.TGenre
import io.github.juanlucode.fakedata.model.JAXBObjectHandler
import java.io.File
import io.github.juanlucode.fakedata.model.countries.Countries
import io.github.juanlucode.fakedata.model.countries.Countries.Country
import io.github.juanlucode.fakedata.model.Person


fun main(args: Array<String>) {
    println("Fake-data!")
    
    println()

    // get genre
    val personCC = PersonCC()
    do {
	    println("> Genre ? (F)emale, (M)ale or both (empty): ")
	    personCC.genre = when ( readLine() ) {
	        				"F" -> TGenre.FEMALE
	        				"M" -> TGenre.MALE
	        				else -> {null}
	    }
    } while (!(personCC.genre == TGenre.FEMALE || personCC.genre == TGenre.MALE || personCC.genre == null))
    // show countries list from xml file.
    
    val countries = JAXBObjectHandler.cargar(Countries::class.java, File("./data/country/countries.xml"))
    
	if (countries != null){
		val itCountry = countries.getCountryList().iterator()
		var countriesHashMap: MutableMap<String, Country> = mutableMapOf()
		
		while (itCountry.hasNext()){
	        val _country = itCountry.next()
	        println(" ${_country.code} - ${_country.name} ")
			countriesHashMap.put(_country.code!!, _country)
	    }    
	    
	    // get country
	    
	    var country: String?
	    println("Nationality (Return for anyone of availables; multi-selection, separates by comma): ")
	    country = readLine()
		if (country == null || country.isBlank() || country.isEmpty())
			personCC.nationality.addAll(countriesHashMap.values)
		else 
			for (_country in country.split(",") ){
				if ( countriesHashMap.containsKey(_country.trim().toUpperCase()))
			    	personCC.nationality.add(countriesHashMap.getValue(_country.trim().toUpperCase())) 
			}
	}
    // get minimum age
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
    
    // get maximum age
    
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
    
    // get amount of fake people
    
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
	
	personCC.loadDataCountries()
	
	println(personCC.nationality.get(0).name)
	println(personCC.nationality.get(0).firstNamesFemaleList?.get(0))
	
	var id = 1
	while (id <= personCC.amount){
		val newPerson = Person(id, personCC)
		println(newPerson)
		id++
	}
		
	
}