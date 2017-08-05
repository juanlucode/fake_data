package io.github.juanlucode.fakedata.tools


//  int valorEntero = Math.floor(Math.random()*(N-M+1)+M);  // Valor entre M y N, ambos incluidos.
fun randomInt(min: Int = 0, max: Int = 1): Int =
	(Math.random() * (max - min + 1) + min ).toInt() 
