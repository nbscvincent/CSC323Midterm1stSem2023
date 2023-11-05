package com.example.nbscollege.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ViewCompact
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.vpmobiledev.nbscollege.R
import com.vpmobiledev.nbscollege.navigation.data.routes.ProgramsRoute
import com.vpmobiledev.nbscollege.screens.programs.Program

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier.size(150.dp),
            painter = painterResource(id = R.drawable.nbscollegelogo),
            contentDescription = "NBS College Logo"
        )
        Text(
            "Welcome to NBS College!",
            style = TextStyle(fontSize = 25.sp, color = Color.Black)
        )
        Text(
            "Unleash your potential, ignite your passion.",
            style = TextStyle(fontSize = 18.sp, color = Color.Gray)
        )

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            "A Student Testimonial",
            style = TextStyle(fontSize = 21.sp, color = Color.Black)
        )

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                ),
                modifier = Modifier
                    .size(width = 250.dp, height = 130.dp)
            ) {
                Text(
                    text = "The NBS College faculty and staff are really focused when it comes to the students. - Maria Feliz.",
                    modifier = Modifier
                        .padding(16.dp),
                    textAlign = TextAlign.Center,
                )
            }

        Button(
            onClick = {
                navController.navigate(ProgramsRoute.ProgramDetailScreen.name)
            },
            modifier = Modifier
                .absolutePadding(
                    left = 30.dp,
                    right = 30.dp,
                    bottom = 25.dp,
                    top = 25.dp
                )
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Red)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text("Enroll Now!", fontSize = 19.sp)
            }

        }

    }
}

