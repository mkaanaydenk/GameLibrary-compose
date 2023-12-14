package com.mehmetkaanaydenk.gamelibrary.domain.model

import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.games_dto.Genre
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.games_dto.ShortScreenshot


data class Game(

    val background_image: String,
    val genres: List<Genre>,
    val id: Int,
    val name: String,
    val rating: Double,
    val rating_top: Int,
    val released: String,
    val short_screenshots: List<ShortScreenshot>,

)
