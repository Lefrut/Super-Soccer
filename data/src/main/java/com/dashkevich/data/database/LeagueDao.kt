package com.dashkevich.data.database

import androidx.room.*


@Dao
interface LeagueDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addLeagues(leaguesEntity: List<LeagueEntity>)

    @Query("DELETE FROM league")
    suspend fun deleteAll()

    @Transaction
    suspend fun replacementOfLeagues(leaguesEntity: List<LeagueEntity>){
        deleteAll()
        addLeagues(leaguesEntity)
    }

    @Query("SELECT * FROM league")
    fun getAll(): List<LeagueEntity>




}