package com.github.hiygabo.tourguide.tour.controllers

import com.github.hiygabo.tourguide.tour.entities.Tour
import com.github.hiygabo.tourguide.tour.services.TourService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tour")
class TourController(
    val tourService : TourService
){
    @GetMapping
    fun getTours() : List<Tour>{
        return tourService.getTours()
    }
}