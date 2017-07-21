package io.github.juanlucode.fakedata.model

data class PersonCC(

				genre: TGenre? = null,
                minAge: Int = 0,
                maxAge: Int = 99,
                nationality: Country? = null,
				amount: Int = 1) {
}