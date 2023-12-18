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

    fun executeGetGames(search: String?): Flow<Resource<List<Game>>> = flow {

        try {
            emit(Resource.Loading())
            val gameList = repository.getGames(search)

            println("use case catch'e girmedi")

            if (gameList.count > 0){
                val list = gameList.toGameList()
                if (list.isEmpty()){
                    println("liste boşşş")
                }else{
                    println("liste doluuu")
                    println(list[0].name)
                }
                emit(Resource.Success(gameList.toGameList()))
                println("use case oyun var")
            }else{
                emit(Resource.Error("No game found!"))
                println("use case oyun sayısı 0")
            }

        }catch (e: IOError){
            emit(Resource.Error("No internet connection!"))
        }catch (e: HttpException){
            emit(Resource.Error(message = e.localizedMessage ?: "Error"))
        }

    }

}