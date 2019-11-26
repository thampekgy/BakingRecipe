package com.example.bakingrecipe.ui.History

import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Windows 10 on 12/31/2017.
 */
class HistoryRecord : AppCompatActivity() {
    var name: String? = null

    override fun toString(): String {
        return HistoryContract.History.COLUMN_NAME + ":" + name
    }
}