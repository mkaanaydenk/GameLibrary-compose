package com.mehmetkaanaydenk.gamelibrary.data.remote.dto.games_dto

data class Rating(
    val count: Int,
    val id: Int,
    val percent: Double,
    val title: String
)