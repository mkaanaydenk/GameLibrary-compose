package com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto

data class AddedByStatus(
    val beaten: Int,
    val dropped: Int,
    val owned: Int,
    val playing: Int,
    val toplay: Int,
    val yet: Int
)