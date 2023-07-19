package com.dashkevich.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "league")
class LeagueEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "country_id")
    val countryId: Int,
    @ColumnInfo(name = "country_logo")
    val countryLogo: String,
    @ColumnInfo(name = "country_name")
    val countryName: String,
    @ColumnInfo(name = "league_logo")
    val leagueLogo: String,
    @ColumnInfo(name = "league_name")
    val leagueName: String
)