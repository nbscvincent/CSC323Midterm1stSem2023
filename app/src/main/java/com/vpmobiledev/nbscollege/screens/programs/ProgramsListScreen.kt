package com.vpmobiledev.nbscollege.screens.programs

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
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
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.vpmobiledev.nbscollege.R
import com.vpmobiledev.nbscollege.navigation.data.routes.ProgramsRoute

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProgramListScreen(navController: NavHostController) {
    val programList = listOf(
        Program("Bachelor of Science in Accountancy", "Description", "Career Opportunities"),
        Program("Bachelor of Science in Accounting Information System", "Description", "Career Opportunities"),
        Program("Bachelor of Science in Entrepreneurship", "Description", "Career Opportunities"),
        Program("Bachelor of Science in Computer Science", "Description", "Career Opportunities")
    )
    Scaffold() {
        Column(
            modifier = Modifier.fillMaxSize().padding(start = 25.dp, end = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            Image(
                modifier = Modifier.size(100.dp),
                painter = painterResource(id = R.drawable.vertical_logo),
                contentDescription = "NBS LOGO"
            )
            Box(modifier = Modifier.height(20.dp))
            Text(
                "Programs",
                style = TextStyle(fontSize = 25.sp, color = Color.Black)
            )
            LazyColumn(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(7.dp),
            ) {
                items(programList) { program ->
                    ProgramCard(program = program)
                }
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
                    Text("View Detail Screen", fontSize = 19.sp, modifier = Modifier.padding(1.dp))
                    Icon(
                        Icons.Rounded.ViewCompact,
                        contentDescription = "View Detail Screen"
                    )
                }

            }
        }
    }
}