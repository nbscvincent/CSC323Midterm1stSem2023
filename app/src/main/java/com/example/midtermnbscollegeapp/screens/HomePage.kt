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
import com.example.midtermnbscollegeapp.dataclass.Testimonials
import org.w3c.dom.Text

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage (
    navController: NavController
){
    val state = rememberScrollState()
    LaunchedEffect(Unit) { state.animateScrollTo(100) }

    val testimonials = listOf(
        Testimonials(name = "Hans", testimony = "I chose NBS College because of the history of National Book Store. I am now inspired to start…"),
        Testimonials(name = "Lourdes Tan", testimony = "I chose NBS College because the school is a safe haven for us to grow and become the…"),
        Testimonials(name = "Maria Feliz", testimony = "The NBS College faculty and staff are really focused when it comes to the students. They give the…"),
        Testimonials(name = "Mavy", testimony = "The professors are really focused on the students and the schedule of the classes allow me to be…"),
        Testimonials(name = "Jerricho", testimony = "The staff and faculty support each and every one of us. They are very focused on the students"),
    )

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
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Welcome to NBS College Application",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(0xFF6562DF),
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(start = 25.dp, end = 25.dp)
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "A new institution for higher learning rising at the heart of Quezon City and inspired by the 75 year legacy of National Book Store.",
                fontWeight = FontWeight.Normal,
                fontSize = 15.sp,
                color = Color(0xFF6562DF),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(start = 25.dp, end = 25.dp)
            )
            Spacer(modifier = Modifier.height(15.dp))
            testimonials.forEachIndexed { index, item ->
                Card(
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 10.dp, start = 25.dp, end = 25.dp)
                        .fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFF6562DF)
                    )
                ){
                    Column(){
                        Text(
                            text = item.name,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(16.dp),
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = item.testimony,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(16.dp),
                            textAlign = TextAlign.Center
                        )
                    }

                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {  },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 25.dp, end = 25.dp)
                    .align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                ),
                border = BorderStroke(1.dp, Color(0xFF858585)),
                shape = RoundedCornerShape(5.dp),
            ) {
                Text(
                    text = "Enroll Now!",
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

            Spacer(modifier = Modifier.height(150.dp))
        }
    }
}