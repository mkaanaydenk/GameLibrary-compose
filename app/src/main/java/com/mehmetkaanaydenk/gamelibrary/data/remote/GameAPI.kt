package com.mehmetkaanaydenk.gamelibrary.data.remote

import com.mehmetkaanaydenk.gamelibrary.BuildConfig
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto.GameDetailDto
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.games_dto.GamesDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GameAPI {

    @GET("games")
    suspend fun getGames(
        @Query("search") search: String? = null,
        @Query("key") apiKey: String = BuildConfig.API_KEY
    ): GamesDto

    @GET("games/{id}")
    suspend fun getGameDetails(
        @Path("id") id: Long,
        @Query("key") apiKey: String = BuildConfig.API_KEY
    ): GameDetailDto


}