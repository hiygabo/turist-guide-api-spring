package com.github.hiygabo.tourguide.review.services

import com.github.hiygabo.tourguide.review.entities.Review
import com.github.hiygabo.tourguide.review.repositories.ReviewRepository
import com.github.hiygabo.tourguide.schedule.repositories.ScheduleRepository
import org.springframework.stereotype.Service

@Service
class ReviewService (
    private val reviewRepository: ReviewRepository
){
    fun getReviews(): List<Review>{
        return reviewRepository.findAll()
    }
}