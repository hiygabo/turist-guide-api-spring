package com.github.hiygabo.tourguide.category.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity
class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_category", unique = true, nullable = false)
    var idCategory: Long? = null

    @Column(name = "category_name", unique = true, nullable = false)
    var categoryName: String? = null

}