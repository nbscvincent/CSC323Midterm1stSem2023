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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.vpmobiledev.nbscollege.R
import com.vpmobiledev.nbscollege.screens.main.homescreen.Testimonial
import com.vpmobiledev.nbscollege.screens.main.homescreen.TestimonialCard

@Composable
fun HomeScreen(navController: NavController) {
    val testimonialList = listOf(
        Testimonial(
            " Hans ",
            "I chose NBS College because of the history of National Book Store. I am now inspired to start my own business after I graduate."),
        Testimonial(
            " Lourdes Tan ",
            "I chose NBS College because the school is a safe haven for us to grow and become the better versions of ourselves."),
        Testimonial(
            " Maria Feliz ",
            "The NBS College faculty and staff are really focused when it comes to the students.They give the best education that they can."),
        Testimonial(
            " Mavy ",
            "The professors are really focused on the students and the schedule of the classes allow me to be a working student"),
        Testimonial(
            " Jerricho ",
            "The staff and faculty support each and every one of us. They are very focused on the students")
    )
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
            "Welcome to the home screen",
            style = TextStyle(fontSize = 25.sp, color = Color.Black)
        )
        Text(
            "NBS College was established in honor of the beloved founder \n" +
                    "of National Book Store, Socorro Cancio-Ramos. Inspired by…",
            style = TextStyle(fontSize = 18.sp, color = Color.Gray,textAlign = TextAlign.Center)
        )

        Text(
            "Testimonials",
            style = TextStyle(fontSize = 20.sp, color = Color.Black)
        )
        LazyRow(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(7.dp),
        ) {
            items(testimonialList) { testimonial ->
                TestimonialCard(testimonial = testimonial)
            }
        }

        Button(
            onClick = {

            },
            modifier = Modifier
                .absolutePadding(
                    left = 40.dp,
                    right = 40.dp,
                    bottom = 25.dp,
                    top = 25.dp
                )
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Red)
        ) {
            Text("Enroll Now", fontSize = 19.sp, modifier = Modifier.padding(1.dp))
        }
    }
}