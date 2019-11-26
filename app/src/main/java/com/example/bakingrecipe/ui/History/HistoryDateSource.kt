package com.example.bakingrecipe.ui.History

import android.content.ContentValues
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import layout.CostomItemClickListener
import java.util.*

/**
 * Created by Windows 10 on 12/31/2017.
 */
class HistoryDateSource(context: CostomItemClickListener) : AppCompatActivity() {
    /* var database: SQLiteDatabase? = null
     val dbHelper: HistorySQLHelper = HistorySQLHelper(context)
     val allColumn = arrayOf(
        HistoryContract.History.COLUMN_NAME
    )

    @Throws(SQLException::class)
    fun open() {
        database = dbHelper.writableDatabase
    }

    fun close() {
        dbHelper.close()
    }

    fun insertHistory(userRecord: HistoryRecord) {
        val values = ContentValues()
        values.put(HistoryContract.History.COLUMN_NAME, userRecord.name)
        database = dbHelper.writableDatabase
        database?.insert(HistoryContract.History.TABLE_NAME, null, values)
        database?.close()
    }

    val allUsers: List<HistoryRecord>
        get() {
            val records: MutableList<HistoryRecord> =
                ArrayList()
            database = dbHelper.writableDatabase
            val cursor = database?.query(
                HistoryContract.History.TABLE_NAME,
                allColumn,
                null,
                null,
                null,
                null,
                null
            ).apply {
                this?.moveToFirst()
            }
            while (!cursor.isAfterLast) {
                val historyRecord = HistoryRecord()
                historyRecord.name = cursor.getString(0)
                records.add(historyRecord)
                cursor.moveToNext()
            }
            cursor.close()
            return records
        }

    fun getRecord(getRecord: String): Boolean {
        database = dbHelper.writableDatabase
        val cursor = database?.query(
            HistoryContract.History.TABLE_NAME,
            allColumn,
            "name='$getRecord'",
            null,
            null,
            null,
            null
        )
        return if (cursor.moveToFirst()) {
            true
        } else {
            false
        }
    }
*/
}