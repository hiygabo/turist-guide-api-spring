package com.github.hiygabo.tourguide.category.repositories

import com.github.hiygabo.tourguide.category.entities.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository : JpaRepository<Category, Long> {

}