package io.github.juanlucode.fakedata.model

import io.github.juanlucode.fakedata.model.countries.Countries.Country
import java.io.File

data class PersonCC(

				var genre: TGenre? = null,
                var minAge: Int = 0,
                var maxAge: Int = 99,
                var nationality: MutableList<Country> = mutableListOf(),
				var amount: Int = 1) {
	
	fun loadDataCountries(): Boolean{
		var ok = true
		var path: String
		
		for (_country in this.nationality){
			path = "./data/country/${_country.code?.toLowerCase()}/"
			_country.lastNamesList = mutableListOf() 
			File(path + "last_names.txt").forEachLine{
				_country.lastNamesList?.add(it)
			}
			if ( this.genre == null || this.genre == TGenre.FEMALE){
				_country.firstNamesFemaleList = mutableListOf()
				File(path + "first_names_female.txt").forEachLine{
					_country.firstNamesFemaleList?.add(it)
				}
			}

			if ( this.genre == null || this.genre == TGenre.MALE){
				_country.firstNamesMaleList = mutableListOf()
				File(path + "first_names_male.txt").forEachLine{
					_country.firstNamesMaleList?.add(it)
				}
			}

		}
		
		return ok
	}
}