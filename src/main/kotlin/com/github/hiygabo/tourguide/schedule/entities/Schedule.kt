package com.github.hiygabo.tourguide.schedule.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import java.time.LocalTime

@Entity
@Table(name="SCHEDULE")
class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_schedule", unique = true, nullable = false)
    var idSchedule: Long? = null

    @Column(name = "opening_time", nullable = false)
    var openingTime: LocalTime? = null

    @Column(name = "closing_time", nullable = false)
    var closingTime: LocalTime? = null

    @Column(name = "status", nullable = false)
    var status: String? = null

}