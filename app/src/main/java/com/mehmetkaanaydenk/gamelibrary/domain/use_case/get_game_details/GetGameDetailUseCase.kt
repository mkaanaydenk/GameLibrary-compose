package com.mehmetkaanaydenk.gamelibrary.domain.use_case.get_game_details

import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto.toGameDetail
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.games_dto.toGameList
import com.mehmetkaanaydenk.gamelibrary.domain.model.Game
import com.mehmetkaanaydenk.gamelibrary.domain.model.GameDetail
import com.mehmetkaanaydenk.gamelibrary.domain.repository.GameRepository
import com.mehmetkaanaydenk.gamelibrary.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOError
import javax.inject.Inject

class GetGameDetailUseCase @Inject constructor(private val repository: GameRepository) {

    fun executeGetGameDetail(id: Long): Flow<Resource<GameDetail>> = flow {

        try {
            emit(Resource.Loading())
            val game = repository.getGameDetail(id)
            emit(Resource.Success(game.toGameDetail()))
        }catch (e: IOError){
            emit(Resource.Error("No internet connection!"))
        }catch (e: HttpException){
            emit(Resource.Error(message = e.localizedMessage ?: "Error"))
        }

    }

}