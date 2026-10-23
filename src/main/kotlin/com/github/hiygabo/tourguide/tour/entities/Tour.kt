package com.github.hiygabo.tourguide.tour.entities

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
import java.time.LocalDate
import org.locationtech.jts.geom.LineString

@Entity
@Table(name = "TOUR")
class Tour(
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id_tour", unique = true, nullable = false)
     var idTour: Long? = null,

     @Column(name = "tour_name", unique = true, nullable = false)
     var tourName: String? = null,

     @Column(name = "tour_date", nullable = false)
     var tourDate: LocalDate? = null,

     @Column(name = "route", columnDefinition = "geometry(LineString, 4326)")
     var route: LineString? = null,

     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn( name = "id_origin_point")
     var originPoint: TouristPoint? = null,

     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn( name = "id_destiny_point")
     var destinyPoint: TouristPoint?  = null

)
