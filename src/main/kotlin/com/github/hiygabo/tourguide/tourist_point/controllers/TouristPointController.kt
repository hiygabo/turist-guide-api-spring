package com.github.hiygabo.tourguide.tourist_point.controllers

import com.github.hiygabo.tourguide.tourist_point.entities.TouristPoint
import com.github.hiygabo.tourguide.tourist_point.services.TouristPointService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/point")
class TouristPointController(
    val touristPointService : TouristPointService
) {
    
    @GetMapping
    fun getPoints() : List<TouristPoint>{
        return touristPointService.getPoints()
    }
    
}