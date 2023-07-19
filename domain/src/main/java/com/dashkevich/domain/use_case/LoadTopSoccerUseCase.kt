package com.dashkevich.domain.use_case

import com.dashkevich.domain.common.AsyncUseCase
import com.dashkevich.domain.model.TopSoccer
import com.dashkevich.domain.repository.ApiRepository
import com.dashkevich.domain.util.coroutineCatching

class LoadTopSoccerUseCase(private val apiRepos: ApiRepository) : AsyncUseCase() {

    suspend operator fun invoke(leagueId: Long): Result<List<TopSoccer>>
    = coroutineCatching(dispatcher) {
            apiRepos.getTopSoccer(leagueId)
        }
}