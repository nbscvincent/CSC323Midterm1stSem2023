package com.miguel.nbscollege.screens

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.miguel.nbscollege.navigation.routes.MainRoute
import com.miguel.nbscollege.navigation.routes.Routes
import com.miguel.nbscollege.screens.SplashScreen
import com.miguel.nbscollege.screens.main.Homescreen
import com.miguel.nbscollege.screens.main.MainScreen
import com.miguel.nbscollege.viewmodel.ScreenViewModel

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NBSApp(
    screenViewModel: ScreenViewModel,
) {
    val navController: NavHostController = rememberNavController()

    Scaffold {
        NavHost(navController = navController, startDestination = Routes.SPLASH.name) {
            composable(route = Routes.SPLASH.name) {
                SplashScreen(navController, screenViewModel)
            }
//            navigation(startDestination = MainRoute.HomeScreen.name, route = Routes.MAIN.name) {
//                composable(route = MainRoute.HomeScreen.name) {
//                    Homescreen(navController)
//                }
            composable(route = Routes.MAIN.name) {
                MainScreen(screenViewModel)
            }


        }
    }
}