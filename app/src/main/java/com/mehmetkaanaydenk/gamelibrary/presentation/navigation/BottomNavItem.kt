package com.mehmetkaanaydenk.gamelibrary.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmarks
import androidx.compose.material.icons.filled.Games
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val route: String, val icon: ImageVector, val label: String) {
    object Home : BottomNavItem("home", Icons.Default.Games, "Home")
    object Search : BottomNavItem("search", Icons.Default.Search, "Search")
    object Bookmark : BottomNavItem("bookmark", Icons.Default.Bookmarks, "Bookmark")
}

