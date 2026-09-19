package com.github.hiygabo.tourguide

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TourguideApplication

fun main(args: Array<String>) {
	runApplication<TourguideApplication>(*args)
}
