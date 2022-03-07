package com.woojoo.covidyoungin.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.GsonBuilder
import com.woojoo.covidyoungin.SERVICE_KEY
import com.woojoo.covidyoungin.util.provideApi
import com.woojoo.covidyoungin.model.response.ResYoungIn
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Class: MainViewModel
 * Created by ywsong on 2022/03/02.
 * Description:
 */
class MainViewModel: ViewModel() {

    private val api by lazy { provideApi() }

    private val _younginList = MutableLiveData<ResYoungIn>()
    val younginList : LiveData<ResYoungIn>
        get() = _younginList

    fun getYoungInList(pageNo: Int, numOfRows: Int){
        api.getYoungInList(SERVICE_KEY, pageNo, numOfRows).enqueue(object : Callback<ResYoungIn>{
            override fun onResponse(call: Call<ResYoungIn>, response: Response<ResYoungIn>) {
                if (response.isSuccessful){
                    _younginList.value = response.body()
                }else{
                    Log.d("responseFail", "${response.errorBody()}")
                }
            }

            override fun onFailure(call: Call<ResYoungIn>, t: Throwable) {
                Log.d("errorMessage", "${t.message}")
            }

        })
    }

}