package com.nbscollege.nbscollege.dataclass

import androidx.compose.ui.graphics.vector.ImageVector
import com.nbscollege.nbscollege.navigation.routes.route

data class NavigationItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: route,
    val route: String,

    )
