package com.woojoo.covidyoungin.util

import android.content.Context
import android.widget.Toast
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.woojoo.covidyoungin.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun gsonBuild(): Gson{
    val gson : Gson = GsonBuilder().setLenient().create()
    return gson
}

fun provideApi() : YoungInAPI
    = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .client(OkHttpClient())
    .addConverterFactory(GsonConverterFactory.create(gsonBuild()))
    .build()
    .create(YoungInAPI::class.java)


fun shortToast(context: Context, message : String){
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

fun longToast(context: Context, message: String){
    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
}