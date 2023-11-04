package com.vpmobiledev.nbscollege.screens.main

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TestimonialsCard (testimonials: Testimonials) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(7.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation =  10.dp,
        ),
        content = {
            Text(testimonials.name, modifier = Modifier.padding(16.dp))
        }
    )
}