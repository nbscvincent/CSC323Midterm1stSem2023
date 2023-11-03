package com.miguel.nbscollege.screens.main

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
import com.miguel.nbscollege.navigation.bottomnavbar.BottomNavBar
import com.miguel.nbscollege.navigation.routes.MainRoute
import com.miguel.nbscollege.navigation.routes.ProgramsRoute
import com.miguel.nbscollege.navigation.routes.Routes
//import com.miguel.nbscollege.screens.programs.Program
//import com.miguel.nbscollege.screens.main.AboutScreen
//import com.miguel.nbscollege.screens.main.HomeScreen
import com.miguel.nbscollege.screens.programs.ProgramListScreen
import com.miguel.nbscollege.screens.programs.ProgramsDetailScreen
import com.miguel.nbscollege.viewmodel.ScreenViewModel

//import com.miguel.nbscollege.screens.programs.ProgramsDetailScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    screenViewModel: ScreenViewModel
) {
    val navController: NavHostController = rememberNavController()

    Scaffold(bottomBar = {
        BottomNavBar(navController = navController)
    }) {
        Box(modifier = Modifier.padding(it)) {
            NavHost(navController = navController, startDestination = MainRoute.HomeScreen.name) {
                composable(route = MainRoute.HomeScreen.name) {
                    Homescreen(navController)
                }
                composable(route = MainRoute.AboutScreen.name) {
                    Aboutscreen(navController)
                }
                composable(route = MainRoute.ProgramScreen.name) {
                    Programscreen(navController)
                }
                composable(route = MainRoute.ContactScreen.name) {
                    Contactscreen(navController)
                }
                navigation(
                    startDestination = ProgramsRoute.ProgramListScreen.name,
                    route = Routes.PROGRAMS.name
                ) {
                    composable(route = ProgramsRoute.ProgramListScreen.name) {
                        ProgramListScreen(navController)
                    }
                    composable(route = ProgramsRoute.ProgramDetailScreen.name) {
                        ProgramsDetailScreen(navController)
                    }
                }
            }
        }
    }
}