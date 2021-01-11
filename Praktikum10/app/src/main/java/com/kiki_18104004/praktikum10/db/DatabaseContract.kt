package com.kiki_18104004.praktikum10.db

import android.provider.BaseColumns

internal class DatabaseContract {
    internal class QuoteColumns : BaseColumns {
        companion object {
            const val TABLE_QUOTE = "quote"
            const val _ID = "_id"
            const val TITLE = "title"
            const val DESCRIPTION = "description"
            const val CATEGORY = "category"
            const val UMUR = "umur"
            const val HOBBY = "hobby"
            const val DATE = "date"
        }
    }
}