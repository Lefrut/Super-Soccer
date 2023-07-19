package com.dashkevich.data.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [LeagueEntity::class], version = 1)
abstract class SportDatabase: RoomDatabase() {

    abstract fun leagueDao(): LeagueDao

}