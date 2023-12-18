package com.mehmetkaanaydenk.gamelibrary.presentation.navigation

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavBar(
    navController: NavHostController
) {

    var screens = listOf(
        BottomNavItem.Home,
        BottomNavItem.Search,
        BottomNavItem.Bookmark
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    var currentDestination = navBackStackEntry?.destination

    @Composable
    fun RowScope.AddItem(
        screen: BottomNavItem,
        navDestination: NavDestination?,
        navController: NavHostController
    ) {

        NavigationBarItem(
            selected = navDestination?.hierarchy?.any { it.route == screen.route } == true,
            onClick = {
                navController.navigate(screen.route) {
                    popUpTo(navController.graph.startDestinationId)
                    launchSingleTop = true
                }
            },
            icon = { Icon(imageVector = screen.icon, contentDescription = null) },
            label = { Text(text = screen.label) })

    }

    NavigationBar {

        screens.forEach { screen ->
            AddItem(
                screen = screen,
                navDestination = currentDestination,
                navController = navController
            )
        }

    }

}