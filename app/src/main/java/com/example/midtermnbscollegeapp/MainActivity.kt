package com.example.midtermnbscollegeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.midtermnbscollegeapp.model.ScreenViewModel
import com.example.midtermnbscollegeapp.screens.NBSCollegeApp
import com.example.midtermnbscollegeapp.screens.SplashScreen
import com.example.midtermnbscollegeapp.ui.theme.MidtermNBSCollegeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val screenViewModel: ScreenViewModel by viewModels()

        setContent {
            MidtermNBSCollegeAppTheme {
                NBSCollegeApp(screenViewModel)
                //SplashScreen()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MidtermNBSCollegeAppTheme {
        Greeting("Android")
    }
}