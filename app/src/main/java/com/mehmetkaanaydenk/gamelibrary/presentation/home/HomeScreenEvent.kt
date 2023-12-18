package com.mehmetkaanaydenk.gamelibrary.presentation.home

import com.mehmetkaanaydenk.gamelibrary.domain.model.Game
import com.mehmetkaanaydenk.gamelibrary.domain.model.GameDetail

sealed class HomeScreenEvent{

    data class NavigateToDetailScreeen(val game: GameDetail): HomeScreenEvent()

}
