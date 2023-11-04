package com.nbscollege.nbscollege



import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.nbscollege.nbscollege.model.Testimonials



@Composable
fun HomeScreen() {

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

            Text(
                text = "   About NBSC",
                fontWeight = FontWeight.SemiBold,
                fontSize = 22.sp,
                color = Color.White,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp)
            )

            Button(
                onClick = {},
                modifier = Modifier
                    .padding(top = 80.dp),
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
                    .padding(top = 60.dp)
            )


                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Yellow,
                    ),
                    modifier = Modifier
                        .size(width = 340.dp, height = 160.dp)

                ) {

                    testimonials.forEach { item ->


                        Text(
                            text = item.name,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = Color.Black,
                        )
                        Text(
                            text = item.message,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = Color.Black,
                        )
                    }

                }
            }
        }

}


