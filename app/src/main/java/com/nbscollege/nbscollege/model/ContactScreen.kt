package com.nbscollege.nbscollege.model

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.nbscollege.nbscollege.R


@Composable
fun ContactScreen() {

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
                    .size(1000.dp, 180.dp)
            )

            Spacer(modifier = Modifier
                .padding(top = 50.dp)
            )

            Card (
                colors = CardDefaults.cardColors(
                    containerColor = Color.Yellow,
                ),
                modifier = Modifier
                    .size(width = 320.dp, height = 120.dp)

            ){
            Text(
                text = "Address:",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 26.sp,
                color = Color.Blue,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp)
            )
            Text(
                text = "3rd & 4th floors,Sct. Borromeo corner Quezon Avenue, Diliman, Quezon City",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Black,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .fillMaxWidth()
            )}
            Spacer(modifier = Modifier
                .padding(top = 20.dp)
            )

            Card (
                colors = CardDefaults.cardColors(
                    containerColor = Color.Yellow,
                ),
                modifier = Modifier
                    .size(width = 320.dp, height = 120.dp)

            ){
            Text(
                text = "Contact Number:",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 26.sp,
                color = Color.Blue,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp)
            )
            Text(
                text = "(02) 8376-5090, 0917-8076850,0961-3826332",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Black,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .fillMaxWidth()
            )}
            Spacer(modifier = Modifier
                .padding(top = 20.dp)
            )

            Card (
                colors = CardDefaults.cardColors(
                    containerColor = Color.Yellow,
                ),
                modifier = Modifier
                    .size(width = 320.dp, height = 120.dp)

            ){
            Text(
                text = "Email Address:",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 26.sp,
                color = Color.Blue,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp)
            )
            Text(
                text = "info@nbscollege.edu.ph",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Black,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .fillMaxWidth()
            )}
        }
    }
}