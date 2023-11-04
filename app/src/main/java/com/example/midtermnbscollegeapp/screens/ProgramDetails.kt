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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.midtermnbscollegeapp.R
import com.example.midtermnbscollegeapp.dataclass.programList

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProgramDetails (
    navController: NavController,
    index: Int
){
    val state = rememberScrollState()
    LaunchedEffect(Unit) { state.animateScrollTo(100) }

    Scaffold () {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .background(Color.White)
                .verticalScroll(state),
            verticalArrangement = Arrangement.spacedBy(0.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(0.dp))
            Image(
                painter = painterResource(id = R.drawable.nbscollegelogo),
                contentDescription = "NBS Logo",
                modifier = Modifier.size(150.dp)
            )
            Text(
                text = programList[index].name,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(18.dp),
                textAlign = TextAlign.Center,
                color = Color(0xFF6562DF),
            )
            Spacer(modifier = Modifier.height(0.dp))
            Text(
                text = programList[index].description,
                fontWeight = FontWeight.Normal,
                modifier = Modifier
                    .padding(15.dp),
                textAlign = TextAlign.Center,
                color = Color(0xFF6562DF),
            )
            Spacer(modifier = Modifier.height(0.dp))
            Text(
                text = "Career Opportunities",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color(0xFF6562DF),
            )
            Spacer(modifier = Modifier.height(0.dp))
            Text(
                text = programList[index].career,
                fontWeight = FontWeight.Normal,
                modifier = Modifier
                    .padding(15.dp),
                textAlign = TextAlign.Center,
                color = Color(0xFF6562DF),
            )
            Spacer(modifier = Modifier.height(150.dp))
        }
    }
}