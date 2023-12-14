package com.mehmetkaanaydenk.gamelibrary.data.remote.dto.games_dto

data class Year(
    val count: Int,
    val decade: Int,
    val filter: String,
    val from: Int,
    val nofollow: Boolean,
    val to: Int,
    val years: List<Years>
)