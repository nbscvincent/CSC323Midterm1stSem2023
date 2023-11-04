package com.cayce.nbsapp.screen.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
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

@Composable
fun contactScreen(navController: NavHostController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier.size(200.dp),
            painter = painterResource(id = R.drawable.nbs_logo),
            contentDescription = "NBS LOGO"
        )
        Box(modifier = Modifier.height(20.dp))
        Text(
            "Contact Us",
            style = TextStyle(fontSize = 25.sp, color = Color.Black)
        )

        Text(
            "Adress: 3rd & 4th floors, Sct. Borromeo\n" +
                    "corner Quezon Avenue, Diliman, Quezon City"
        )

        Text(
            "Contact Number: (02) 8376-5090, 0917-8076850, 0961-3826332"
        )

        Text(
            "Email: info@nbscollege.edu.ph"
        )
    }


}