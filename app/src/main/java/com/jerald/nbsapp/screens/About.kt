package com.jerald.nbsapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
@Composable
fun About(navController: NavController) {

    val vision = Statement(
        title = "Vision",
        desc = "NBS College is the Philippine school of choice of aspiring leaders and professionals who have strong educational entrepreneurial background to uplift the Philippines and global society."
    )
    val mission = Statement(
        title = "Mission",
        desc = "NBS College aims to create, with full support from highly esteemed and long-standing nationwide institution, National Book Store, an academic environment for students to transform them into responsible and productive citizens who will make a positive difference in society."
    )
    val nurturance = Statement(
        title = "Nurturance",
        desc = "NBS College will be the source of inspiration, courage and strength for its stakeholders in order to promote holistic character growth and development of its students, faculty, support staff."
    )
    val benevolence = Statement(
        title = "Benevolencence",
        desc = "NBS College will uphold the highest ethical standards and instill in its community generosity of spirit, goodness and kindness."
    )
    val service = Statement(
        title = "Service",
        desc = "NBS College commits to develop a strong sense of genuine service and support in our community within and beyond campus."
    )

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
                "NBS College was established in honor of the beloved founder of National Book Store, Socorro Cancio-Ramos. " +
                        "Inspired by her passion to promote education and continuously fill the minds of our youth with knowledge and wisdom, " +
                        "the school was established to produce leaders and professionals who are not just ready, " +
                        "but leaders and professionals who are confidently competent to face the world.\n" +
                "\n" +
                "The school occupies the 3rd and 4th floors of the National Book Store Building at the corner of Quezon Avenue and Scout Borromeo in Quezon City.")
        Box(){
            Text(text = vision.title)
            Text(text = vision.desc)
        }
        Box(){
            Text(text = mission.title)
            Text(text = mission.desc)
        }
        Text(text = "Core Values")
        Row {
            Box(){
                Text(text = nurturance.title)
                Text(text = nurturance.desc)
            }
            Box(){
                Text(text = benevolence.title)
                Text(text = benevolence.desc)
            }
            Box(){
                Text(text = service.title)
                Text(text = service.desc)
            }
        }

    }
}