package co.kr.itforone.study_01_fragment.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import co.kr.itforone.study_01_fragment.dataClases.NonelistItem

class MycontAdapter  : RecyclerView.Adapter<MycontAdapter.ViewHolder>() {

    var datas = mutableListOf<NonelistItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(, parent, false)

        return view

        TODO("Not yet implemented")
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


    inner class ViewHolder (view : View) : RecyclerView.ViewHolder(view) {






    }


}