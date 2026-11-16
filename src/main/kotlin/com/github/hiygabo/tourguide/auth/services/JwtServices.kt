package com.github.hiygabo.tourguide.auth.services

import io.jsonwebtoken.ClaimJwtException
import io.jsonwebtoken.Claims
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.io.Decoders
import io.jsonwebtoken.security.Keys
import org.springframework.beans.factory.annotation.Value
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Service
import java.util.Date
import javax.crypto.SecretKey


@Service
class JwtServices(
    @Value("\${jwt.secret}") private val  secretKey: String,
    @Value("\${jwt.expiration}") private val jwtExpiration: Long
) {

    fun generateToken(userDetails: UserDetails): String{
        return Jwts.builder()
            .subject(userDetails.username)
            .issuedAt(Date(System.currentTimeMillis()))
            .expiration(Date(System.currentTimeMillis() + jwtExpiration))
            .signWith(getSignaturesKey())
            .compact()
    }

    fun extractEmail(token: String): String{
        return extractAllClaims(token).subject
    }

    fun isAValidToken(token: String, userDetails: UserDetails):Boolean {
        val tokensEmail = extractEmail(token)
        return (tokensEmail == userDetails.username) && !isExipired(token)
    }

    private fun isExipired(token: String): Boolean {
        return extractAllClaims(token).expiration.before(Date())
    }
    private fun extractAllClaims(token: String) : Claims {
        return Jwts.parser()
            .verifyWith(getSignaturesKey())
            .build()
            .parseSignedClaims(token)
            .payload
    }

    private fun getSignaturesKey(): SecretKey {
        val keyBytes = Decoders.BASE64.decode(secretKey)
        return Keys.hmacShaKeyFor(keyBytes)
    }









}