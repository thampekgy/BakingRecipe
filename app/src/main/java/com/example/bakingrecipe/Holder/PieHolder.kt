package com.example.bakingrecipe.Holder

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bakingrecipe.R
import layout.CostomItemClickListener

class PieHolder (itemView: View, private val mContent: Context): RecyclerView.ViewHolder(itemView), View.OnClickListener {

    private val iview: ImageView
    private val tview: TextView
    var costomItemClickListener: CostomItemClickListener?=null

    init{
        iview = itemView.findViewById<View>(R.id.iview) as ImageView
        tview = itemView.findViewById<View>(R.id.tview) as TextView
        itemView.setOnClickListener(this)
    }

    fun setOnCostomItemClickListener(itemClickListener: CostomItemClickListener){
        this.costomItemClickListener = itemClickListener
    }

    override fun onClick(v: View?) {
        this.costomItemClickListener!!.onCostomItemClickListener(v!!, adapterPosition)
    }



    fun index(item : Int, s:String){
        Glide.with(mContent).load(item).into(iview)

        tview.text = s

    }


}