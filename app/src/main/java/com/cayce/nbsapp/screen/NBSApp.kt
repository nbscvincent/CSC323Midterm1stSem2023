package com.cayce.nbsapp.screen

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.cayce.nbsapp.navigation.routes.MainRoute
import com.cayce.nbsapp.navigation.routes.Routes
import com.cayce.nbsapp.screen.main.mainScreen
import com.cayce.nbsapp.viewmodel.ScreenViewModel


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NBSApp(
    screenViewModel: ScreenViewModel,
) {
    val navController: NavHostController = rememberNavController()

    Scaffold {
        NavHost(navController = navController, startDestination =  Routes.SPLASH.name) {
            composable(route = Routes.SPLASH.name) {
                SplashScreen(navController, screenViewModel)
            }

            composable(route = Routes.MAIN.name) {
                mainScreen()
            }
        }
    }
}