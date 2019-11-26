package com.example.bakingrecipe.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.example.bakingrecipe.*
import com.example.bakingrecipe.Holder.PieHolder
import com.example.bakingrecipe.ui.Pie.StrawberryRhubarbPie
import layout.CostomItemClickListener

class PieAdapter (private val place : IntArray, private val name :Array<String>, private val mContext: Context):RecyclerView.Adapter<PieHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PieHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.pie_list2, parent, false)
        return PieHolder(v, mContext)
    }

    override fun onBindViewHolder(holder: PieHolder, position: Int) {
        holder?.index(place[position], name[position])
        holder.setOnCostomItemClickListener(object:CostomItemClickListener{
            override fun onCostomItemClickListener(view: View, pos: Int) {

                if(position == 0)
                {
                    val intent = Intent(view.context, StrawberryRhubarbPie::class.java)
                    view.context.startActivity(intent)
                }
                //Toast.makeText(mContext, "Name: ", Toast.LENGTH_LONG).show()
            }
        })
    }




    override fun getItemCount(): Int {
        return place.size
    }

    private var onItemClickListener: AdapterView.OnItemClickListener? = null

    fun setOnItemClickListener(onItemClickListener: AdapterView.OnItemClickListener) {
        this.onItemClickListener = onItemClickListener
    }


}

