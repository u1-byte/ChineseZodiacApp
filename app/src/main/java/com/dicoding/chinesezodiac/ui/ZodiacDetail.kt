package com.dicoding.chinesezodiac.ui

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.request.RequestOptions
import com.dicoding.chinesezodiac.R

class ZodiacDetail: AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PERS = "extra_personality"
        const val EXTRA_IMG = "extra_image"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_STR1 = "extra_str1"
        const val EXTRA_STR2 = "extra_str2"
        const val EXTRA_STR3 = "extra_str3"
        const val EXTRA_WEAK1 = "extra_weak1"
        const val EXTRA_WEAK2 = "extra_weak2"
        const val EXTRA_WEAK3 = "extra_weak3"
        const val EXTRA_REL1 = "extra_rel1"
        const val EXTRA_REL2 = "extra_rel2"
        const val EXTRA_REL3 = "extra_rel3"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_detail)

        val tvZodiac: TextView = findViewById(R.id.zodiac)
        val imgZodiac: ImageView = findViewById(R.id.img_zodiac)
        val tvPers: TextView = findViewById(R.id.personality)
        val tvDesc: TextView = findViewById(R.id.desc)
        val tvStr1: TextView = findViewById(R.id.strength_1)
        val tvStr2: TextView = findViewById(R.id.strength_2)
        val tvStr3: TextView = findViewById(R.id.strength_3)
        val tvWeak1: TextView = findViewById(R.id.weak_1)
        val tvWeak2: TextView = findViewById(R.id.weak_2)
        val tvWeak3: TextView = findViewById(R.id.weak_3)
        val tvRel1: TextView = findViewById(R.id.relation_1)
        val tvRel2: TextView = findViewById(R.id.relation_2)
        val tvRel3: TextView = findViewById(R.id.relation_3)

        val tZodiac = intent.getStringExtra(EXTRA_NAME)
        val tPers = intent.getStringExtra(EXTRA_PERS)
        val tDesc = intent.getStringExtra(EXTRA_DESC)
        val tImg = intent.getStringExtra(EXTRA_IMG)
        val tStr1 = intent.getStringExtra(EXTRA_STR1)
        val tStr2 = intent.getStringExtra(EXTRA_STR2)
        val tStr3 = intent.getStringExtra(EXTRA_STR3)
        val tWeak1 = intent.getStringExtra(EXTRA_WEAK1)
        val tWeak2 = intent.getStringExtra(EXTRA_WEAK2)
        val tWeak3 = intent.getStringExtra(EXTRA_WEAK3)
        val tRel1 = intent.getStringExtra(EXTRA_REL1)
        val tRel2 = intent.getStringExtra(EXTRA_REL2)
        val tRel3 = intent.getStringExtra(EXTRA_REL3)

        Glide.with(this)
                .load(tImg?.toInt())
                .apply(RequestOptions())
                .into(imgZodiac)
        tvZodiac.text = tZodiac
        tvPers.text = tPers
        tvDesc.text = tDesc
        tvStr1.text = tStr1
        tvStr2.text = tStr2
        tvStr3.text = tStr3
        tvWeak1.text = tWeak1
        tvWeak2.text = tWeak2
        tvWeak3.text = tWeak3
        tvRel1.text = tRel1
        tvRel2.text = tRel2
        tvRel3.text = tRel3


    }
}