package com.cayce.nbsapp.screen.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.navigation.NavHostController
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cayce.nbsapp.R
import com.cayce.nbsapp.screen.main.testimonialscard.StudentTestimonials
import com.cayce.nbsapp.screen.main.testimonialscard.Testimonial


@Composable
fun homeScreen(navController: NavHostController) {
    val testimonials = listOf(
        Testimonial("Cayce C. Evangelista", "SANA PUMASA KAY SIR VINCENT", R.drawable.nbs_logo),
        Testimonial("God", "IPAPASA KA NYAN", R.drawable.nbs_logo),
        Testimonial("Evil", "WAG MO IPASA", R.drawable.nbs_logo )
        // Add more testimonials as needed
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        //horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            "Welcome to NBS College ",
            style = TextStyle(fontSize = 30.sp, color = Color.Black, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(start = 5.dp, bottom = 5.dp)
        )
        Divider(
            modifier = Modifier.fillMaxWidth(),
            color = Color.Red,
            thickness = 2.dp,
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            "A new institution for higher learning rising at the heart of Quezon City and inspired by the 75 year legacy of National Book Store.",
            style = TextStyle(fontSize = 18.sp, color = Color.Black),
            modifier = Modifier,


        )
        Spacer(modifier = Modifier.height(15.dp))
        Row (

        ) {
            Icon(
                imageVector = Icons.Default.Info,
                contentDescription = "About Icon",
                modifier = Modifier.size(35.dp) // Adjust the size of the icon
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                "About ",
                style = TextStyle(fontSize = 30.sp, color = Color.Black, fontWeight = FontWeight.Bold)
            )

        }

        Text(
            "NBS College was established in honor of the beloved founder of National Book Store, Socorro Cancio-Ramos. Inspired by… ",
            style = TextStyle(fontSize = 18.sp, color = Color.Black)
        )

        StudentTestimonials(testimonials = testimonials)

        Column (
            modifier = Modifier.padding(start = 150.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box (
                modifier = Modifier.background(Color.White).padding(16.dp),
                contentAlignment = Alignment.Center

            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = " Enroll Now")
                }
            }
        }







    }

}