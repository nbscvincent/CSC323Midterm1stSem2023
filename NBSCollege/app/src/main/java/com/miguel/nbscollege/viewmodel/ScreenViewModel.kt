package com.miguel.nbscollege.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ScreenViewModel : ViewModel() {
    private val _splashLoaded = MutableStateFlow(false)
    val splashLoaded = _splashLoaded.asStateFlow()

    fun runSplashScreen() {
        viewModelScope.launch {
            // show splash screen for 2 seconds
            delay(3500)
            _splashLoaded.value = true
        }
    }

}