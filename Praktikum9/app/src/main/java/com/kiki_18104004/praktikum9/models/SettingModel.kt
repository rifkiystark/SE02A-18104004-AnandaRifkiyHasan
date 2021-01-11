package com.kiki_18104004.praktikum9.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SettingModel (
    var name: String? = null,
    var email: String? = null,
    var age: Int = 0,
    var weight: Int = 0,
    var height : Int = 0,
    var phoneNumber: String? = null,
    var isDarkTheme: Boolean = false
): Parcelable
