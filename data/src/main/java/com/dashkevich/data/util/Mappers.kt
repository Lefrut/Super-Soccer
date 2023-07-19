package com.dashkevich.data.util

import com.dashkevich.data.api.model.ResultLeague
import com.dashkevich.data.api.model.ResultTopSoccer
import com.dashkevich.data.database.LeagueEntity
import com.dashkevich.domain.model.League
import com.dashkevich.domain.model.TopSoccer


internal fun List<ResultLeague>.leagueMapper(): List<League> = map { rL ->
    League(
        rL.countryKey, rL.countryLogo, rL.countryName,
        rL.leagueKey, rL.leagueLogo, rL.leagueName
    )
}

internal fun List<ResultTopSoccer>.topSoccerMapper(): List<TopSoccer> = map { soccer ->
    TopSoccer(
        playerId = soccer.playerKey,
        goals = soccer.goals,
        playerName = soccer.playerName,
        teamName = soccer.teamName
    )
}

fun interface Mapper<T, V> {
    fun map(value: T): V
}

val leagueToLeagueEntity: Mapper<League, LeagueEntity> = Mapper {
    LeagueEntity(
        it.leagueId,
        it.countryId,
        it.countryLogo,
        it.countryName,
        it.leagueLogo,
        it.leagueName
    )
}

val leagueEntityToLeague: Mapper<LeagueEntity, League> = Mapper {
    League(
        it.countryId,
        it.countryLogo,
        it.leagueName,
        it.id,
        it.leagueLogo,
        it.leagueName
    )
}



