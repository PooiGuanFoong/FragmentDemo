package com.example.fragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_about, container, false)

        var btnExit = view.findViewById<Button>(R.id.btnExit)

        btnExit.setOnClickListener(){
            activity?.finish()  // finish() - to exit the application
        }
        return view

    }

}