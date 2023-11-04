

package com.vpmobiledev.nbscollege.screens.programs

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.vpmobiledev.nbscollege.navigation.data.routes.MainRoute
import com.vpmobiledev.nbscollege.navigation.data.routes.ProgramsRoute

@Composable
fun ProgramCard(
    program: Program
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
            Text(program.name, modifier = Modifier.padding(16.dp), color = Color.Black, fontWeight = FontWeight.Bold)
            Text(program.desc, modifier = Modifier.padding(16.dp))
            Text(program.career, modifier = Modifier.padding(16.dp))
            Button(
                    onClick = { navController.navigate(ProgramsRoute.ProgramDetailScreen.name)},
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Red
                    ),
                    shape = RoundedCornerShape(10.dp),
                ) {
                    Text(
                        text = "READ MORE",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.White,
                    )
                }
        }
    )
}
