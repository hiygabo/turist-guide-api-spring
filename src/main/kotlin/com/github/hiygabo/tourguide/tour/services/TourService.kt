package com.github.hiygabo.tourguide.tour.services

import com.github.hiygabo.tourguide.tour.repositories.TourRepository
import com.github.hiygabo.tourguide.tour.entities.Tour
import org.springframework.stereotype.Service

@Service
class TourService (
    private val tourRepository: TourRepository
){
    fun getTours(): List<Tour>{
        return tourRepository.findAll()
    }
}