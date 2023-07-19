package com.dashkevich.domain.use_case

import com.dashkevich.domain.common.AsyncUseCase
import com.dashkevich.domain.model.League
import com.dashkevich.domain.repository.DatabaseRepository
import com.dashkevich.domain.util.coroutineCatching

class LoadLastLeaguesUseCase(private val dbRepos: DatabaseRepository) : AsyncUseCase() {

    suspend operator fun invoke(): Result<List<League>>
    = coroutineCatching(dispatcher){
        return@coroutineCatching dbRepos.getAll()
    }

}