package com.mehmetkaanaydenk.gamelibrary.domain.model

import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto.GameDetailDto

data class GameDetail(

    val background_image: String,
    val background_image_additional: String,
    val description: String,
    val description_raw: String,
    val developers: List<GameDetailDto.Developers>,
    val dominant_color: String,
    val genres: List<GameDetailDto.Genres>,
    val id: Int,
    val metacritic: Int,
    val name: String,
    val name_original: String,
    val publishers: List<GameDetailDto.Publishers>,
    val rating: Double,
    val rating_top: Int,
    val released: String,
    val saturated_color: String,
    val tags: List<GameDetailDto.Tags>,

)
