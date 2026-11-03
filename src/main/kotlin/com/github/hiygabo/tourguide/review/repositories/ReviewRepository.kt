package com.github.hiygabo.tourguide.review.repositories

import com.github.hiygabo.tourguide.review.entities.Review
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ReviewRepository : JpaRepository<Review, Long>{
}