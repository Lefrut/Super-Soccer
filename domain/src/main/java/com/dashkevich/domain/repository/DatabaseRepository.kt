package com.dashkevich.domain.repository

import com.dashkevich.domain.model.League

interface DatabaseRepository {

    suspend fun replacementOfLeagues(leagues: List<League>)

    suspend fun getAll(): List<League>
}