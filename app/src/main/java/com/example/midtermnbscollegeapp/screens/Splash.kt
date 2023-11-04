package com.example.midtermnbscollegeapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.midtermnbscollegeapp.R
import com.example.midtermnbscollegeapp.model.ScreenViewModel
import com.example.midtermnbscollegeapp.route.Route


@Composable
fun SplashScreen(
    navController: NavController,
    screenViewModel: ScreenViewModel
){
    val state = screenViewModel._loader.collectAsState()
    screenViewModel.showSplashScreen()

    if (!state.value){
        navController.navigate(Route.MainScreen.name)
    }else {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize()
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.nbscollegelogo),
                contentDescription = "NBS Logo",
                modifier = Modifier.size(300.dp)
            )
            LinearProgressIndicator()
        }
    }
}