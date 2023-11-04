package com.jerald.nbsapp.screens.programs

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ProgramDetailsScreen(navController: NavController){
    Column (

    )
    {
        val program = Program("", "", "")
        Text(text = program.name)
        Text(text = program.description)
        Text(text = program.careerOpp)
    }
}