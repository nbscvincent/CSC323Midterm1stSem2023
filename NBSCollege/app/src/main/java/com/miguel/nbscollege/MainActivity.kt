package com.miguel.nbscollege

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.miguel.nbscollege.screens.NBSApp
import com.miguel.nbscollege.screens.main.Homescreen
import com.miguel.nbscollege.screens.main.MainScreen
import com.miguel.nbscollege.ui.theme.NBSCollegeTheme
import com.miguel.nbscollege.viewmodel.ScreenViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        val screenViewModel: ScreenViewModel by viewModels()

        screenViewModel.runSplashScreen()

        installSplashScreen().apply {
            setKeepOnScreenCondition {
                screenViewModel.splashLoaded.value
            }
        }

        setContent {
            NBSCollegeTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentWidth(Alignment.CenterHorizontally)
                        .wrapContentHeight(Alignment.CenterVertically)
                ) {
                    NBSApp(screenViewModel)
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    NBSCollegeTheme {
//        Greeting("Android")
//    }
//}