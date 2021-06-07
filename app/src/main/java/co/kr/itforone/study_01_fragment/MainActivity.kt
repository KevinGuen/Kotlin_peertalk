package co.kr.itforone.study_01_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import co.kr.itforone.study_01_fragment.databinding.ActivityMainBinding
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var backPrssedTime: Long =0
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            binding =
                DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
            binding.maindata = this

            for(i in 1..5){
                set_imgview(i)
            }

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