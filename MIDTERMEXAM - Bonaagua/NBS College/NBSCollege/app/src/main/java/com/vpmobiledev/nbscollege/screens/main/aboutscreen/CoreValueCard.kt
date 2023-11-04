package com.vpmobiledev.nbscollege.screens.main.aboutscreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun CoreValueCard(coreValue: CoreValue) {
    Card(
        modifier = Modifier
            .width(300.dp)
            .height(350.dp)
            .padding(7.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation =  10.dp,
        ),
        content = {
            Text(coreValue.coreValue, modifier = Modifier.padding(16.dp))
            Text(coreValue.coreValueDetail, modifier = Modifier.padding(16.dp))
        }
    )
}