package com.jerald.nbsapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.jerald.nbsapp.R

@Composable
fun Contact (navController: NavController){

    Column {
        val contact = Contacts(
            address = "3rd & 4th floors, Sct. Borromeo\n" +
                    "corner Quezon Avenue, Diliman, Quezon City",
            phoneNumber = "3rd & 4th floors, Sct. Borromeo\n" +
                    "corner Quezon Avenue, Diliman, Quezon City",
            emailAddress = "info@nbscollege.edu.ph"
        )
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "NBS logo")

        Text(text = contact.address)
        Text(text = contact.phoneNumber)
        Text(text = contact.emailAddress)
    }
}
