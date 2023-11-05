package com.vpmobiledev.nbscollege.screens.programs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.vpmobiledev.nbscollege.R
import com.vpmobiledev.nbscollege.navigation.data.routes.ProgramsRoute

@Composable
fun ProgramListScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            "Program Names",
            style = TextStyle(fontSize = 25.sp, color = Color.Black)
        )

        Spacer(modifier = Modifier.height(50.dp))

    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        modifier = Modifier
            .size(width = 350.dp, height = 100.dp)
    ) {
        Text(
            text = "BS Accounting Information System - A specialized degree combined knowledge in bussiness, and compputer systems.",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center
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
                text = "BS Accountancy - Become an accounting expert with the BSA Program.",
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
                text = "BS Computer Science - Data Security Analyst and Application Architect software engineer.",
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
                text = "BS Entrepreneurship - Aims to aspire entrepreneurs in starting and managing a business.",
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
                    left = 40.dp,
                    right = 40.dp,
                    bottom = 25.dp,
                    top = 25.dp
                )
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Red)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text("Read More", fontSize = 19.sp, modifier = Modifier.padding(1.dp))
            }
        }
    }
    }