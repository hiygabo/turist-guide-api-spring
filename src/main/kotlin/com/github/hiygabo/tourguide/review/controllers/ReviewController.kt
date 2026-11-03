package com.github.hiygabo.tourguide.review.controllers

import com.github.hiygabo.tourguide.review.entities.Review
import com.github.hiygabo.tourguide.review.services.ReviewService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/review")
class ReviewController (
    val reviewService: ReviewService
){
    fun getReviews(): List<Review>{
        return reviewService.getReviews()
    }
}