package com.github.hiygabo.tourguide.tour.repositories
import com.github.hiygabo.tourguide.tour.entities.Tour
import org.springframework.data.jpa.repository.JpaRepository

interface TourRepository : JpaRepository<Tour, Long> {
    
}