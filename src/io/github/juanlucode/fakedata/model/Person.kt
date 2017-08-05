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
		randomPerson(personCC)
	}
	
	fun randomPerson(_personCC: PersonCC){
		this.genre = randomGenre()
		this.nationality = randomNationality(_personCC.nationality)
		this.lastName = randomLastName(this.nationality!!)
		this.firstName = randomFirstName(this.genre!!, this.nationality!!)
		this.birthDate = randomBirthDate(minAge=_personCC.minAge, maxAge=_personCC.maxAge, dateRef=LocalDate.now())
	}
	
	fun randomGenre(): TGenre = when ( randomInt() ){
		0 -> TGenre.FEMALE
		else -> TGenre.MALE
	}
	
	
	fun randomNationality(_countries: List<Country>): Country =
		_countries.get(randomInt(max=_countries.size.minus(1)))
		
	
	fun randomLastName(_country: Country): String =
		_country.lastNamesList!!.get(randomInt(max=_country.lastNamesList!!.size.minus(1) ))
	
	fun randomFirstName(_genre: TGenre, _country: Country) =
		if (_genre == TGenre.FEMALE ){
			_country.firstNamesFemaleList!!.get(randomInt(max=_country.firstNamesFemaleList!!.size.minus(1)))
		} else {
			_country.firstNamesMaleList!!.get(randomInt(max=_country.firstNamesMaleList!!.size.minus(1)))
		}
	
	fun randomBirthDate(minAge: Int, maxAge: Int, dateRef: LocalDate): LocalDate? {
		// year
		val year = randomInt(min=dateRef.year.minus(maxAge), max=dateRef.year.minus(minAge))
		val mounth = randomInt(min=1, max=12)
		val day = when (mounth){
			1, 3, 5, 7, 8, 10, 12 -> randomInt(min=1, max=31)
			4, 6, 9, 11 -> randomInt(min=1, max=30)
			else -> randomInt(min=1, max=28)
		}
		return LocalDate.of(year, mounth, day)
		//return null
	}
}