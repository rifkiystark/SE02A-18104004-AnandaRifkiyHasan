package com.kiki_18104004.praktikum10.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
    data class Quote(
        var id: Int = 0,
        var title: String? = null,
        var description: String? = null,
        var category: String? = null,
        var Umur: Int = 0,
        var Hobby: String? = null,
        var date: String? = null
    ) : Parcelable
