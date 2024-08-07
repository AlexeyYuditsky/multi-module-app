package com.alexeyyuditsky.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alexeyyuditsky.domain.Repository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class MainViewModel(
    private val repository: Repository
) : ViewModel() {

    private val viewModelScope = CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)

    private val innerLiveData = MutableLiveData<String>()
    val liveData: LiveData<String> get() = innerLiveData

    fun load() = viewModelScope.launch {
        val quote = repository.loadQuote().second
        innerLiveData.value = quote
    }

}