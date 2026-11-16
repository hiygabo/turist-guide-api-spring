package com.github.hiygabo.tourguide.user.repositories

import com.github.hiygabo.tourguide.user.entities.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findByEmail(email: String): User?

}