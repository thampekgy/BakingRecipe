package com.example.bakingrecipe.ui.History

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import layout.CostomItemClickListener

/**
 * Created by Windows 10 on 12/31/2017.
 */
/*
class HistorySQLHelper(context: CostomItemClickListener) : SQLiteOpenHelper(
    context,
    DATABASE_NAME,
    null,
    DATABASE_VERSION
) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_ENTRIES)
    }

    override fun onUpgrade(
        db: SQLiteDatabase,
        oldVersion: Int,
        newVersion: Int
    ) { //	This	database	is	only	a	cache	for	online	data,	so	its	upgrade
//	policy	is to	simply	to	discard	the	data	and	start	over
        db.execSQL(SQL_DELETE_ENTRIES)
        onCreate(db)
    }

    override fun onDowngrade(
        db: SQLiteDatabase,
        oldVersion: Int,
        newVersion: Int
    ) {
        onUpgrade(db, oldVersion, newVersion)
    }

    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "assignment.db"
        private const val SQL_CREATE_ENTRIES =
            "CREATE	TABLE	" + HistoryContract.History.TABLE_NAME + "(" +
                    HistoryContract.History.COLUMN_NAME + "	TEXT)"
        private const val SQL_DELETE_ENTRIES =
            "DROP	TABLE	IF	EXISTS	" + HistoryContract.History.TABLE_NAME
    }
}*/
