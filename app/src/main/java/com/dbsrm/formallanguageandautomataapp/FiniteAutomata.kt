package com.dbsrm.formallanguageandautomataapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FiniteAutomata : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_finite_automata, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val txt = activity!!.findViewById<TextView>(R.id.finiteautomatatext)

        val str = "Formal definition of a Finite Automaton An automaton can be represented by a 5-tuple (Q, ∑, δ, q0, F), where −\n" +
                "•\tQ is a finite set of states.\n" +
                "•\t∑ is a finite set of symbols, called the alphabet of the automaton.\n" +
                "•\tδ is the transition function.\n" +
                "•\tq0 is the initial state from where any input is processed (q0 ∈ Q).\n" +
                "•\tF is a set of final state/states of Q (F ⊆ Q).\n"

        txt.text = str
    }
}