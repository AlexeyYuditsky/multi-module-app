package com.alexeyyuditsky.data

import retrofit2.http.GET

interface GithubApi {

    @GET("quote.json?token=$TOKEN")
    suspend fun getQuote(): QuoteCloud

    private companion object {
        const val TOKEN = "GHSAT0AAAAAACODASTVGF3WPNU7UACFDYTIZVURZVQ"
    }
}