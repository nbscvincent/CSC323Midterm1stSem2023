package com.cayce.nbsapp.screen.main

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.cayce.nbsapp.navigation.bottombar.BottomNavBar
import com.cayce.nbsapp.navigation.routes.MainRoute
import com.cayce.nbsapp.navigation.routes.ProgramRoutes
import com.cayce.nbsapp.navigation.routes.Routes

import com.cayce.nbsapp.screen.program.programListScreen
import com.cayce.nbsapp.screen.program.programsDetailScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun mainScreen(
) {
    val navController: NavHostController = rememberNavController()

    Scaffold(bottomBar = {
        BottomNavBar(navController = navController)
    }) {
        Box(modifier = Modifier.padding(it)) {
            NavHost(navController = navController, startDestination = MainRoute.HomeScreen.name) {
                composable(route = MainRoute.HomeScreen.name) {
                    homeScreen(navController)
                }
                composable(route = MainRoute.AboutScreen.name) {
                    aboutScreen(navController)
                }
                composable(route = MainRoute.ContactScreen.name) {
                    contactScreen(navController)
                }
//                composable(route = ProgramRoutes.ProgramListScreen.name) {
//                    programListScreen(navController)
//                }
                navigation(
                    startDestination = ProgramRoutes.ProgramListScreen.name,
                    route = Routes.PROGRAM.name
                ) {
                    composable(route = ProgramRoutes.ProgramListScreen.name) {
                        programListScreen(navController)
                    }
                    composable(route = ProgramRoutes.ProgramDetailScreen.name) {
                        programsDetailScreen(navController)
                    }
                }
            }
        }
    }
}