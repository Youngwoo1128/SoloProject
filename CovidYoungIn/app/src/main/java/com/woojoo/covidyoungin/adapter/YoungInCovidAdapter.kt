package com.woojoo.covidyoungin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.woojoo.covidyoungin.viewholder.CovidListViewHolder
import com.woojoo.covidyoungin.databinding.ItemCoivdYounginBinding
import com.woojoo.covidyoungin.model.response.CovidList

/**
 * Class: YoungInCovidAdapter
 * Created by ywsong on 2022/03/03.
 * Description:
 */

class YoungInCovidAdapter(private val covidList : List<CovidList>): RecyclerView.Adapter<CovidListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CovidListViewHolder {
        val binding = ItemCoivdYounginBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CovidListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CovidListViewHolder, position: Int) {
        holder.onBind(covidList[position])
    }

    override fun getItemCount(): Int = covidList.size

}