package com.nbscollege.nbscollege.model



import android.annotation.SuppressLint
import android.graphics.fonts.FontStyle
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nbscollege.nbscollege.R
import com.nbscollege.nbscollege.dataclass.Testimonials



@SuppressLint("SuspiciousIndentation")
@Composable
fun HomeScreen(
    navController: NavController.Companion
) {
    val navController = rememberNavController()
    val testimonials = listOf(
        Testimonials("Sharmaine Cruz", "It's my honor to be part of NBSC.\n"),
        Testimonials("Mike Gomez", "Happy to be in the best School")
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Image(
                painter = painterResource(id = R.drawable.nbsc_logo_main),
                contentDescription = "",
                modifier = Modifier
                    .size(500.dp, 180.dp)
            )
            Text(
                text = "Welcome to NBS College",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            )
            Spacer(
                modifier = Modifier
                    .padding(top = 20.dp)
            )
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.Yellow,
                ),
                modifier = Modifier
                    .size(width = 340.dp, height = 200.dp)

            ){
            Text(
                text = "About NBSC",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 22.sp,
                color = Color.Blue,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(
                text = "NBS College was established in honor of the beloved founder of National Book Store, Socorro Cancio-Ramos. Inspired by her passion to promote education and continuously fill the minds of our youth with knowledge and wisdom, the school was established to produce leaders and professionals who are not just ready, but leaders and professionals who are confidently competent to face the world.",
                fontWeight = FontWeight.Bold,
                fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                fontSize = 14.sp,
                color = Color.Black,
                textAlign = TextAlign.Left,
                modifier = Modifier
                        .fillMaxWidth()
                )
            }

            Button(
                onClick = {},
                modifier = Modifier
                    .padding(top = 10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue
                ),
                shape = RoundedCornerShape(20.dp),
            ) {
                Text(
                    text = "ENROLL NOW",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.White,
                )

            }

            Spacer(
                modifier = Modifier
                    .padding(top =70.dp)
            )


            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.Yellow,
                ),
                modifier = Modifier
                    .size(width = 340.dp, height = 120.dp)

            ) {

                testimonials.forEach { item ->


                    Text(
                        text = item.name,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = Color.Blue,
                        fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                    )
                    Text(
                        text = item.message,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color.Black,
                    )
                }

            }
        }
    }

}


