package com.dashkevich.domain.repository

import com.dashkevich.domain.model.League
import com.dashkevich.domain.model.TopSoccer

interface ApiRepository {

    suspend fun getLeagues(): List<League>

    suspend fun getTopSoccer(leagueId: Long): List<TopSoccer>
}