package com.alexeyyuditsky.data

import retrofit2.http.GET

interface GithubApi {

    @GET(TOKEN)
    suspend fun getQuote(): QuoteCloud

    private companion object {
        const val TOKEN = "GHSAT0AAAAAACODASTUTCA7NMGWWGKJ3JFEZVTHUYQ"
    }
}