package com.vpmobiledev.nbscollege.screens.main

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
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
import androidx.navigation.NavController
import com.vpmobiledev.nbscollege.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ContactScreen (
    navController: NavController
) {
    Scaffold() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .padding(start = 25.dp, end = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier.size(300.dp),
                painter = painterResource(id = R.drawable.vertical_logo),
                contentDescription = "NBS LOGO"
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                "Address Information",
                style = TextStyle(fontSize = 25.sp, color = Color.Black)
            )
            Text(
                textAlign = TextAlign.Center,
                text = "3rd & 4th Flr, Sct. Borromeo cor., Quezon Avenue, Diliman, Quezon City",
                style = TextStyle(fontSize = 20.sp, color = Color.Gray)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                "Phone Number",
                textAlign = TextAlign.Center,
                style = TextStyle(fontSize = 25.sp, color = Color.Black)
            )
            Text(
                "(02) 8376-5090",
                style = TextStyle(fontSize = 20.sp, color = Color.Gray)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                "Email Address",
                style = TextStyle(fontSize = 25.sp, color = Color.Black)
            )
            Text(
                "info@nbscollege.edu.ph",
                textAlign = TextAlign.Center,
                style = TextStyle(fontSize = 20.sp, color = Color.Gray)
            )

        }
    }
}