package com.example.bakingrecipe

import android.R
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.bakingrecipe.ui.History.HistoryDateSource
import com.example.bakingrecipe.ui.History.HistoryRecord
import com.example.bakingrecipe.ui.History.HistoryRecordApdater


class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main2)
/*
        val listView: ListView = findViewById(R.id.history_list)

        val historyDateSource = HistoryDateSource(this)

        val values: List<HistoryRecord?> = historyDateSource.allUsers
        val adapter =
            HistoryRecordApdater(this, R.layout.historyrecord, values)

        listView.setAdapter(adapter)*/
    }
}
