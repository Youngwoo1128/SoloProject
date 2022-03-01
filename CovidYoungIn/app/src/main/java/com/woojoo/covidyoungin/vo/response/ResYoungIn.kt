package com.woojoo.covidyoungin.vo.response

data class ResYoungIn(
    val resultCode : Int,
    val resultMsg : String,
    val numOfRows : Int,
    val pageNo : Int,
    val totalCount : Int,
    val items : List<CovidList>
)

data class CovidList(
    val no : Int,
    val pbanc_ymd: String,
    val tot_cases: Int,
    val qrntn : Int,
    val qrntn_rmv : Int,
    val dth_cnt : Int,
    val pblcn_dt : String
)