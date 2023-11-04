package com.vpmobiledev.nbscollege.screens.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.vpmobiledev.nbscollege.screens.programs.Program
import com.vpmobiledev.nbscollege.screens.programs.ProgramCard


@Composable
fun TestimonialsListScreen() {
    val testimonialsList = listOf(
        Testimonials("Hans", "I chose NBS College because of the history of National Book Store. I am now inspired to start..."),
        Testimonials("Lourdes Tan", "I chose NBS College because the school is a safe haven for us to grow and become the..."),
        Testimonials("Maria Feliz", "The NBS College faculty and staff are really focused when it comes to the students."),
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(modifier = Modifier.height(20.dp))
        Text(
            "Testimonials",
            style = TextStyle(fontSize = 25.sp, color = Color.Black)
        )
        LazyColumn(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(7.dp),
        ) {
            items(testimonialsList) { testimonials ->
                TestimonialsCard(testimonials = testimonials)
            }
        }
    }
}