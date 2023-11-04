package com.example.midtermnbscollegeapp.screens

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.midtermnbscollegeapp.dataclass.BottomNav
import com.example.midtermnbscollegeapp.model.ScreenViewModel
import com.example.midtermnbscollegeapp.route.Route


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NBSCollegeApp (
    screenViewModel: ScreenViewModel
){
    val navController: NavHostController = rememberNavController()

    Scaffold {
        NavHost(
            navController = navController,
            startDestination = Route.Splash.name
        ){
            composable(Route.Splash.name){
                SplashScreen(navController, screenViewModel)
            }
            composable(Route.MainScreen.name){
                MainScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(

){
    val navController: NavHostController = rememberNavController()

    val items = listOf(
        BottomNav("Home", Icons.Filled.Home, Icons.Outlined.Home, Route.Home.name),
        BottomNav("About", Icons.Default.Info, Icons.Outlined.Info, Route.About.name),
        BottomNav(
            "Programs",
            Icons.Default.Person,
            Icons.Outlined.Person,
            Route.Programs.name
        ),
        BottomNav("Contact", Icons.Default.Call, Icons.Outlined.Call, Route.Contact.name),
    )

    var selectedItem by remember { mutableStateOf(0) }

    Scaffold (
        bottomBar = {
            NavigationBar {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selectedItem == index,
                        onClick = {
                            selectedItem = index
                            navController.navigate(item.route)
                        },
                        icon = {
                            Icon(
                                imageVector = if (index == selectedItem) {
                                    item.selectedIcon
                                } else item.unselectedIcon,
                                contentDescription = item.title
                            )
                        },
                        alwaysShowLabel = false,
                        label = { Text(text = item.title) }
                    )
                }
            }
        }
    ){
        Column(modifier = Modifier.padding(it)) { }
        NavHost(
            navController = navController,
            startDestination = Route.Home.name
        ){
            composable(route = Route.Home.name) {
                HomePage( navController )
            }
            composable(route = Route.About.name) {
                About( navController )
            }
            composable(route = Route.Programs.name) {
                Programs( navController )
            }
            composable("ProgramDetails/{bid}") { navBackStackEntry ->
                val bid = navBackStackEntry.arguments?.getString("bid")

                bid?.let {
                    ProgramDetails(navController = navController, index = bid.toInt())
                }
            }
            composable(route = Route.Contact.name) {
                Contact( navController )
            }
        }
    }

}