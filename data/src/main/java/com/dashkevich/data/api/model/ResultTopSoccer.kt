package com.dashkevich.data.api.model


import com.google.gson.annotations.SerializedName

data class ResultTopSoccer(
    @SerializedName("goals")
    val goals: String,
    @SerializedName("player_key")
    val playerKey: Long,
    @SerializedName("player_name")
    val playerName: String,
    @SerializedName("player_place")
    val playerPlace: String,
    @SerializedName("team_key")
    val teamKey: String,
    @SerializedName("team_name")
    val teamName: String
)