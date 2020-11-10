package com.kiki_18104004.intent_fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_practice5_read_data.*


class Practice5ReadDataFragment : Fragment() {

    var nim: Int? = null
    companion object {
        var EXTRA_NAMA = ""
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_practice5_read_data, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (arguments != null) {
            val myName = arguments?.getString(EXTRA_NAMA)
            tvMyData.text = "Nama Saya : $myName, NIM Saya : $nim"
        }
        btnKembaliBeranda.setOnClickListener{
            val mIntent = Intent(activity, Practice5Activity::class.java)
            startActivity(mIntent)
        }

    }
}