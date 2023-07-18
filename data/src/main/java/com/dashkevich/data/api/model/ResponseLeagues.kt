package com.dashkevich.data.api.model


import com.google.gson.annotations.SerializedName

class ResponseLeagues(
    @SerializedName("result")
    val result: List<ResultLeague>,
    @SerializedName("success")
    val success: Int
)