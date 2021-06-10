package co.kr.itforone.study_01_fragment.Adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MycontAdapter : RecyclerView.Adapter<MycontAdapter.ViewHolder>{







    inner class ViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(, parent, false)
    ) {

        fun onBindViewHolder(item: LanguageCode) {
            with(itemView) {
                tvCode.text = item.code
                tvLanguage.text = item.language
            }
        }
    }

}