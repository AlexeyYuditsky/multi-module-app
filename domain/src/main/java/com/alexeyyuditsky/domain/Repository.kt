package com.alexeyyuditsky.domain

interface Repository {

    /**
     * Boolean - success;
     * String - data
     */
    suspend fun loadQuote(): Pair<Boolean, String>

}