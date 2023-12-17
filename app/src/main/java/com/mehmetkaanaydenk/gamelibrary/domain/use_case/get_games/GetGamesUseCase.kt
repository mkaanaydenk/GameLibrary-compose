package com.mehmetkaanaydenk.gamelibrary.domain.use_case.get_games

import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.games_dto.GamesDto
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.games_dto.toGameList
import com.mehmetkaanaydenk.gamelibrary.domain.model.Game
import com.mehmetkaanaydenk.gamelibrary.domain.repository.GameRepository
import com.mehmetkaanaydenk.gamelibrary.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOError
import javax.inject.Inject

class GetGamesUseCase @Inject constructor(private val repository: GameRepository) {

    fun executeGetGames(search: String): Flow<Resource<List<Game>>> = flow {

        try {
            emit(Resource.Loading())
            val gameList = repository.getGames(search)

            if (gameList.count > 0){

                emit(Resource.Success(gameList.toGameList()))

            }else{
                emit(Resource.Error("No game found!"))
            }

        }catch (e: IOError){
            emit(Resource.Error("No internet connection!"))
        }catch (e: HttpException){
            emit(Resource.Error(message = e.localizedMessage ?: "Error"))
        }

    }

}