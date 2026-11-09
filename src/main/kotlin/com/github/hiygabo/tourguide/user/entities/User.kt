package com.github.hiygabo.tourguide.user.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "USER")
class User (
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", unique = true, nullable = false)
    var idUser: Long? = null,

    @Column(name = "full_name", nullable = false)
    var fullName: String? = null,

    @Column(name = "email", unique = true, nullable = false)
    var email: String? = null,

    @Column(name = "password_hash", nullable = false)
    var passwordHash: String? = ""
)