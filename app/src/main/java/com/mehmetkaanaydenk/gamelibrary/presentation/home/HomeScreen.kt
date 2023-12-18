package com.mehmetkaanaydenk.gamelibrary.presentation.home

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel()
){

    val state = viewModel.state.value
    Text(text = "Home Screen", style = MaterialTheme.typography.bodyLarge)
}

@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen(navController = rememberNavController())
}