package com.github.hiygabo.tourguide.category.services

import com.github.hiygabo.tourguide.category.repositories.CategoryRepository
import org.springframework.stereotype.Service
import com.github.hiygabo.tourguide.category.entities.Category
@Service
class CategoryService (
    private val categoryRepository: CategoryRepository
){

    fun getCategories(): List<Category> {
        return categoryRepository.findAll()
    }

    
}