package com.miguel.nbscollege.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.miguel.nbscollege.R

@Composable
fun Aboutscreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        LazyColumn() {
            item{
                Image(

                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "NBS LOGO"
                )
                Text(

                    " About NBS College",
                    style = TextStyle(fontSize = 25.sp, color = Color.Black)
                )
                Text(
                    "NBS College was established in honor of the beloved founder of National Book Store, Socorro Cancio-Ramos. Inspired by her passion to promote education and continuously fill the minds of our youth with knowledge and wisdom, the school was established to produce leaders and professionals who are not just ready, but leaders and professionals who are confidently competent to face the world.\n" +
                            "\n" +
                            "The school occupies the 3rd and 4th floors of the National Book Store Building at the corner of Quezon Avenue and Scout Borromeo in Quezon City.",
                    style = TextStyle(fontSize = 18.sp, color = Color.Gray)
                )
            }
            item {

                    Text(
                        " Vision ",
                        style = TextStyle(fontSize = 25.sp, color = Color.Black)
                    )
                    Text(
                        "NBS College is the Philippine school of choice of aspiring leaders and professionals who have strong educational entrepreneurial background to uplift the Philippines and global society.",
                        style = TextStyle(fontSize = 18.sp, color = Color.Gray)
                    )
                        Text(
                            " Mission ",
                            style = TextStyle(fontSize = 25.sp, color = Color.Black)
                        )
                        Text(
                            "NBS College aims to create, with full support from highly esteemed and long-standing nationwide institution, National Book Store, an academic environment for students to transform them into responsible and productive citizens who will make a positive difference in society.",
                            style = TextStyle(fontSize = 18.sp, color = Color.Gray)
                        )
                    }

            item {
                Text(
                    " Core Values ",
                    style = TextStyle(fontSize = 25.sp, color = Color.Black)
                )
            }
            item {
                    Text(
                        " Nurturance ",
                        style = TextStyle(fontSize = 25.sp, color = Color.Black)
                    )
                    Text(
                        "NBS College will be the source of inspiration, courage and strength for its stakeholders in order to promote holistic character growth and development of its students, faculty, support staff.",
                        style = TextStyle(fontSize = 18.sp, color = Color.Gray)
                    )

                        Text(
                            " Benevolence ",
                            style = TextStyle(fontSize = 25.sp, color = Color.Black)
                        )
                        Text(
                            "NBS College will uphold the highest ethical standards and instill in its community generosity of spirit, goodness and kindness.",
                            style = TextStyle(fontSize = 18.sp, color = Color.Gray)
                        )
                        Text(
                            " Service ",
                            style = TextStyle(fontSize = 25.sp, color = Color.Black)
                        )
                        Text(
                            "NBS College commits to develop a strong sense of genuine service and support in our community within and beyond campus.",
                            style = TextStyle(fontSize = 18.sp, color = Color.Gray)
                        )
                }
            }
        }
    }

