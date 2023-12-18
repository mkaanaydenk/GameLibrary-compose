package com.mehmetkaanaydenk.gamelibrary.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mehmetkaanaydenk.gamelibrary.BuildConfig
import com.mehmetkaanaydenk.gamelibrary.presentation.bookmark.BookmarkScreen
import com.mehmetkaanaydenk.gamelibrary.presentation.home.HomeScreen
import com.mehmetkaanaydenk.gamelibrary.presentation.home.HomeViewModel
import com.mehmetkaanaydenk.gamelibrary.presentation.navigation.BottomNavBar
import com.mehmetkaanaydenk.gamelibrary.presentation.navigation.BottomNavItem
import com.mehmetkaanaydenk.gamelibrary.presentation.search.SearchScreen
import com.mehmetkaanaydenk.gamelibrary.presentation.theme.GameLibraryTheme
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GameLibraryTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val navController = rememberNavController()

                    Scaffold(
                        bottomBar = { BottomNavBar(navController = navController) }
                    ) {
                        it
                        bottomBarNavGraph(navHostController = navController)
                    }


                }

            }
        }

    }
}

@Composable
fun bottomBarNavGraph(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = BottomNavItem.Home.route) {
        composable(route = BottomNavItem.Home.route) {
            HomeScreen(navController = navHostController)
        }
        composable(route = BottomNavItem.Search.route) {
            SearchScreen()
        }
        composable(route = BottomNavItem.Bookmark.route) {
            BookmarkScreen()
        }
    }
}
