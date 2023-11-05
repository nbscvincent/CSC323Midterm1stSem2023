package com.nbscollege.nbscollege.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


class ScreenViewModel : ViewModel(){
    private val showLoader = MutableStateFlow(true)
    val _loader = showLoader.asStateFlow()

    fun runSplashScreen(){
        viewModelScope.launch {
            delay(2000) // 2 seconds delay
            showLoader.value = false

        }



    }
}