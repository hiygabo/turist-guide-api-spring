package com.github.hiygabo.tourguide.favorite.respository

import com.github.hiygabo.tourguide.favorite.entities.Favorite
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FavoriteRespository : JpaRepository<Favorite, Long> {
}