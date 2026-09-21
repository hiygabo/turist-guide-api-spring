package com.github.hiygabo.tourguide.schedule.entities

import com.github.hiygabo.tourguide.tourist_point.entities.TouristPoint
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.OneToOne
import java.time.LocalTime

@Entity
@Table(name="SCHEDULE")
class Schedule(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_schedule", unique = true, nullable = false)
    val idSchedule: Long? = null,

    @Column(name = "opening_time", nullable = false)
    val openingTime: LocalTime? = null,

    @Column(name = "closing_time", nullable = false)
    val closingTime: LocalTime? = null,

    @Column(name = "status", nullable = false)
    val status: String? = null,

    @OneToOne( mappedBy = "schedule")
    val point: TouristPoint? = null,

)