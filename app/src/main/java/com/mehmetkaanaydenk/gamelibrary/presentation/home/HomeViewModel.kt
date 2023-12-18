package com.mehmetkaanaydenk.gamelibrary.presentation.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mehmetkaanaydenk.gamelibrary.domain.use_case.get_games.GetGamesUseCase
import com.mehmetkaanaydenk.gamelibrary.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val getGamesUseCase: GetGamesUseCase): ViewModel() {

    private val _state = mutableStateOf<HomeScreenState>(HomeScreenState())
    val state : State<HomeScreenState> = _state


    init {
        getGames()
    }

    fun getGames(){

        getGamesUseCase.executeGetGames(null).onEach {

            when(it){
                is Resource.Success ->{
                    println("vm success döndü")
                    _state.value = _state.value.copy(games = it.data ?: emptyList())
                    println(it.data?.get(1)?.name)
                }

                is Resource.Loading ->{
                    _state.value = _state.value.copy(isLoading = true)
                    println("vm loading döndü")
                }

                is Resource.Error ->{
                    _state.value = _state.value.copy(error = it.message ?: "Error!")
                    println("vm error döndü")
                }
            }

        }.launchIn(viewModelScope)

    }

}