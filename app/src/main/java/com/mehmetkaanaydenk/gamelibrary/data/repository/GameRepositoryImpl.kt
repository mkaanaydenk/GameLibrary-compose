package com.mehmetkaanaydenk.gamelibrary.data.repository

import com.mehmetkaanaydenk.gamelibrary.data.remote.GameAPI
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto.GameDetailDto
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.games_dto.GamesDto
import com.mehmetkaanaydenk.gamelibrary.domain.repository.GameRepository
import javax.inject.Inject

class GameRepositoryImpl @Inject constructor(private val api: GameAPI) : GameRepository {
    override suspend fun getGames(search: String?): GamesDto {
        return api.getGames(search = search)
    }

    override suspend fun getGameDetail(id: Long): GameDetailDto {
        return api.getGameDetails(id = id)
    }
}