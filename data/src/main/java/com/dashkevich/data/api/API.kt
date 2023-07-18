package com.dashkevich.data.api

import com.dashkevich.data.api.model.ResponseLeagues
import retrofit2.http.GET
import retrofit2.http.Query

internal interface API {

    @GET(EMPTY_RESPONSE)
    suspend fun getLeagues(
        @Query(PARAM_MET) met: String = LEAGUES,
        @Query(PARAM_KEY) apiKey: String = API_KEY
    ): ResponseLeagues

}