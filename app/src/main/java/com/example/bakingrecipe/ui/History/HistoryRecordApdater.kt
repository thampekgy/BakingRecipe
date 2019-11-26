package com.example.bakingrecipe.ui.History

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.bakingrecipe.R

/**
 * Created by Windows 10 on 1/1/2018.
 */
class HistoryRecordApdater(
    context: Activity?,
    resource: Int,
    list: List<HistoryRecord?>?
) : ArrayAdapter<HistoryRecord?>(context, resource, list) {
    override fun getView(
        position: Int,
        convertView: View,
        parent: ViewGroup
    ): View {
        var convertView = convertView
        val historyRecord = getItem(position)
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(
                R.layout.historyrecord,
                parent,
                false
            )
        }
        val textViewName1: TextView
        textViewName1 = convertView.findViewById<View>(R.id.textView1) as TextView
        textViewName1.text = historyRecord!!.name
        return convertView
    }
}