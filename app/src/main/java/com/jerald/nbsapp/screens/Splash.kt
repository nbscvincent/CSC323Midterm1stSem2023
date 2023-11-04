package com.jerald.nbsapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.jerald.nbsapp.R

@Composable
fun SplashScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "NBS Logo",
            modifier = Modifier.size(300.dp),
            contentScale = ContentScale.Fit
        )
        LinearProgressIndicator(
            modifier = Modifier.width(100.dp),
            color = Color(0xFFD80032),
            trackColor = Color(0xFFF1F6F9)
        )
    }
}