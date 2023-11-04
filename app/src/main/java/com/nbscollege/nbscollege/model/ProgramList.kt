package com.nbscollege.nbscollege

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nbscollege.nbscollege.model.Programs
import com.nbscollege.nbscollege.model.Testimonials


@Composable
fun ProgramList(


    programs: List<Programs> = listOf(
        Programs("BSCS","BS in Computer Science"),
        Programs("BSA","BS in Accountancy"),
        Programs("BSE","BS in Entrepreneurship"),
        Programs("BSAIS","BS in Accountancy Information System"),
        Programs("BSTM","BS in Tourism Management")
    )
)
{
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Image(
                painter = painterResource(id = R.drawable.nbsc_logo_main),
                contentDescription = "",
                modifier = Modifier
                    .size(500.dp, 180.dp)
            )

            Text(
                text = "  Program List",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 26.sp,
                color = Color.White,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp)
            )

            Spacer(modifier = Modifier
                .padding(top = 30.dp)
            )

            Card (
                colors = CardDefaults.cardColors(
                    containerColor = Color.LightGray,
                ),
                modifier = Modifier
                .size(width = 320.dp, height = 230.dp)

            ) {
                programs.forEach{item ->
                    Text(
                        text = item.programDesc,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 26.sp,
                        color = Color.Blue,
                    )

                }
            }

            Button(onClick = {

            },
                modifier = Modifier
                    .padding(top = 160.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue
                )
            ) {
                Text(
                    text = "READ MORE",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.White,
                )

            }

        }
    }


}