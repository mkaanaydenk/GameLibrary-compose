package com.mehmetkaanaydenk.gamelibrary.domain.repository

import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto.GameDetailDto
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.games_dto.GamesDto

interface GameRepository {
    suspend fun getGames(search: String?): GamesDto
    suspend fun getGameDetail(id: Long): GameDetailDto
}