package com.example.midtermnbscollegeapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.midtermnbscollegeapp.R
import com.example.midtermnbscollegeapp.dataclass.Statement

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun About (navController: NavController){

    val statementList = listOf(
        Statement(title = "Mission", description = "NBS College aims to create, with full support from highly esteemed and long-standing nationwide institution, National Book Store, an academic environment for students to transform them into responsible and productive citizens who will make a positive difference in society."),
        Statement(title = "Vision", description = "NBS College is the Philippine school of choice of aspiring leaders and professionals who have strong educational entrepreneurial background to uplift the Philippines and global society."),
        Statement(title = "Core Values", description = "Nurturance , Benevolence, Service")
    )
    val state = rememberScrollState()
    LaunchedEffect(Unit) { state.animateScrollTo(100) }

    Scaffold (){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .background(Color.White)
                .verticalScroll(state),
            verticalArrangement = Arrangement.spacedBy(0.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Spacer(modifier = Modifier.height(0.dp))
            Image(
                painter = painterResource(id = R.drawable.nbscollegelogo),
                contentDescription = "NBS Logo",
                modifier = Modifier.size(150.dp)
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "About NBS College",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(0xFF6562DF),
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(start = 25.dp, end = 25.dp)
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "NBS College was established in honor of the beloved founder of National Book Store, Socorro Cancio-Ramos. Inspired by her passion to promote education and continuously fill the minds of our youth with knowledge and wisdom, the school was established to produce leaders and professionals who are not just ready, but leaders and professionals who are confidently competent to face the world.\n" +
                    "\n" +
                    "The school occupies the 3rd and 4th floors of the National Book Store Building at the corner of Quezon Avenue and Scout Borromeo in Quezon City.",
                fontWeight = FontWeight.Normal,
                fontSize = 15.sp,
                color = Color(0xFF6562DF),
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(start = 25.dp, end = 25.dp)
            )

            statementList.forEachIndexed { index, item ->
                Spacer(modifier = Modifier.height(15.dp))
                Text(text = item.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color(0xFF6562DF),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(start = 25.dp, end = 25.dp)
                )
                Text(text = item.description,
                    fontWeight = FontWeight.Normal,
                    fontSize = 15.sp,
                    color = Color(0xFF6562DF),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(start = 25.dp, end = 25.dp)
                )
            }
            Spacer(modifier = Modifier.height(100.dp))
        }
    }
}