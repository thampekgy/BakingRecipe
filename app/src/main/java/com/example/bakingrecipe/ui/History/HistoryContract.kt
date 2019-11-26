package com.example.bakingrecipe.ui.History

import android.provider.BaseColumns
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Windows 10 on 12/31/2017.
 */
class HistoryContract : AppCompatActivity() {
    object History : BaseColumns {
        const val TABLE_NAME = "searchHistory"
        const val COLUMN_NAME = "name"
    }
}