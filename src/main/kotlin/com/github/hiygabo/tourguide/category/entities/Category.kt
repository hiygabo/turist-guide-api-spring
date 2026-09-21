package com.github.hiygabo.tourguide.category.entities

import com.github.hiygabo.tourguide.tourist_point.entities.TouristPoint
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table


@Entity
@Table(name = "CATEGORY")
class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_category", unique = true, nullable = false)
    var idCategory: Long? = null

    @Column(name = "category_name", unique = true, nullable = false)
    var categoryName: String? = null

    @OneToMany(mappedBy = "category")
    val points: List<TouristPoint> = mutableListOf()
}