package com.woojoo.covidyoungin.model.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ResYoungIn(
    @SerializedName("resultCode") val resultCode : Int,   // 결과 코드 (성공시 0)
    @SerializedName("resultMsg") val resultMsg : String, // 결과 메시지
    @SerializedName("numOfRows") val numOfRows : Int,    // 한 페이지당 표출 데이터 수
    @SerializedName("pageNo") val pageNo : Int,       // 페이지 수
    @SerializedName("totalCount")  val totalCount : Int,   // 데이터 총 개수
    @SerializedName("items") val items : List<CovidList>
): Parcelable

@Parcelize
data class CovidList(
    @SerializedName("no") val no : Int,           // 번호
    @SerializedName("pbanc_ymd") val pbanc_ymd: String,  // 공고일자
    @SerializedName("tot_cases") val tot_cases : Int,     // 코로나19 확진자 계
    @SerializedName("qrntn") val qrntn : Int,        // 코로나19 격리 환자 수
    @SerializedName("qrntn_rmv") val qrntn_rmv : Int,    // 코로나19 격리해제 환자 수
    @SerializedName("dth_cnt") val dth_cnt : Int,      // 코로나19 사망자 수
    @SerializedName("pblcn_dt") val pblcn_dt : String   // 발행일시
): Parcelable