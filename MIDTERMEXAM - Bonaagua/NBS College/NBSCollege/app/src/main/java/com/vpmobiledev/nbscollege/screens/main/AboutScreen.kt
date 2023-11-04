package com.vpmobiledev.nbscollege.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
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
import androidx.navigation.NavController
import com.vpmobiledev.nbscollege.R
import com.vpmobiledev.nbscollege.screens.main.aboutscreen.CoreValue
import com.vpmobiledev.nbscollege.screens.main.aboutscreen.CoreValueCard
import com.vpmobiledev.nbscollege.screens.main.aboutscreen.Statement
import com.vpmobiledev.nbscollege.screens.main.aboutscreen.StatementCard

@Composable
fun AboutScreen(navController: NavController) {
    val StatementList = listOf(
        Statement(
            "Vision","NBS College is the Philippine school of choice of aspiring leaders and professionals who have strong educational entrepreneurial background to uplift the Philippines and global society.",
        ),
        Statement(
            "Mission","NBS College aims to create, with full support from highly esteemed and long-standing nationwide institution, National Book Store, an academic environment for students to transform them into responsible and productive citizens who will make a positive difference in society.",
        ),
    )

    val CoreValueList = listOf(
        CoreValue("Nurturance",
            "NBS College will be the source of inspiration, courage and strength for its stakeholders in order to promote holistic character growth and development of its students, faculty, support staff.",
        ),
        CoreValue("Benevolence",
            "NBS College will uphold the highest ethical standards and instill in its community generosity of spirit, goodness and kindness.",
        ),
        CoreValue("Service",
            "NBS College commits to develop a strong sense of genuine service and support in our community within and beyond campus.",
        ),
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_nbs_logo),
            contentDescription = "NBS LOGO"
        )
        Text(
            "Welcome to the About screen",
            style = TextStyle(fontSize = 25.sp, color = Color.Black)
        )
        Text(
            "NBS College was established in honor of the beloved founder of National Book Store, Socorro Cancio-Ramos. Inspired by her passion to promote education and continuously fill the minds of our youth with knowledge and wisdom, the school was established to produce leaders and professionals who are not just ready, but leaders and professionals who are confidently competent to face the world.\n" +
            "The school occupies the 3rd and 4th floors of the National Book Store Building at the corner of Quezon Avenue and Scout Borromeo in Quezon City.",
            style = TextStyle(fontSize = 18.sp, color = Color.Gray, textAlign = TextAlign.Center)
        )

        LazyRow(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(7.dp),
        ) {
            items(StatementList) { statement ->
                StatementCard(statement = statement)
            }
        }

        Spacer(modifier = Modifier.padding(20.dp))

        LazyRow(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(7.dp),
        ) {
            items(CoreValueList) { coreValue ->
                CoreValueCard(coreValue = coreValue)
            }
        }
    }
}