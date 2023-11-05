package com.example.nbscollege.screens.main

import android.provider.ContactsContract.Contacts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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

@Composable
fun Contact(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier.size(200.dp),
            painter = painterResource(id = R.drawable.nbscollegelogo),
            contentDescription = "NBS College Logo"
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            "Contact Us",
            style = TextStyle(fontSize = 25.sp, color = Color.Black)
        )
        Card(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
            modifier = Modifier
                .size(width = 250.dp, height = 300.dp)
        ) {
            Text(
                text = "Address:\n" +
                        "3rd & 4th floors, Sct. Borromeo corner Quezon Avenue, Diliman, Quezon City\n\n" +
                        "Email:\n" +
                        "info@nbscollege.edu.ph\n\n" +
                        "Contact Number:\n" +
                        "(02) 8376-5090, 0917-8076850, 0961-3826332",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Center,
            )
        }
    }
}
