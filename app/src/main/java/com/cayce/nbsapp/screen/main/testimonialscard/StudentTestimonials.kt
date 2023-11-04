package com.cayce.nbsapp.screen.main.testimonialscard

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable

@Composable
fun StudentTestimonials(testimonials: List<Testimonial>) {
    LazyRow {
        items(testimonials) { testimonial ->
            TestimonialCard(testimonial = testimonial)
        }
    }
}

