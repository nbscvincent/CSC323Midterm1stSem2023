package com.jerald.nbsapp.screens

import android.os.Build
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.jerald.nbsapp.R
import com.jerald.nbsapp.data.Testimonial



@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun Home(
    navController: NavController
){

    val testimonials = listOf(
        Testimonial(
            image = 0,
            studentName = "Hans",
            testimonial = "I chose NBS College because of the history of National Book Store. I am now inspired to start…"),
        Testimonial(
            image = 1,
            studentName = "Hans",
            testimonial = "I chose NBS College because of the history of National Book Store. I am now inspired to start…"),
        Testimonial(
            image = 2,
            studentName = "Hans",
            testimonial = "I chose NBS College because of the history of National Book Store. I am now inspired to start…")
    )

    Column(
        modifier = Modifier
            .background(Color.White)

    ) {
        Text(text = "Welcome to NBS College", color = Color.Black, fontSize = 30.sp)
        Text(text = "About NBSC", color = Color.Black, style = TextStyle(fontWeight = FontWeight.Bold), fontSize = 30.sp)
        Text(
            text = "NBS College was established in honor of the beloved founder of National Book Store, Socorro Cancio-Ramos. " +
                    "Inspired by her passion to promote education and continuously fill the minds of our youth with knowledge and wisdom, the school was established to produce leaders and professionals who are not just ready, but leaders and professionals who are confidently competent to face the world.\n" +
                    "\n" +
                    "The school occupies the 3rd and 4th floors of the National Book Store Building at the corner of Quezon Avenue and Scout Borromeo in Quezon City."
        , color = Color.Black, style = TextStyle(textAlign = TextAlign.Justify)
        )


        TestimonialList(testimonials = testimonials)
        Button(onClick = {

        }) {
            Text(text = "Enroll Now")
        }

    }
}
@Composable
fun TestimonialList(testimonials: List<Testimonial>){
    Column {
        testimonials.forEach{
            testimonial -> TestimonialRow(testimonial)
        }
    }
}

@Composable
fun TestimonialRow(testimonial: Testimonial){
    Card (
        border = BorderStroke(1.dp, Color.Black),
        content = {
            Image(painter = painterResource(id = testimonial.image), contentDescription = "")
            Text(text = testimonial.studentName)
            Text(text = testimonial.testimonial)
        }
    )
}