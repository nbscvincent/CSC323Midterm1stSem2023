package com.example.midtermnbscollegeapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.midtermnbscollegeapp.R
import com.example.midtermnbscollegeapp.dataclass.Program
import com.example.midtermnbscollegeapp.dataclass.programList
import com.example.midtermnbscollegeapp.route.Route

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Programs (navController: NavController){

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
                contentDescription = "Schdulix",
                modifier = Modifier.size(150.dp)
            )
            programList.forEachIndexed { index, program ->
                Card(
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 10.dp, start = 25.dp, end = 25.dp)
                        .fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFF6562DF)
                    )
                ){
                    Column(

                    ){
                        Text(
                            text = program.name,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(16.dp),
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = program.description.substring(0,55) + "....",
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(16.dp),
                            textAlign = TextAlign.Center
                        )
                        Button(
                            onClick = {
                                navController.navigate("ProgramDetails/$index")
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.CenterHorizontally),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Gray,
                            ),
                            border = BorderStroke(1.dp, Color(0xFF858585)),
                            shape = RoundedCornerShape(5.dp),
                        ) {
                            Text(
                                text = "Read more",
                                fontWeight = FontWeight.Normal,
                                fontSize = 15.sp,
                                color = Color.White,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .fillMaxWidth()
                                    .padding(top = 10.dp, bottom = 10.dp)
                            )
                            Spacer(modifier = Modifier.weight(1f))
                        }
                    }

                }
            }
            Spacer(modifier = Modifier.height(150.dp))
        }
    }
}