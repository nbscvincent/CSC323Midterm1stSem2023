package com.cayce.nbsapp.screen.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.cayce.nbsapp.screen.main.testimonialscard.Statement
import com.cayce.nbsapp.screen.program.Program


@Composable
fun aboutScreen(navController: NavController ) {
    val about = listOf(
        Statement("Vision", "NBS College is the Philippine school of choice of aspiring leaders and professionals who have strong educational entrepreneurial background to uplift the Philippines and global society."),
    Statement("Mission", "NBS College aims to create, with full support from highly esteemed and long-standing nationwide institution, National Book Store, an academic environment for students to transform them into responsible and productive citizens who will make a positive difference in society."),
    Statement("Nurturance", "NBS College will be the source of inspiration, courage and strength for its stakeholders in order to promote holistic character growth and development of its students, faculty, support staff."),
    Statement("Benevolence", "NBS College will uphold the highest ethical standards and instill in its community generosity of spirit, goodness and kindness."),
    Statement("Service", "NBS College commits to develop a strong sense of genuine service and support in our community within and beyond campus."),
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        Text(
            text = "About NBSC",
            style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 24.sp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
          items(about) { statement->
              StatementCard(statement = statement)
          }
        }
    }


    }



@Composable
fun StatementCard(statement: Statement) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),

        ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = statement.title,
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = statement.description,
                style = TextStyle(fontSize = 16.sp)
            )


        }
    }
}


//        StatementCard(about)
//        Spacer(modifier = Modifier.height(16.dp))
//        StatementCard(missionStatement)
//        Spacer(modifier = Modifier.height(16.dp))
//        StatementCard(Nurturance)
//        Spacer(modifier = Modifier.height(16.dp))
//        StatementCard(Benevolence)
//        Spacer(modifier = Modifier.height(16.dp))
//        StatementCard(Service)
// Replace these with your actual data
//val visionStatement = Statement("Vision", "NBS College is the Philippine school of choice of aspiring leaders and professionals who have strong educational entrepreneurial background to uplift the Philippines and global society.")
//    val missionStatement = Statement("Mission", "NBS College aims to create, with full support from highly esteemed and long-standing nationwide institution, National Book Store, an academic environment for students to transform them into responsible and productive citizens who will make a positive difference in society.")
//    val Nurturance = Statement("Nurturance", "NBS College will be the source of inspiration, courage and strength for its stakeholders in order to promote holistic character growth and development of its students, faculty, support staff.")
//    val Benevolence = Statement("Benevolence", "NBS College will uphold the highest ethical standards and instill in its community generosity of spirit, goodness and kindness.")
//    val Service = Statement("Service", "NBS College commits to develop a strong sense of genuine service and support in our community within and beyond campus.")

