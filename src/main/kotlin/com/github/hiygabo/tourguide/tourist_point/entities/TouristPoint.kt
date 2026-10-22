package com.github.hiygabo.tourguide.tourist_point.entities

import com.github.hiygabo.tourguide.category.entities.Category
import com.github.hiygabo.tourguide.schedule.entities.Schedule
import com.github.hiygabo.tourguide.tour.entities.Tour
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Column
import jakarta.persistence.FetchType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import org.locationtech.jts.geom.Point


@Entity
@Table(name = "TOURIST_POINT")
class TouristPoint (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name= "id_tourist_point", unique = true, nullable = false)
    var idTouristPoint: Long? = null,

    @Column( name = "name_point", nullable = false)
    var namePoint: String? = null,

    @Column( name = "location", columnDefinition = "geometry(Point, 4326)")
    var location: Point? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_category")
    var category: Category? = null,

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn( name = "id_schedule")
    var schedule: Schedule? = null,

    @OneToMany (mappedBy = "originPoint")
    var tourAsOrigin: MutableList<Tour> = mutableListOf(),

    @OneToMany (mappedBy = "destinyPoint")
    var tourAsDestiny: MutableList<Tour> = mutableListOf()



)