package com.dbsrm.formallanguageandautomataapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class home : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn1 = activity!!.findViewById<Button>(R.id.button3)
        val btn2 = activity!!.findViewById<Button>(R.id.button4)
        val btn3 = activity!!.findViewById<Button>(R.id.button)
        val btn4 = activity!!.findViewById<Button>(R.id.button2)

        btn1.setOnClickListener {
            fragmentManager!!.beginTransaction().replace(R.id.container,FiniteAutomata()).addToBackStack(null).commit()
        }

        btn2.setOnClickListener {
            fragmentManager!!.beginTransaction().replace(R.id.container,TypesAutomata()).addToBackStack(null).commit()
        }

        btn3.setOnClickListener {
            fragmentManager!!.beginTransaction().replace(R.id.container,ConceptsAutomata()).addToBackStack(null).commit()
        }

        btn4.setOnClickListener {
            fragmentManager!!.beginTransaction().replace(R.id.container,Grammar()).addToBackStack(null).commit()
        }

    }
}