package com.dashkevich.data.util

import com.dashkevich.data.api.EMPTY_RESPONSE
import com.dashkevich.data.api.model.ResultLeague
import com.dashkevich.domain.model.League

internal fun List<ResultLeague>.leagueMapper(): List<League> = map { rL ->
    League(
        rL.countryKey, rL.countryLogo, rL.countryName,
        rL.leagueKey, rL.leagueLogo, rL.leagueName
    )
}

