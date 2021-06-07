package co.kr.itforone.study_01_fragment.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import co.kr.itforone.study_01_fragment.R
import co.kr.itforone.study_01_fragment.databinding.FragmentServercontBinding

class Servercont :Fragment(){
    private lateinit var databind : FragmentServercontBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        databind = DataBindingUtil.inflate(inflater, R.layout.fragment_servercont, container,false)

        return databind.root

    }
}