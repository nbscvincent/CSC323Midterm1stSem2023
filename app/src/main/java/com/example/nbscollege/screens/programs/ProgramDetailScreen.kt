package com.vpmobiledev.nbscollege.screens.programs

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
fun ProgramsDetailScreen(navController: NavHostController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.height(50.dp))

        Image(
            painter = painterResource(id = R.drawable.img_nbs_logo),
            contentDescription = "NBS College Logo"
        )
        Text(
            "Program Detail Screen",
            style = TextStyle(fontSize = 25.sp, color = Color.Black)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            " ",
            style = TextStyle(fontSize = 18.sp, color = Color.Gray)
        )

        Text(
            text = "BS Accounting: Chief Financial Officer, Financial Analyst, Financial Advisor, Tax Accountant, Auditor, and Accounting Professor.",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center
        )

        Text(
            text = "BS Computer Science - Data Security Analysts, Research & Devt. Research, Mobile Applications Engineer, and Software Engineer.",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center
        )

        Text(
            text = "BS Entrepreneur - Entrepreneur, Business Manager, Operations Director, and Management Analyst",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center
        )

        Text(
            text = "BS Tourism Management - Tourism Center Director, Tour Operator, Events Specialist, Flight Attendant and Public Relations Manager.",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center
        )

        Text(
            text = "BS Accounting Information System - Financial Advisor, Audit Services Manager, and Senior Consulting Manager. ",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center
        )
        }
    }
