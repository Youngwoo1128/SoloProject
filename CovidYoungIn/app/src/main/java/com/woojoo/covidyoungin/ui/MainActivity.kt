package com.woojoo.covidyoungin.ui

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.woojoo.covidyoungin.R
import com.woojoo.covidyoungin.adapter.YoungInCovidAdapter
import com.woojoo.covidyoungin.databinding.ActivityMainBinding
import com.woojoo.covidyoungin.model.response.CovidList
import com.woojoo.covidyoungin.util.shortToast
import com.woojoo.covidyoungin.viewmodel.MainViewModel

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        setObserver()
        viewModel.getYoungInList(1, 30)
    }

    private fun setObserver(){
        viewModel.younginList.observe(this, Observer {
            when (it.resultCode){
                0 ->{
                    setRecyclerView(it.items)
                }
                else ->{
                    shortToast(this, getString(R.string.toast_error))
                }
            }
        })
    }

    private fun setRecyclerView(item : List<CovidList>){
        val adapter = YoungInCovidAdapter(item)
        binding.rvCovidList.adapter = adapter
    }
}