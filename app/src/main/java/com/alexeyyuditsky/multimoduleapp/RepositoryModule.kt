package com.alexeyyuditsky.multimoduleapp

import com.alexeyyuditsky.data.RepositoryImpl
import com.alexeyyuditsky.domain.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(impl: RepositoryImpl): Repository

}