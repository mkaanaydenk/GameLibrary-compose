package com.mehmetkaanaydenk.gamelibrary.data.remote.dto.games_dto

import com.mehmetkaanaydenk.gamelibrary.domain.model.Game

data class GamesDto(
    val count: Int,
    val description: String,
    val filters: Filters,
    val next: String,
    val nofollow: Boolean,
    val nofollow_collections: List<String>,
    val noindex: Boolean,
    val previous: Any,
    val results: List<Result>,
    val seo_description: String,
    val seo_h1: String,
    val seo_keywords: String,
    val seo_title: String
)

fun GamesDto.toGameList(): List<Game>{
    
    return results.map { result -> Game(
        result.background_image,
        result.genres,
        result.id,
        result.name,
        result.rating,
        result.rating_top,
        result.released,
        result.short_screenshots) }
    
}