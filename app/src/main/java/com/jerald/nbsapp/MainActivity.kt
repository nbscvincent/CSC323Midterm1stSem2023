package com.jerald.nbsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.jerald.nbsapp.screens.Home
import com.jerald.nbsapp.ui.theme.NBSAppTheme
import com.jerald.nbsapp.viewmodel.ScreenViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        val screenViewModel: ScreenViewModel by viewModels()

        screenViewModel.runSplashScreen()

        installSplashScreen().apply {
            setKeepOnScreenCondition {
                screenViewModel.splashLoad.value
            }
        }
        setContent {
            NBSAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NBSApp()
                }
            }
        }
    }
}


