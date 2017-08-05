package io.github.juanlucode.fakedata.model

import java.time.LocalDate
import io.github.juanlucode.fakedata.model.countries.Countries.Country
import io.github.juanlucode.fakedata.tools.randomInt

data class Person(
        			val id : Int,
                    var firstName : String,
                    var lastName : String,
                    var genre : TGenre?,
                    var birthDate : LocalDate?,
                    var nationality : Country?)  {
	constructor(_id: Int, personCC: PersonCC): this(_id, "", "", null, null, null){
		
	}
	
	fun randomPerson(_personCC: PersonCC){
		this.genre = randomGenre()
		this.nationality = randomNationality(_personCC.nationality)
		this.lastName = randomLastName(this.nationality!!)
		this.firstName = randomFirstName(this.genre!!, this.nationality!!)
		this.birthDate = randomBirthDate()
	}
	
	fun randomGenre(): TGenre = when ( randomInt() ){
		0 -> TGenre.FEMALE
		else -> TGenre.MALE
	}
	
	
	fun randomNationality(_countries: List<Country>): Country =
		_countries.get(randomInt(max=_countries.size.minus(1)))
		
	
	fun randomLastName(_country: Country): String =
		_country.lastNamesList!!.get(randomInt(max=_country.lastNamesList!!.size.minus(1) ))
	
	fun randomFirstName(_genre: TGenre, _country: Country): String {
		
	}
	
	fun randomBirthDate(): LocalDate {
		
	}
}