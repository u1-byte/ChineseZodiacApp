package com.dicoding.chinesezodiac.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.chinesezodiac.R
import com.dicoding.chinesezodiac.data.Zodiac
import com.dicoding.chinesezodiac.ui.ZodiacDetail
import de.hdodenhof.circleimageview.CircleImageView

class ZodiacAdapter (private val listZodiac: ArrayList<Zodiac>) : RecyclerView.Adapter<ZodiacAdapter.ZodiacViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZodiacViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ZodiacViewHolder(view)
    }

    override fun onBindViewHolder(holder: ZodiacViewHolder, position: Int) {
        val zodiac = listZodiac[position]

        Glide.with(holder.itemView.context)
                .load(zodiac.mini_img)
                .apply(RequestOptions())
                .into(holder.zImg)

        holder.zName.text = zodiac.name

        val zContext = holder.itemView.context

        holder.itemView.setOnClickListener{
            val moveDetail = Intent(zContext, ZodiacDetail::class.java)
            moveDetail.putExtra(ZodiacDetail.EXTRA_NAME, zodiac.name)
            moveDetail.putExtra(ZodiacDetail.EXTRA_PERS, zodiac.personality)
            moveDetail.putExtra(ZodiacDetail.EXTRA_DESC, zodiac.desc)
            moveDetail.putExtra(ZodiacDetail.EXTRA_IMG, zodiac.img)
            moveDetail.putExtra(ZodiacDetail.EXTRA_STR1, zodiac.str[0])
            moveDetail.putExtra(ZodiacDetail.EXTRA_STR2, zodiac.str[1])
            moveDetail.putExtra(ZodiacDetail.EXTRA_STR3, zodiac.str[2])
            moveDetail.putExtra(ZodiacDetail.EXTRA_WEAK1, zodiac.weak[0])
            moveDetail.putExtra(ZodiacDetail.EXTRA_WEAK2, zodiac.weak[1])
            moveDetail.putExtra(ZodiacDetail.EXTRA_WEAK3, zodiac.weak[2])
            moveDetail.putExtra(ZodiacDetail.EXTRA_REL1, zodiac.relation[0])
            moveDetail.putExtra(ZodiacDetail.EXTRA_REL2, zodiac.relation[1])
            moveDetail.putExtra(ZodiacDetail.EXTRA_REL3, zodiac.relation[2])
            zContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount() = listZodiac.size

    inner class ZodiacViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var zName: TextView = itemView.findViewById(R.id.row_name)
        var zImg: CircleImageView = itemView.findViewById(R.id.row_img)
    }

}