package com.alexeyyuditsky.data

import com.alexeyyuditsky.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val api: GithubApi
) : Repository {

    override suspend fun loadQuote(): Pair<Boolean, String> {
        return try {
            val quote = api.getQuote().quote
            Pair(true, quote)
        } catch (e: Exception) {
            Pair(false, e.localizedMessage)
        }
    }

}