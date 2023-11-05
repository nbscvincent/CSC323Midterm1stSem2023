package com.nbscollege.nbscollege.model

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.nbscollege.nbscollege.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNav() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.nbsc_logo_main),
            contentDescription = "",
            modifier = Modifier
                .size(500.dp, 300.dp)
        )

        Spacer(
            modifier = Modifier
                .padding(top = 300.dp)
        )


        BottomAppBar {

            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home",
                modifier = Modifier
                    .size(90.dp)
            )

            Icon(
                imageVector = Icons.Default.Info,
                contentDescription = "About",
                modifier = Modifier
                    .size(90.dp)


            )
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Program",
                modifier = Modifier
                    .size(90.dp)

            )
            Icon(
                imageVector = Icons.Default.Call,
                contentDescription = "Contact",
                modifier = Modifier
                    .size(90.dp)
            )
        }
    }
}