package com.cayce.nbsapp.screen.program

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.cayce.nbsapp.R
import com.cayce.nbsapp.navigation.routes.ProgramRoutes


@Composable
fun programsDetailScreen(navController: NavHostController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(id = R.drawable.nbs_logo),
            contentDescription = "NBS LOGO"
        )
        Text(
            "Welcome to the Program Detail screen",
            style = TextStyle(fontSize = 25.sp, color = Color.Black)
        )
        Text(
            " ",
            style = TextStyle(fontSize = 18.sp, color = Color.Gray)
        )

    }
}