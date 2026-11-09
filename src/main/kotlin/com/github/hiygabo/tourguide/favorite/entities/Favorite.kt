package com.github.hiygabo.tourguide.favorite.entities

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
import java.time.LocalDateTime

@Entity
@Table(name = "FAVORITE")
class Favorite (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_favorite", unique = true, nullable = false)
    val idFavorite: Long? = null,

    @Column(name = "added_at",  nullable = false)
    var addedAt: LocalDateTime = LocalDateTime.now(),

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn( name = "id_tourist_point")
    var touristPoint: TouristPoint? = null,

    )