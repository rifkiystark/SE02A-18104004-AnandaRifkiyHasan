package com.kiki_18104004.intent_fragment

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class Practice5ForFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice5_for_fragment)

        val mFragmentManager = supportFragmentManager
        val mFirstFragment = Practice5FirstFragment()
        val fragment = mFragmentManager.findFragmentByTag(Practice5FirstFragment::class.java.simpleName)
        if (fragment !is Practice5FirstFragment) {
            Log.d("MyFlexibleFragment", "Fragment Name :" + Practice5FirstFragment::class.java.simpleName)
            mFragmentManager
                .beginTransaction()
                .add(R.id.frame_container, mFirstFragment, Practice5FirstFragment::class.java.simpleName)
                .commit()
        }
    }
}