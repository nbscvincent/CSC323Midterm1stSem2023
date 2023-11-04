package com.example.midtermnbscollegeapp.dataclass

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNav (
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val route: String,
)