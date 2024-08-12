package com.alexeyyuditsky.multimoduleapp

import com.alexeyyuditsky.data.GithubApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

@Module
@InstallIn(SingletonComponent::class)
class RetrofitModule {

    @Provides
    fun provideApi(): GithubApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create<GithubApi>()
    }

    private companion object {
        const val BASE_URL = "https://raw.githubusercontent.com/AlexeyYuditsky/server/master/"
    }

}