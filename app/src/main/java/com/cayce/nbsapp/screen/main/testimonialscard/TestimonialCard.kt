package com.cayce.nbsapp.screen.main.testimonialscard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.cayce.nbsapp.screen.main.testimonialscard.Testimonial

@Composable
fun TestimonialCard(testimonial: Testimonial) {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Image(
                painter = painterResource(id = testimonial.imageResId),
                contentDescription = null, // Provide a meaningful description
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp) // Adjust the image height as needed
            )

            Text(text = "Student: ${testimonial.studentName}")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Message: ${testimonial.testimonialText}")
        }
    }
}