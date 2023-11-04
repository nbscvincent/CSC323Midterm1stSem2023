package com.vpmobiledev.nbscollege.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
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
import androidx.navigation.NavController
import com.vpmobiledev.nbscollege.R
import com.vpmobiledev.nbscollege.screens.main.homescreen.Testimonial
import com.vpmobiledev.nbscollege.screens.main.homescreen.TestimonialCard


@Composable
fun ContactScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_nbs_logo),
            contentDescription = "NBS LOGO"
        )
        Text(
            "School Address",
            style = TextStyle(fontSize = 20.sp, color = Color.Black)
        )
        Text(
            "3rd & 4th floors, Sct. Borromeo\n" +
                    "corner Quezon Avenue, Diliman, Quezon City\n",
            style = TextStyle(fontSize = 18.sp, color = Color.Black)
        )
        Text(
            "School Email",
            style = TextStyle(fontSize = 20.sp, color = Color.Gray)
        )
        Text(
            "info@nbscollege.edu.ph",
            style = TextStyle(fontSize = 18.sp, color = Color.Gray)
        )
        Text(
            " School Contact Number",
            style = TextStyle(fontSize = 18.sp, color = Color.Gray)
        )
        Text(
            "(02) 8376-5090, 0917-8076850, 0961-3826332",
            style = TextStyle(fontSize = 18.sp, color = Color.Gray)
        )

    }
}