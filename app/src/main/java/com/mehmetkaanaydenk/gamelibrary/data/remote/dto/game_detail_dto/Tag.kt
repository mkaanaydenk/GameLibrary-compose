package com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto

data class Tag(
    val games_count: Int,
    val id: Int,
    val image_background: String,
    val language: String,
    val name: String,
    val slug: String
)