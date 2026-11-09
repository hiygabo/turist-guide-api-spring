package com.github.hiygabo.tourguide.favorite.service

import com.github.hiygabo.tourguide.favorite.entities.Favorite
import com.github.hiygabo.tourguide.favorite.respository.FavoriteRespository
import org.springframework.stereotype.Service

@Service
class FavoriteService (
    private var favoriteRespository: FavoriteRespository
){
    fun getFavorites(): List<Favorite>{
        return favoriteRespository.findAll()
    }
}