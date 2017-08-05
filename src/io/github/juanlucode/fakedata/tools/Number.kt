package io.github.juanlucode.fakedata.tools

fun randomInt(min: Int = 0, max: Int = 1): Int =
	(Math.random() * (max - 1) + min).toInt()
