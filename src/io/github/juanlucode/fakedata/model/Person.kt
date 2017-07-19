package io.github.juanlucode.fakedata.model

import java.time.LocalDate

data class Person(
        			val id : Int,
                    val firstName : String,
                    val lastName : String,
                    val genre : TGenre,
                    val birthDate : LocalDate,
                    val nationality : Country)  {
}