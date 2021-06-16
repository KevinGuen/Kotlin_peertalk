package co.kr.itforone.study_01_fragment.Adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import co.kr.itforone.study_01_fragment.R
import co.kr.itforone.study_01_fragment.dataClases.NonelistItem
import co.kr.itforone.study_01_fragment.databinding.ListitemNoneBinding

class MycontAdapter(var datas: MutableList<NonelistItem>) :
    RecyclerView.Adapter<MycontAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        Log.d("datas_size2", datas.size.toString())
        val binding =
            ListitemNoneBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("datas_size2", position.toString())
        holder.onbind(datas.get(position))

    }

    override fun getItemCount(): Int {
        Log.d("datas_size2", datas.size.toString())
        return datas.size
    }


    inner class ViewHolder(var binding: ListitemNoneBinding) :
        RecyclerView.ViewHolder(binding.root) {

        var tv_1: TextView = binding.noneitemTv
        var tv_2: TextView = binding.noneitemImg
        var tv_3: TextView = binding.noneitemCall


        fun onbind(data: NonelistItem) {
            if(data.name!=null) {
                tv_1.text = data.name
            }
            if(data.src!=null) {
                tv_2.text = data.src
            }
            if(data.number!=null) {
                tv_3.text = data.number
            }


        }

    }
}