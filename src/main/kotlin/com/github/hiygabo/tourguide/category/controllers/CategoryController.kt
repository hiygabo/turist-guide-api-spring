package com.github.hiygabo.tourguide.category.controllers

import com.github.hiygabo.tourguide.category.entities.Category
import com.github.hiygabo.tourguide.category.services.CategoryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/category")
class CategoryController(
    val categoryService: CategoryService
) {
    @GetMapping
    fun getCategories(): List<Category>{
        return categoryService.getCategories()
    }


}