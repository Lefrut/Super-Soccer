package com.dashkevich.data.repository

import com.dashkevich.data.api.ApiSoccer
import com.dashkevich.data.util.leagueMapper
import com.dashkevich.data.util.topSoccerMapper
import com.dashkevich.domain.model.League
import com.dashkevich.domain.model.TopSoccer
import com.dashkevich.domain.repository.ApiRepository

internal class ApiRepositoryImpl(private val api: ApiSoccer) : ApiRepository {

    override suspend fun getLeagues(): List<League> {
        return api.getLeagues().result.leagueMapper()
    }

    override suspend fun getTopSoccer(leagueId: Long): List<TopSoccer> {
        return api.getTopScorer(leagueId = leagueId).resultTopSoccer.topSoccerMapper()
    }

}