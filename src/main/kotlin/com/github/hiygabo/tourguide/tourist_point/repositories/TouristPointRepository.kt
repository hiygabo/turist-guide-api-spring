package com.github.hiygabo.tourguide.tourist_point.repositories

import com.github.hiygabo.tourguide.tourist_point.entities.TouristPoint
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TouristPointRepository : JpaRepository<TouristPoint, Long> {
    
}