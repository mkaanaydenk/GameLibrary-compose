package com.mehmetkaanaydenk.gamelibrary.presentation.home

import com.mehmetkaanaydenk.gamelibrary.domain.model.Game

data class HomeScreenState(

    val isLoading: Boolean = false,
    val games: List<Game> = emptyList(),
    val error: String = ""

)
