package com.jerald.nbsapp.screens.programs

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ProgramCard(program: Program){
    Card (
        content = {
            Text(text = program.name)
            Text(text = program.description)
        }
    )

}