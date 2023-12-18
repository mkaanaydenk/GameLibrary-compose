package com.mehmetkaanaydenk.gamelibrary.data.remote.dto.game_detail_dto
import com.google.gson.annotations.SerializedName
import com.mehmetkaanaydenk.gamelibrary.domain.model.GameDetail

data class GameDetailDto(

    @SerializedName("id") var id : Int,
    @SerializedName("slug") var slug : String,
    @SerializedName("name") var name : String,
    @SerializedName("name_original") var nameOriginal : String,
    @SerializedName("description") var description : String,
    @SerializedName("metacritic") var metacritic : Int,
    @SerializedName("metacritic_platforms") var metacriticPlatforms : List<MetacriticPlatforms>,
    @SerializedName("released") var released : String,
    @SerializedName("tba") var tba : Boolean,
    @SerializedName("updated") var updated : String,
    @SerializedName("background_image") var backgroundImage : String,
    @SerializedName("background_image_additional") var backgroundImageAdditional : String,
    @SerializedName("website") var website : String,
    @SerializedName("rating") var rating : Double,
    @SerializedName("rating_top") var ratingTop : Int,
    @SerializedName("ratings") var ratings : List<Ratings>,
    @SerializedName("reactions") var reactions : Reactions,
    @SerializedName("added") var added : Int,
    @SerializedName("added_by_status") var addedByStatus : AddedByStatus,
    @SerializedName("playtime") var playtime : Int,
    @SerializedName("screenshots_count") var screenshotsCount : Int,
    @SerializedName("movies_count") var moviesCount : Int,
    @SerializedName("creators_count") var creatorsCount : Int,
    @SerializedName("achievements_count") var achievementsCount : Int,
    @SerializedName("parent_achievements_count") var parentAchievementsCount : Int,
    @SerializedName("reddit_url") var redditUrl : String,
    @SerializedName("reddit_name") var redditName : String,
    @SerializedName("reddit_description") var redditDescription : String,
    @SerializedName("reddit_logo") var redditLogo : String,
    @SerializedName("reddit_count") var redditCount : Int,
    @SerializedName("twitch_count") var twitchCount : Int,
    @SerializedName("youtube_count") var youtubeCount : Int,
    @SerializedName("reviews_text_count") var reviewsTextCount : Int,
    @SerializedName("ratings_count") var ratingsCount : Int,
    @SerializedName("suggestions_count") var suggestionsCount : Int,
    @SerializedName("alternative_names") var alternativeNames : List<String>,
    @SerializedName("metacritic_url") var metacriticUrl : String,
    @SerializedName("parents_count") var parentsCount : Int,
    @SerializedName("additions_count") var additionsCount : Int,
    @SerializedName("game_series_count") var gameSeriesCount : Int,
    @SerializedName("user_game") var userGame : String,
    @SerializedName("reviews_count") var reviewsCount : Int,
    @SerializedName("saturated_color") var saturatedColor : String,
    @SerializedName("dominant_color") var dominantColor : String,
    @SerializedName("parent_platforms") var parentPlatforms : List<ParentPlatforms>,
    @SerializedName("platforms") var platforms : List<Platforms>,
    @SerializedName("stores") var stores : List<Stores>,
    @SerializedName("developers") var developers : List<Developers>,
    @SerializedName("genres") var genres : List<Genres>,
    @SerializedName("tags") var tags : List<Tags>,
    @SerializedName("publishers") var publishers : List<Publishers>,
    @SerializedName("esrb_rating") var esrbRating : EsrbRating,
    @SerializedName("clip") var clip : String,
    @SerializedName("description_raw") var descriptionRaw : String

){

    data class Platform (

        @SerializedName("platform") var platform : Int,
        @SerializedName("name") var name : String,
        @SerializedName("slug") var slug : String

    )

    data class MetacriticPlatforms (

        @SerializedName("metascore") var metascore : Int,
        @SerializedName("url") var url : String,
        @SerializedName("platform") var platform : Platform

    )

    data class Ratings (

        @SerializedName("id") var id : Int,
        @SerializedName("title") var title : String,
        @SerializedName("count") var count : Int,
        @SerializedName("percent") var percent : Double

    )

    data class Reactions (

        @SerializedName("1") var r1 : Int,
        @SerializedName("2") var r2 : Int,
        @SerializedName("3") var r3 : Int,
        @SerializedName("4") var r4 : Int,
        @SerializedName("5") var r5 : Int,
        @SerializedName("6") var r6 : Int,
        @SerializedName("7") var r7 : Int,
        @SerializedName("8") var r8 : Int,
        @SerializedName("9") var r9 : Int,
        @SerializedName("10") var r10 : Int,
        @SerializedName("11") var r11 : Int,
        @SerializedName("12") var r12 : Int,
        @SerializedName("13") var r13 : Int,
        @SerializedName("14") var r14 : Int,
        @SerializedName("15") var r15 : Int,
        @SerializedName("16") var r16 : Int,
        @SerializedName("18") var r18 : Int,
        @SerializedName("20") var r20 : Int,
        @SerializedName("21") var r21 : Int

    )

    data class AddedByStatus (

        @SerializedName("yet") var yet : Int,
        @SerializedName("owned") var owned : Int,
        @SerializedName("beaten") var beaten : Int,
        @SerializedName("toplay") var toplay : Int,
        @SerializedName("dropped") var dropped : Int,
        @SerializedName("playing") var playing : Int

    )

    data class ParentPlatforms (

        @SerializedName("platform") var platform : Platform

    )

    data class Requirements (
        val minimum: String? = null,
        val recommended: String? = null
    )

    data class Platforms (

        @SerializedName("platform") var platform : Platform,
        @SerializedName("released_at") var releasedAt : String,
        @SerializedName("requirements") var requirements : Requirements

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
        @SerializedName("url") var url : String,
        @SerializedName("store") var store : Store

    )

    data class Developers (

        @SerializedName("id") var id : Int,
        @SerializedName("name") var name : String,
        @SerializedName("slug") var slug : String,
        @SerializedName("games_count") var gamesCount : Int,
        @SerializedName("image_background") var imageBackground : String

    )

    data class Genres (

        @SerializedName("id") var id : Int,
        @SerializedName("name") var name : String,
        @SerializedName("slug") var slug : String,
        @SerializedName("games_count") var gamesCount : Int,
        @SerializedName("image_background") var imageBackground : String

    )

    data class Tags (

        @SerializedName("id") var id : Int,
        @SerializedName("name") var name : String,
        @SerializedName("slug") var slug : String,
        @SerializedName("language") var language : String,
        @SerializedName("games_count") var gamesCount : Int,
        @SerializedName("image_background") var imageBackground : String

    )

    data class Publishers (

        @SerializedName("id") var id : Int,
        @SerializedName("name") var name : String,
        @SerializedName("slug") var slug : String,
        @SerializedName("games_count") var gamesCount : Int,
        @SerializedName("image_background") var imageBackground : String

    )

    data class EsrbRating (

        @SerializedName("id") var id : Int,
        @SerializedName("name") var name : String,
        @SerializedName("slug") var slug : String

    )
}
fun GameDetailDto.toGameDetail(): GameDetail{
    return GameDetail(
        backgroundImage,
        backgroundImageAdditional,
        description,
        descriptionRaw,
        developers,
        dominantColor,
        genres,
        id,
        metacritic,
        name,
        nameOriginal,
        publishers,
        rating,
        ratingTop,
        released,
        saturatedColor,
        tags)
}
