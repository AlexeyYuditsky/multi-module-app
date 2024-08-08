package com.alexeyyuditsky.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alexeyyuditsky.presentation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val viewModel = (application as ProvideViewModel).viewModel()
        viewModel.load()

        viewModel.liveData.observe(this) {
            binding.mainTextView.text = it
        }
    }

}