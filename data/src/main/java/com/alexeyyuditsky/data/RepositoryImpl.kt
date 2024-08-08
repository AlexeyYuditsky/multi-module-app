package com.alexeyyuditsky.data

import com.alexeyyuditsky.domain.Repository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RepositoryImpl(
    private val api: GithubApi
) : Repository {

    constructor() : this(
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create<GithubApi>()
    )

    override suspend fun loadQuote(): Pair<Boolean, String> {
        return try {
            val quote = api.getQuote().quote
            Pair(true, quote)
        } catch (e: Exception) {
            Pair(false, e.localizedMessage)
        }
    }

    private companion object {
        const val BASE_URL =
            "https://raw.githubusercontent.com/AlexeyYuditsky/server/master/"
    }

}