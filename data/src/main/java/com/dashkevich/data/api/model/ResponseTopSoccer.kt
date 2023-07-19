package com.dashkevich.data.api.model


import com.google.gson.annotations.SerializedName

data class ResponseTopSoccer(
    @SerializedName("success")
    val success: Int,
    @SerializedName("result")
    val resultTopSoccer: List<ResultTopSoccer>
)