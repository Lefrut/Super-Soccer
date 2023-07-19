package com.dashkevich.domain.use_case

import com.dashkevich.domain.common.AsyncUseCase
import com.dashkevich.domain.model.League
import com.dashkevich.domain.repository.ApiRepository
import com.dashkevich.domain.util.coroutineCatching

class LoadLeaguesUseCase(private val apiRepos: ApiRepository) : AsyncUseCase() {

    suspend operator fun invoke(): Result<List<League>>
    = coroutineCatching(dispatcher) {
        apiRepos.getLeagues()
    }

}