package com.github.hiygabo.tourguide.favorite.controllers

import com.github.hiygabo.tourguide.favorite.entities.Favorite
import com.github.hiygabo.tourguide.favorite.service.FavoriteService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(name = "/favorites")
class FavoriteController(
    var favoriteService: FavoriteService
) {
    @GetMapping
    fun getFavorites(): List<Favorite>{
        return favoriteService.getFavorites()
    }
}