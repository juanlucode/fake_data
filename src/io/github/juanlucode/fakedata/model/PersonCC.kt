package io.github.juanlucode.fakedata.model

import io.github.juanlucode.fakedata.model.countries.Countries.Country

data class PersonCC(

				var genre: TGenre? = null,
                var minAge: Int = 0,
                var maxAge: Int = 99,
                var nationality: MutableList<Country>? = mutableListOf(),
				var amount: Int = 1) {
}