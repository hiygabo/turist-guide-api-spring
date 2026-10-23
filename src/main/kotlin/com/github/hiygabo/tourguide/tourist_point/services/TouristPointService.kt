package com.github.hiygabo.tourguide.tourist_point.services

import com.github.hiygabo.tourguide.tourist_point.repositories.TouristPointRepository
import com.github.hiygabo.tourguide.tourist_point.entities.TouristPoint
import org.springframework.stereotype.Service

@Service
class TouristPointService(
    private val touristPointRepository : TouristPointRepository
) {
    
    fun getPoints() : List<TouristPoint> {
        return touristPointRepository.findAll()
    }
    
}