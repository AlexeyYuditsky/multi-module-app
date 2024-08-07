package com.alexeyyuditsky.data

import com.google.gson.annotations.SerializedName

data class QuoteCloud(
    @SerializedName("quote")
    val quote: String
)