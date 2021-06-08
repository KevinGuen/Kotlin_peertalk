package co.kr.itforone.study_01_fragment

import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewAdapter(fa: AppCompatActivity) : FragmentStateAdapter(fa) {

    var fragments = listOf<Fragment>()



    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments.get(position)
    }


}