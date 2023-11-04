package com.vpmobiledev.nbscollege.screens.main.homescreen


import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TestimonialCard(testimonial: Testimonial) {
    Card(
        modifier = Modifier
            .width(250.dp)
            .padding(7.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation =  10.dp,
        ),
        content = {
            Text(testimonial.name, modifier = Modifier.padding(16.dp))
            Text(testimonial.testimonial, modifier = Modifier.padding(16.dp))
        }
    )
}
