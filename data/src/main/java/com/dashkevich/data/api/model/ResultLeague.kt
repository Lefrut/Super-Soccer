package com.dashkevich.data.api.model


import com.google.gson.annotations.SerializedName

class ResultLeague(
    @SerializedName("country_key")
    val countryKey: Int,
    @SerializedName("country_logo")
    val countryLogo: String,
    @SerializedName("country_name")
    val countryName: String,
    @SerializedName("league_key")
    val leagueKey: Int,
    @SerializedName("league_logo")
    val leagueLogo: String,
    @SerializedName("league_name")
    val leagueName: String
)