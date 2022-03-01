package com.woojoo.covidyoungin.util

import com.woojoo.covidyoungin.vo.response.ResYoungIn
import retrofit2.http.GET
import retrofit2.http.Query


interface YoungInAPI {

    @GET
    fun getYoungInList(
        @Query("serviceKey") serviceKey: String,
        @Query("pageNo") pageNo: Int,
        @Query("numOfRows") numOfRows : Int
    ): ResYoungIn
}