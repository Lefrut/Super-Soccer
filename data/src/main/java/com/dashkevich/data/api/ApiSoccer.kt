package com.dashkevich.data.api

import com.dashkevich.data.api.model.ResponseLeagues
import com.dashkevich.data.api.model.ResponseTopSoccer
import retrofit2.http.GET
import retrofit2.http.Query

internal interface ApiSoccer {

    @GET(EMPTY_RESPONSE)
    suspend fun getLeagues(
        @Query(PARAM_MET) met: String = LEAGUES,
        @Query(PARAM_KEY) apiKey: String = API_KEY
    ): ResponseLeagues

    @GET(EMPTY_RESPONSE)
    suspend fun getTopScorer(
        @Query(PARAM_MET) met: String = TOP_SCORERS,
        @Query(PARAM_LEAGUE_ID) leagueId: Long,
        @Query(PARAM_KEY) apiKey: String = API_KEY,
    ) : ResponseTopSoccer
}