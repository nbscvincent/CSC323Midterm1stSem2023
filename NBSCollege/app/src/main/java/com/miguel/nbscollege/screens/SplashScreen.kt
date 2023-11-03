package com.miguel.nbscollege.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.miguel.nbscollege.R
import com.miguel.nbscollege.navigation.routes.MainRoute
import com.miguel.nbscollege.navigation.routes.Routes
import com.miguel.nbscollege.viewmodel.ScreenViewModel

@Composable
fun SplashScreen(
    navController: NavHostController,
    screenViewModel: ScreenViewModel,
) {
    val state = screenViewModel.splashLoaded.collectAsState()
    screenViewModel.runSplashScreen()

    if (state.value) {
        navController.navigate(Routes.MAIN.name)
    } else {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                modifier = Modifier.size(300.dp),
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "NBS LOGO"
            )
            Box(Modifier.height(25.dp))
            CircularProgressIndicator(
                modifier = Modifier.width(64.dp),
                color = MaterialTheme.colorScheme.surfaceVariant,

            )
        }
    }
}