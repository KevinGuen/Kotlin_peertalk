package co.kr.itforone.study_01_fragment.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import co.kr.itforone.study_01_fragment.Adapters.MycontAdapter
import co.kr.itforone.study_01_fragment.R
import co.kr.itforone.study_01_fragment.dataClases.NonelistItem
import co.kr.itforone.study_01_fragment.databinding.FragmentMycontBinding

class Mycont :Fragment(){
    private lateinit var databind : FragmentMycontBinding
    private lateinit var mycontAdapter: MycontAdapter
    private  var temp = mutableListOf<NonelistItem>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        for(i in 1..10) {

            temp.add(NonelistItem("test"+i, "testsrc"+i, "010-1231-123"+i))

        }

        Log.d("datas_size", temp.toString())

        databind = DataBindingUtil.inflate(inflater, R.layout.fragment_mycont, container,false)
        mycontAdapter = MycontAdapter(temp)
        databind.myconList.layoutManager = LinearLayoutManager(activity,RecyclerView.VERTICAL, false)
        databind.myconList.adapter = mycontAdapter
        Log.d("datas_size", mycontAdapter.datas.size.toString())

        return databind.root
    }
}