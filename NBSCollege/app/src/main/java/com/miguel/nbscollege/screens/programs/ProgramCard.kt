package com.miguel.nbscollege.screens.programs

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.miguel.nbscollege.navigation.routes.ProgramsRoute
import com.miguel.nbscollege.screens.main.Program

@Composable
fun ProgramCard(
    program: Program,

) {
    val navController: NavHostController = rememberNavController()
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(7.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation =  10.dp,
        ),
        content = {
            Text(program.name, modifier = Modifier.padding(16.dp))
            Button(

                onClick = {
                    navController.navigate(ProgramsRoute.ProgramDetailScreen.name)
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red
                ),
                shape = RoundedCornerShape(20.dp),
            ) {
                Text(
                    "Read More",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
            }


        }
    )
}