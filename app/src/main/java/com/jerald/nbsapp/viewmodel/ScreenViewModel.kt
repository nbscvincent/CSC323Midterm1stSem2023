package com.jerald.nbsapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ScreenViewModel: ViewModel(){
    private val _splashLoad = MutableStateFlow(false)
    val splashLoad = _splashLoad.asStateFlow()

    fun runSplashScreen(){
        viewModelScope.launch {
            delay(2000)
            _splashLoad.value = true
        }
        _splashLoad.value = false
    }
}