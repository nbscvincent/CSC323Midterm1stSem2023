package com.vpmobiledev.nbscollege.screens.main

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.vpmobiledev.nbscollege.R
import com.vpmobiledev.nbscollege.viewmodel.ScreenViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(
    navController: NavController
) {
    val testimonialsList = listOf(
        Testimonials("Hans", "I chose NBS College because of the history of National Book Store. I am now inspired to start..."),
        Testimonials("Lourdes Tan", "I chose NBS College because the school is a safe haven for us to grow and become the..."),
        Testimonials("Maria Feliz", "The NBS College faculty and staff are really focused when it comes to the students."),
    )
    Scaffold() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .padding(start = 25.dp, end = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.height(5.dp))
            Image(
                modifier = Modifier.size(100.dp),
                painter = painterResource(id = R.drawable.vertical_logo),
                contentDescription = "NBS LOGO"
            )
            Text(
                "Welcome to NBS College!",
                style = TextStyle(fontSize = 30.sp, color = Color.Black)
            )
            Text(
                text = "About NBSC",
                style = TextStyle(fontSize = 25.sp, color = Color.Black)
            )
            Text(
                text = "NBS College was established in honor of the beloved founder of National Book Store, Socorro Cancio-Ramos. Inspired by…",
                style = TextStyle(fontSize = 15.sp, color = Color.Gray)
            )
            Spacer(modifier = Modifier.height(10.dp))
            testimonialsList.forEachIndexed{index, testimonials ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 5.dp,
                    ),
                    content = {
                        Text(testimonials.name, modifier = Modifier.padding(10.dp), color = Color.Black)
                        Text(testimonials.testimonials, modifier = Modifier.padding(10.dp), color = Color.Gray)

                    }
                )
            }
            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red
                ),
                shape = RoundedCornerShape(10.dp),
            ) {
                Text(
                    text = "Enroll Now!",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.White,
                )
            }
        }
    }
}