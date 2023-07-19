package com.dashkevich.data.repository

import com.dashkevich.data.api.API
import com.dashkevich.data.util.leagueMapper
import com.dashkevich.domain.model.League
import com.dashkevich.domain.repository.ApiRepository

internal class ApiRepositoryImpl(private val api: API): ApiRepository {

    override suspend fun getLeagues(): List<League> {
        return api.getLeagues().result.leagueMapper()
    }

}