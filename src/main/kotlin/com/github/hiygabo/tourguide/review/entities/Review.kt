package com.github.hiygabo.tourguide.review.entities

import com.github.hiygabo.tourguide.tourist_point.entities.TouristPoint
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table


@Entity
@Table(name="REVIEW")
class Review(
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "id_review", unique = true, nullable = false)
    var idReview: Long? = null,

    @Column( name = "description", nullable = false)
    var description: String? = null,

    @Column ( name = "stars_count", nullable = false)
    var starsCount: Int = 0,

    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn( name = "id_tourist_point")
    var touristPoint: TouristPoint? = null
)