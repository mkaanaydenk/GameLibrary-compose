package com.mehmetkaanaydenk.gamelibrary.domain.model

import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto.AddedByStatus
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto.Developer
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto.EsrbRating
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto.Genre
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto.MetacriticPlatform
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto.ParentPlatform
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto.PlatformXX
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto.Publisher
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto.Rating
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto.Reactions
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto.Store
import com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto.Tag

data class GameDetail(

    val background_image: String,
    val background_image_additional: String,
    val description: String,
    val description_raw: String,
    val developers: List<Developer>,
    val dominant_color: String,
    val genres: List<Genre>,
    val id: Int,
    val metacritic: Int,
    val name: String,
    val name_original: String,
    val publishers: List<Publisher>,
    val rating: Double,
    val rating_top: Int,
    val released: String,
    val saturated_color: String,
    val tags: List<Tag>,

)
