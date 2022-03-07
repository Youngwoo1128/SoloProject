package com.woojoo.covidyoungin.util

import com.woojoo.covidyoungin.model.response.ResYoungIn
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface YoungInAPI {

    @GET("covidrspns/getCovidrspns")
    fun getYoungInList(
        @Query("serviceKey") serviceKey: String, // 발급받은 인증키
        @Query("pageNo") pageNo: Int,            // 페이지 번호
        @Query("numOfRows") numOfRows : Int      // 한 페이지당 아이템 수
    ): Call<ResYoungIn>
}