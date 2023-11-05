package com.nbscollege.nbscollege.model

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.nbscollege.nbscollege.R
import com.nbscollege.nbscollege.dataclass.Statement


@Composable
fun AboutScreen(
    statement: List<Statement> = listOf(
        Statement("Vision","NBS College is the Philippine school of choice of aspiring leaders and professionals who have strong educational entrepreneurial background to uplift the Philippines and global society.\n"),
        Statement("Mission","NBS College aims to create, with full support from highly esteemed and long-standing nationwide institution, National Book Store, an academic environment for students to transform them into responsible and productive citizens who will make a positive difference in society.\n"),
        Statement("Core Values","Nurturance, Benevolence, Service")
    )

) {

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
                text = " Details about NBSC",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 28.sp,
                color = Color.White,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            )
            Spacer(
                modifier = Modifier
                    .padding(top = 30.dp)
            )

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.Yellow,
                ),
                modifier = Modifier
                    .size(width = 330.dp, height = 400.dp)

            ) {
                statement.forEach { item ->
                    Text(
                        text = item.title,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 22.sp,
                        color = Color.Black
                    )
                    Spacer(
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                    Text(
                        text = item.description,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                        color = Color.Blue,
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}
