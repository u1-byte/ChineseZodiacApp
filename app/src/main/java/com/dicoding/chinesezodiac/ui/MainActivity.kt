package com.dicoding.chinesezodiac.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.chinesezodiac.R
import com.dicoding.chinesezodiac.adapter.ZodiacAdapter
import com.dicoding.chinesezodiac.data.Zodiac
import com.dicoding.chinesezodiac.data.ZodiacData

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var rowZodiac: RecyclerView
    private lateinit var btnAbout: ImageButton
    private val listZodiac: ArrayList<Zodiac> = ZodiacData.listData
    private val listZodiacAdapter = ZodiacAdapter(listZodiac)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rowZodiac = findViewById(R.id.row_zodiac)
        showRecycler()

        btnAbout = findViewById(R.id.btn_about)
        btnAbout.setOnClickListener(this)
    }

    private fun showRecycler(){
        rowZodiac.adapter = listZodiacAdapter
        rowZodiac.layoutManager = LinearLayoutManager(this)
        rowZodiac.setHasFixedSize(true)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_about -> {
                val moveAbout = Intent(this@MainActivity, About::class.java)
                startActivity(moveAbout)
            }
        }
    }

}