package com.cayce.nbsapp.screen.program

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ProgramCard(program: Program) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(7.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation =  10.dp,
        ),
        content = {
            Text(program.name, modifier = Modifier.padding(16.dp))
            Text(program.description, modifier = Modifier.padding(16.dp))
            Box (
                modifier = Modifier.padding(bottom = 20.dp, start = 10.dp),
            ) {
                Button(
                    onClick = { },
                    modifier = Modifier.padding(top = 8.dp)
                ) {
                    Text(program.readmore, modifier = Modifier.padding(5.dp))
                }
            }
        },

    )
}