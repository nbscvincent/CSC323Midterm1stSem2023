package com.jerald.nbsapp

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.jerald.nbsapp.navigation.MainRoute
import com.jerald.nbsapp.navigation.ProgramsRoute
import com.jerald.nbsapp.navigation.Routes
import com.jerald.nbsapp.screens.About
import com.jerald.nbsapp.screens.Contact
import com.jerald.nbsapp.screens.Home
import com.jerald.nbsapp.screens.SplashScreen
import com.jerald.nbsapp.screens.programs.ProgramDetailsScreen
import com.jerald.nbsapp.screens.programs.ProgramListScreen

@RequiresApi(Build.VERSION_CODES.Q)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NBSApp(

){
    val navController: NavHostController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomAppBar {
                Button(onClick = {
                    navController.navigate(MainRoute.Home.name)
                }) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "Home")
                }
                Button(onClick = {
                    navController.navigate(MainRoute.About.name)
                }) {
                    Icon(imageVector = Icons.Default.Info, contentDescription = "About")
                }
                Button(onClick = {
                    navController.navigate(ProgramsRoute.ProgramListScreen.name)
                }) {
                    Icon(imageVector = Icons.Default.Done, contentDescription = "Programs")
                }
                Button(onClick = {
                    navController.navigate(MainRoute.Contact.name)
                }) {
                    Icon(imageVector = Icons.Default.Person, contentDescription = "Contact")
                }

            }
        }
    ) {
        NavHost(
            navController = navController, startDestination = Routes.SPLASH.name
        ){
            composable(route = Routes.SPLASH.name){
                SplashScreen(navController)
            }
            navigation(startDestination = ProgramsRoute.ProgramListScreen.name, route = Routes.PROGRAMS.name){
                composable(route = ProgramsRoute.ProgramListScreen.name){
                    ProgramListScreen(navController = navController)
                }
                composable(route = ProgramsRoute.ProgramDetailsScreen.name){
                    ProgramDetailsScreen(navController = navController)
                }
            }
            composable(route = MainRoute.About.name){
                About(navController)
            }
            composable(route = MainRoute.Contact.name){
                Contact(navController)
            }
            composable(route = MainRoute.Home.name){
                Home(navController)
            }
        }
    }
}