package co.kr.itforone.study_01_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import co.kr.itforone.study_01_fragment.Adapters.ViewAdapter
import co.kr.itforone.study_01_fragment.databinding.ActivityMainBinding
import co.kr.itforone.study_01_fragment.fragment.*
import com.bumptech.glide.Glide
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var backPrssedTime: Long =0
    private lateinit var content_main : ViewPager2
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            binding =
                DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
            binding.maindata = this

            for(i in 1..5){
                set_imgview(i)
            }

            val contentlist = listOf(Servercont(), Group(),Mycont(), History(), Organization())
            val adapter = ViewAdapter(this)
            adapter.fragments = contentlist
            Log.d("frag_size", adapter.fragments.size.toString())
            binding.contentMain.adapter = adapter


            val tabLayoutTextArray = arrayOf("주소록","그룹","개인연락처","통화내역","조직도")

            TabLayoutMediator(binding.layoutTabmenu,binding.contentMain){tab,position->
                tab.text = tabLayoutTextArray[position]
            }.attach()

    }

    fun set_imgview(number:Int){

        when(number){

            1->Glide.with(applicationContext) .load(applicationContext.getString(R.string.res_bottombt1)) .into(binding.bottomBt1)
            2->Glide.with(applicationContext) .load(applicationContext.getString(R.string.res_bottombt2)) .into(binding.bottomBt2)
            3->Glide.with(applicationContext) .load(applicationContext.getString(R.string.res_bottombt3)) .into(binding.bottomBt3)
            4->Glide.with(applicationContext) .load(applicationContext.getString(R.string.res_bottombt4)) .into(binding.bottomBt4)
            5->Glide.with(applicationContext) .load(applicationContext.getString(R.string.res_bottombt4)) .into(binding.bottomBt5)

        }

    }

    override fun onBackPressed() {

        val tempTime = System.currentTimeMillis()
        val intervalTime: Long = tempTime - backPrssedTime

        if (0 <= intervalTime && 2000 >= intervalTime) {
            finishAffinity()
        } else {
            backPrssedTime = tempTime
            Toast.makeText(applicationContext, "한번 더 뒤로가기 누를시 앱이 종료됩니다.", Toast.LENGTH_SHORT).show()
        }

    }
}