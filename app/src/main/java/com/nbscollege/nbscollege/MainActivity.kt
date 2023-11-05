package com.nbscollege.nbscollege

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.nbscollege.nbscollege.model.AboutScreen
import com.nbscollege.nbscollege.model.BottomNav
import com.nbscollege.nbscollege.model.ContactScreen
import com.nbscollege.nbscollege.model.MainApp
import com.nbscollege.nbscollege.model.ProgramDetails
import com.nbscollege.nbscollege.model.ProgramList
import com.nbscollege.nbscollege.model.SplashScreen
import com.nbscollege.nbscollege.ui.theme.NBSCollegeTheme
import com.nbscollege.nbscollege.viewmodel.ScreenViewModel



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val screenViewModel: ScreenViewModel by viewModels()

        screenViewModel.runSplashScreen()

        installSplashScreen().apply {
            setKeepOnScreenCondition {
                screenViewModel._loader.value
            }
        }

        setContent {
            NBSCollegeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = Color.Red
                ) {
                   MainApp()

                    //SplashScreen()
                    //HomeScreen()


                    //ProgramList()
                    //ProgramDetails()
                    //ContactScreen()
                    //AboutScreen()
                    //BottomNav()

                }
            }
        }
    }
}