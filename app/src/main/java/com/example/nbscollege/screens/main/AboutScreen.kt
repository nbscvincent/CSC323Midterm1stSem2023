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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.vpmobiledev.nbscollege.R
import com.vpmobiledev.nbscollege.navigation.data.routes.MainRoute
import com.vpmobiledev.nbscollege.navigation.data.routes.ProgramsRoute

@Composable
fun AboutScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.nbscollegelogo),
            contentDescription = "NBS College Logo"
        )
        Text(
            "About NBS College",
            style = TextStyle(fontSize = 25.sp, color = Color.Black)
        )
        Text(
            "NBS College was established in honor of the beloved founder of National Book Store, Socorro Cancio-Ramos.",
            textAlign = TextAlign.Center,
            style = TextStyle(fontSize = 18.sp, color = Color.Gray)
        )
        Spacer(modifier = Modifier.height(20.dp))

        Card(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
            modifier = Modifier
                .size(width = 350.dp, height = 100.dp)
        ) {
            Text(
                text = "VISION - NBS College is the Philippine school of choice of aspiring leaders and professionals who have strong educational entrepreneurial background to uplift the Philippines and global society.",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Center,
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        Card(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
            modifier = Modifier
                .size(width = 350.dp, height = 100.dp)
        ) {
            Text(
                text = "MISSION - NBS College aims to create, with full support from highly esteemed and long-standing nationwide institution, National Book Store, an academic environment for students to transform them into responsible and productive citizens who will make a positive difference in society.",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Center,
            )
        }
        Button(
            onClick = {
                navController.navigate(MainRoute.Statement.name)
            },
            modifier = Modifier
                .absolutePadding(
                    left = 40.dp,
                    right = 40.dp,
                    bottom = 25.dp,
                    top = 25.dp
                )
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Blue)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text("Core", fontSize = 19.sp, modifier = Modifier.padding(1.dp))
            }
        }

    }
}