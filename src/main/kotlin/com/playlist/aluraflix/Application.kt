package com.playlist.aluraflix

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.playlist.aluraflix")
		.start()
}

