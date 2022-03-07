package com.woojoo.covidyoungin.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.woojoo.covidyoungin.R
import com.woojoo.covidyoungin.databinding.ItemCoivdYounginBinding
import com.woojoo.covidyoungin.model.response.CovidList

/**
 * Class: CovidListViewHolder
 *
 * Created by ywsong on 2022/03/03.
 * Description:
 */
class CovidListViewHolder(val binding : ItemCoivdYounginBinding) : RecyclerView.ViewHolder(binding.root){

    fun onBind(item: CovidList){
        binding.tvAnnounceDate.text = binding.root.context.getString(R.string.covid_announce_data, item.pbanc_ymd)
        binding.tvConfirmedCount.text = binding.root.context.getString(R.string.covid_confirmed_count, item.tot_cases)
        binding.tvIsolatedCount.text = binding.root.context.getString(R.string.covid_isolated_patient_count, item.qrntn)
        binding.tvCanceledIsolatedCount.text = binding.root.context.getString(R.string.covid_cancel_isolated_patient_count, item.qrntn_rmv)
        binding.tvDeadCount.text = binding.root.context.getString(R.string.covid_dead_count, item.dth_cnt)
    }
}