package io.github.juanlucode.fakedata.model

import java.time.LocalDate
import io.github.juanlucode.fakedata.model.countries.Countries.Country



data class Person(
        			val id : Int,
                    val firstName : String,
                    val lastName : String,
                    val genre : TGenre,
                    val birthDate : LocalDate,
                    val nationality : Country)  {
}