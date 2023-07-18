package com.dashkevich.main.util

import com.dashkevich.main.model.LeagueUI

internal val dataLeagueUI = LeagueUI(
    id = 1,
    name = "Premier League",
    countryName = "Ghana",
    logo = "https://apiv2.allsportsapi.com/logo/logo_leagues/177_premier-league.png",
    countyLogo = "https://apiv2.allsportsapi.com/logo/logo_country/50_ghana.png"
)

internal val dataLeaguesUI =
    listOf(dataLeagueUI, dataLeagueUI, dataLeagueUI, dataLeagueUI, dataLeagueUI)