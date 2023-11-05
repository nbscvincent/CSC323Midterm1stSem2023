package com.nbscollege.nbscollege.model
import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController



@Composable
fun MainApp(){

    val navController = rememberNavController()

    NavHost(
        navController = navController, startDestination = "Splash"
    ) {
        composable("Splash"){
            SplashScreen(
                navController = navController)}

        composable("Home"){
            HomeScreen(
                navController = NavController)}

    }
}
