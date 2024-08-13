package com.alexeyyuditsky.data

import retrofit2.http.GET

interface GithubApi {

    @GET("quote.json?token=$TOKEN")
    suspend fun getQuote(): QuoteCloud

    private companion object {
        const val TOKEN = "GHSAT0AAAAAACODASTVWSO6FNKTAZKXAJ4IZV3EI3Q"
    }
}