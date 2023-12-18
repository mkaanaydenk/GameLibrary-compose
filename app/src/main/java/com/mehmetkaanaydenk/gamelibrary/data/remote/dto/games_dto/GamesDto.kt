package com.mehmetkaanaydenk.gamelibrary.data.remote.dto.games_dto

import com.google.gson.annotations.SerializedName
import com.mehmetkaanaydenk.gamelibrary.domain.model.Game

data class GamesDto(

    @SerializedName("count") var count : Int,
    @SerializedName("next") var next : String,
    @SerializedName("previous") var previous : String,
    @SerializedName("results") var results : List<Results>,
    @SerializedName("seo_title") var seoTitle : String,
    @SerializedName("seo_description") var seoDescription : String,
    @SerializedName("seo_keywords") var seoKeywords : String,
    @SerializedName("seo_h1") var seoH1 : String,
    @SerializedName("noindex") var noindex : Boolean,
    @SerializedName("nofollow") var nofollow : Boolean,
    @SerializedName("description") var description : String,
    @SerializedName("filters") var filters : Filters,
    @SerializedName("nofollow_collections") var nofollowCollections : List<String>

)

{

    data class Results (

        @SerializedName("id") var id : Int,
        @SerializedName("slug") var slug : String,
        @SerializedName("name") var name : String,
        @SerializedName("released") var released : String,
        @SerializedName("tba") var tba : Boolean,
        @SerializedName("background_image") var backgroundImage : String,
        @SerializedName("rating") var rating : Double,
        @SerializedName("rating_top") var ratingTop : Int,
        @SerializedName("ratings") var ratings : List<Ratings>,
        @SerializedName("ratings_count") var ratingsCount : Int,
        @SerializedName("reviews_text_count") var reviewsTextCount : Int,
        @SerializedName("added") var added : Int,
        @SerializedName("added_by_status") var addedByStatus : AddedByStatus,
        @SerializedName("metacritic") var metacritic : Int,
        @SerializedName("playtime") var playtime : Int,
        @SerializedName("suggestions_count") var suggestionsCount : Int,
        @SerializedName("updated") var updated : String,
        @SerializedName("user_game") var userGame : String,
        @SerializedName("reviews_count") var reviewsCount : Int,
        @SerializedName("saturated_color") var saturatedColor : String,
        @SerializedName("dominant_color") var dominantColor : String,
        @SerializedName("platforms") var platforms : List<Platforms>,
        @SerializedName("parent_platforms") var parentPlatforms : List<ParentPlatforms>,
        @SerializedName("genres") var genres : List<Genres>,
        @SerializedName("stores") var stores : List<Stores>,
        @SerializedName("clip") var clip : String,
        @SerializedName("tags") var tags : List<Tags>,
        @SerializedName("esrb_rating") var esrbRating : EsrbRating,
        @SerializedName("short_screenshots") var shortScreenshots : List<ShortScreenshots>

    )

    data class Ratings (

        @SerializedName("id") var id : Int,
        @SerializedName("title") var title : String,
        @SerializedName("count") var count : Int,
        @SerializedName("percent") var percent : Double

    )

    data class AddedByStatus (

        @SerializedName("yet") var yet : Int,
        @SerializedName("owned") var owned : Int,
        @SerializedName("beaten") var beaten : Int,
        @SerializedName("toplay") var toplay : Int,
        @SerializedName("dropped") var dropped : Int,
        @SerializedName("playing") var playing : Int

    )

    data class PlatformChild (

        @SerializedName("id") var id : Int,
        @SerializedName("name") var name : String,
        @SerializedName("slug") var slug : String,
        @SerializedName("image") var image : String,
        @SerializedName("year_end") var yearEnd : String,
        @SerializedName("year_start") var yearStart : Int,
        @SerializedName("games_count") var gamesCount : Int,
        @SerializedName("image_background") var imageBackground : String

    )

    data class Platforms (

        @SerializedName("platform") var platform : PlatformChild,
        @SerializedName("released_at") var releasedAt : String,
        @SerializedName("requirements_en") var requirementsEn : RequirementsEn,
        @SerializedName("requirements_ru") var requirementsRu : RequirementsRu

    )

    data class RequirementsEn(
        @SerializedName("minimum")
        val minimum: String? = null,
        @SerializedName("recommended")
        val recommended: String? = null
    )

    data class RequirementsRu(
        @SerializedName("minimum")
        val minimum: String? = null,
        @SerializedName("recommended")
        val recommended: String? = null
    )

    data class Platform (

        @SerializedName("id") var id : Int,
        @SerializedName("name") var name : String,
        @SerializedName("slug") var slug : String

    )

    data class ParentPlatforms (

        @SerializedName("platform") var platform : Platform

    )

    data class Genres (

        @SerializedName("id") var id : Int,
        @SerializedName("name") var name : String,
        @SerializedName("slug") var slug : String,
        @SerializedName("games_count") var gamesCount : Int,
        @SerializedName("image_background") var imageBackground : String

    )

    data class Store (

        @SerializedName("id") var id : Int,
        @SerializedName("name") var name : String,
        @SerializedName("slug") var slug : String,
        @SerializedName("domain") var domain : String,
        @SerializedName("games_count") var gamesCount : Int,
        @SerializedName("image_background") var imageBackground : String

    )

    data class Stores (

        @SerializedName("id") var id : Int,
        @SerializedName("store") var store : Store

    )

    data class Tags (

        @SerializedName("id") var id : Int,
        @SerializedName("name") var name : String,
        @SerializedName("slug") var slug : String,
        @SerializedName("language") var language : String,
        @SerializedName("games_count") var gamesCount : Int,
        @SerializedName("image_background") var imageBackground : String

    )

    data class EsrbRating (

        @SerializedName("id") var id : Int,
        @SerializedName("name") var name : String,
        @SerializedName("slug") var slug : String

    )

    data class ShortScreenshots (

        @SerializedName("id") var id : Int,
        @SerializedName("image") var image : String

    )


    data class YearsParent (

        @SerializedName("year") var year : Int,
        @SerializedName("count") var count : Int,
        @SerializedName("nofollow") var nofollow : Boolean

    )

    data class Years (

        @SerializedName("from") var from : Int,
        @SerializedName("to") var to : Int,
        @SerializedName("filter") var filter : String,
        @SerializedName("decade") var decade : Int,
        @SerializedName("years") var years : List<YearsParent>,
        @SerializedName("nofollow") var nofollow : Boolean,
        @SerializedName("count") var count : Int

    )

    data class Filters (

        @SerializedName("years") var years : List<Years>

    )
}
fun GamesDto.toGameList(): List<Game>{

    return results.map { results -> Game(
        results.backgroundImage,
        results.genres,
        results.id,
        results.name,
        results.rating,
        results.ratingTop,
        results.released,
        results.shortScreenshots) }

}


