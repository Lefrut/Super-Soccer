package com.dashkevich.domain.repository

import com.dashkevich.domain.model.League

interface ApiRepository {

    suspend fun getLeagues(): List<League>

}