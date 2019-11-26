package com.example.bakingrecipe

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout.VERTICAL
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bakingrecipe.Adapter.PieAdapter

class PieList : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie_list)



        val rview = findViewById<View>(R.id.rview) as RecyclerView
        val place = intArrayOf(
            R.drawable.strawberry_rhubarb_pie
        )

        val name = arrayOf("Strawberry Rhubarb Pie")

        val lManager = LinearLayoutManager(this, VERTICAL, false)
        rview.setLayoutManager(lManager)

        rview.setHasFixedSize(true)
        rview.adapter =
            PieAdapter(place, name, this)
    }


}
