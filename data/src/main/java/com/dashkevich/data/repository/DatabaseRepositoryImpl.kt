package com.dashkevich.data.repository

import com.dashkevich.data.database.SportDatabase
import com.dashkevich.data.util.leagueEntityToLeague
import com.dashkevich.data.util.leagueToLeagueEntity
import com.dashkevich.domain.model.League
import com.dashkevich.domain.repository.DatabaseRepository

class DatabaseRepositoryImpl(private val db: SportDatabase) : DatabaseRepository {

    private val leagueDao = db.leagueDao()

    override suspend fun replacementOfLeagues(leagues: List<League>) {
        val leaguesEntity = leagues.map { leagueToLeagueEntity.map(it) }
        leagueDao.replacementOfLeagues(leaguesEntity)
    }

    override suspend fun getAll(): List<League> {
        return leagueDao.getAll().map { leagueEntityToLeague.map(it) }
    }
}