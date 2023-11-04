package com.jerald.nbsapp.screens.programs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jerald.nbsapp.navigation.ProgramsRoute
import com.jerald.nbsapp.navigation.Routes

@Composable
fun ProgramListScreen(navController: NavController){
    val programList = listOf(
        Program(
            name = "BS Accountancy",
            description = "Designed to equip aspiring accountants " +
                "with fundamental skills in general accounting...",
            careerOpp =
                    "Chief Financial Officer \n" +
                    "Financial Analyst\n" +
                    "Financial Advisor"),
        Program(
            name = "BS Accounting Information System",
            description = "A specialized degree, the BSAIS program combines knowledge, accounting, and computer systems" +
                "to help make the accounting process more efficient with the help of information technology",
            careerOpp =
            "Chief Financial Officer \n" +
                "Financial Analyst\n" +
                "Financial Advisor"),
        Program(
            name = "BS Computer Science",
            description = "This program prepares you in designing, writing, and developing algorithmically complex" +
                    "software and hardware designed to perform specific tasks and solve complicated problems.",

            careerOpp =
            "Chief Financial Officer \n" +
                    "Financial Analyst\n" +
                    "Financial Advisor")

    )
    Column {
        Text(text = "Programs", style = TextStyle(fontWeight = FontWeight.Bold))
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(20.dp),
            content = {
                items(programList){program ->
                    ProgramCard(program = program)
                }
            }
        )
        Button(
            onClick = { // Navigate to program details screen
                navController.navigate(ProgramsRoute.ProgramDetailsScreen.name)
            },

        ) {
            Text(text = "Read More")
        }
    }
}