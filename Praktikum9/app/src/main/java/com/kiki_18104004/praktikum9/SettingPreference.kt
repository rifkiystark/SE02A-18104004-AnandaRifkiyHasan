package com.kiki_18104004.praktikum9

import android.content.Context
import com.kiki_18104004.praktikum9.models.SettingModel

internal class SettingPreference(context: Context) {
    companion object {
        private const val PREFS_NAME = "setting_pref"
        private const val NAME = "name"
        private const val EMAIL = "email"
        private const val AGE = "age"
        private const val WEIGHT = "weight"
        private const val HEIGHT = "height"
        private const val PHONE_NUMBER = "phone"
        private const val THEME = "theme"
    }
    private val preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    fun setSetting(value: SettingModel) {
        val editor = preferences.edit()
        editor.putString(NAME, value.name)
        editor.putString(EMAIL, value.email)
        editor.putInt(AGE, value.age)
        editor.putInt(WEIGHT, value.weight)
        editor.putInt(HEIGHT, value.height)
        editor.putString(PHONE_NUMBER, value.phoneNumber)
        editor.putBoolean(THEME, value.isDarkTheme)
        editor.apply()
    }

    fun getSetting(): SettingModel {
        val model = SettingModel()
        model.name = preferences.getString(NAME, "")
        model.email = preferences.getString(EMAIL, "")
        model.age = preferences.getInt(AGE, 0)
        model.weight = preferences.getInt(WEIGHT, 0)
        model.height = preferences.getInt(HEIGHT, 0)
        model.phoneNumber = preferences.getString(PHONE_NUMBER, "")
        model.isDarkTheme = preferences.getBoolean(THEME, false)
        return model
    }
}