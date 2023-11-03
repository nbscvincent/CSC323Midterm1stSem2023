package com.miguel.nbscollege.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.miguel.nbscollege.R

@Composable
fun Contactscreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "NBS LOGO"
        )
        Text(
            "\n" +"\n" +"Contact Us\n",
            style = TextStyle(fontSize = 25.sp, color = Color.Black)
        )
        Text(
            "Address\n",
            style = TextStyle(fontSize = 18.sp, color = Color.Black)
        )
        Text(
            "3rd & 4th floors, Sct. Borromeo corner\n" +
                    "Quezon Avenue, Diliman, Quezon City\n",
            style = TextStyle(fontSize = 18.sp, color = Color.Black)
        )
        Text(
            "Contact Number:\n",
            style = TextStyle(fontSize = 18.sp, color = Color.Black)
        )
        Text(
            "(02) 8376-5090, 0917-8076850, 0961-3826332\n",
            style = TextStyle(fontSize = 18.sp, color = Color.Black)
        )
        Text(
            "Email:\n",
            style = TextStyle(fontSize = 18.sp, color = Color.Black)
        )
        Text(
            "info@nbscollege.edu.ph\n",
            style = TextStyle(fontSize = 18.sp, color = Color.Black)
        )
    }
}