package com.alexeyyuditsky.multimoduleapp

import android.app.Application
import com.alexeyyuditsky.data.RepositoryImpl
import com.alexeyyuditsky.domain.Repository
import com.alexeyyuditsky.presentation.MainViewModel
import com.alexeyyuditsky.presentation.ProvideViewModel

class App : Application(), ProvideViewModel {

    private lateinit var viewModel: MainViewModel

    override fun onCreate() {
        super.onCreate()
        val repository: Repository = RepositoryImpl()
        viewModel = MainViewModel(repository)
    }

    override fun viewModel(): MainViewModel = viewModel

}