package com.miguel.nbscollege.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
@Composable
fun Homescreen(navController: NavHostController) {
    val testi = listOf(
        StudentTestimonals(
            "Hansmoke Neeman", "I chose NBS College because of the history of National Book Store.\n" +
                    "I am now inspired to start my own business after I graduate."
        ),
        StudentTestimonals(
            "Lourdes Tan",
            "I chose NBS College because the school is a safe haven for us to grow and become the better versions of ourselves."
        ),
        StudentTestimonals(
            "Maria Feliz", "The NBS College faculty and staff are really focused\n" +
                    "when it comes to the students. They give the best education that they can."
        )

    )
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        // welcome message
        Text(
            modifier = Modifier
                .graphicsLayer(translationY = 60f, translationX = 15f),
            text = "Welcome to NBS College App",
            fontWeight = FontWeight.Bold,
            fontSize = 33.sp,
            color = Color.Black,
        )
        Text(
            modifier = Modifier
                .graphicsLayer(translationY = 100f, translationX = 20f),
            text = "A new institution for higher learning rising at the heart of Quezon City and inspired by the 75 year legacy of National Book Store.",
            fontSize = 23.sp,
            color = Color.Black,
        )
        // about nbs
        Text(
            modifier = Modifier
                .graphicsLayer(translationY = 140f, translationX = 20f),
            text = "About NBS College",
            fontWeight = FontWeight.Bold,
            fontSize = 33.sp,
            color = Color.Black,
        )
        Text(
            modifier = Modifier
                .graphicsLayer(translationY = 180f, translationX = 20f),
            text = "NBS College was established in honor of the beloved founder of National Book Store, Socorro Cancio-Ramos",
            fontSize = 23.sp,
            color = Color.Black,
        )
        // testimonals
        LazyColumn(
            modifier = Modifier
            .graphicsLayer(translationY = 220f, translationX = 20f),) {
            item {
                Text(
                    text = "Testimonals of Students",
                    fontSize = 35.sp,
                    color = Color.Black,
                )
            }
            item {
                testi.forEachIndexed { index, studentTestimonals ->
                    Card (
                        modifier = Modifier
                            .background(Color.White)
                            .padding(top = 15.dp, bottom = 15.dp),
                    ){
                        Text(text = studentTestimonals.Name)
                        Text(text = studentTestimonals.Message)
                    }
                }
            }
            item{
                // enroll now button
                Button(
                    onClick = {

                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Red
                    ),
                    shape = RoundedCornerShape(20.dp),
                ) {
                    Text(
                        "                    Enroll Now                      ",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp
                    )
                }
            }
            // lazy column last bracker
        }

//        column last bracket
    }
}