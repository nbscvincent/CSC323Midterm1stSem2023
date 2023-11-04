package com.cayce.nbsapp.screen.program

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.cayce.nbsapp.R
import com.cayce.nbsapp.navigation.routes.ProgramRoutes

@Composable
fun programListScreen(navController: NavHostController) {
    val programList = listOf(
        Program("Bachelor Of Science In Accountancy", "Become an accounting expert with the Bachelor of Science in Accountancy (BSA) program. Designed to equip aspiring accountants…", "Read More"),
        Program("Bachelor Of Science In Accounting Information System","Innovate the field of accounting with the Bachelor of Science in Accounting Information Systems (BSAIS) program. As a…", "Read More"),
        Program("Bachelor Of Science In Entrepreneurship", "Conquer the business world with the Bachelor of Science in Entrepreneurship (BSE) program. This program aims to teach…", "Read More"),
        Program("Bachelor Of Science In Computer Science","Master the language of technology with the Bachelor of Science in Computer Science (BSCS) program. This program prepares…", "Read More"),
        Program("Bachelor Of Science In Tourism Management","Become a world-class tourism professional with the Bachelor of Science in Tourism Management (BSTM) program. This program touches…", "Read More")
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier.size(200.dp),
            painter = painterResource(id = R.drawable.nbs_logo),
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
                navController.navigate(ProgramRoutes.ProgramDetailScreen.name)
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


        }
    }
}


