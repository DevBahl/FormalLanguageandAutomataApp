package com.dbsrm.formallanguageandautomataapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class TypesAutomata : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_types_automata, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val txt = activity!!.findViewById<TextView>(R.id.types)

        val str = "2.\tDFA (Deterministic finite automata)\n" +
                "o\tDFA refers to deterministic finite automata. Deterministic refers to the uniqueness of the computation. The finite automata are called deterministic finite automata if the machine is read an input string one symbol at a time.\n" +
                "o\tIn DFA, there is only one path for specific input from the current state to the next state.\n" +
                "o\tDFA does not accept the null move, i.e., the DFA cannot change state without any input character.\n" +
                "o\tDFA can contain multiple final states. It is used in Lexical Analysis in Compiler.\n" +
                "In the following diagram, we can see that from state q0 for input a, there is only one path which is going to q1. Similarly, from q0, there is only one path for input b going to q2.\n" +
                " \n" +
                "\n" +
                "Formal Definition of DFA\n" +
                "A DFA is a collection of 5-tuples same as we described in the definition of FA.\n" +
                "1.\tQ: finite set of states  \n" +
                "2.\t∑: finite set of the input symbol  \n" +
                "3.\tq0: initial state   \n" +
                "4.\tF: final state  \n" +
                "5.\tδ: Transition function  \n" +
                "Transition function can be defined as:\n" +
                "1.\tδ: Q x ∑→Q  \n" +
                "Graphical Representation of DFA\n" +
                "A DFA can be represented by digraphs called state diagram. In which:\n" +
                "1.\tThe state is represented by vertices.\n" +
                "2.\tThe arc labeled with an input character show the transitions.\n" +
                "3.\tThe initial state is marked with an arrow.\n" +
                "4.\tThe final state is denoted by a double circle.\n" +
                "Example 1:\n" +
                "1.\tQ = {q0, q1, q2}  \n" +
                "2.\t∑ = {0, 1}  \n" +
                "3.\tq0 = {q0}  \n" +
                "4.\tF = {q2}  \n" +
                "Solution:\n" +
                "Transition Diagram:\n" +
                " \n" +
                "\n" +
                "Transition Table:\n" +
                "Present State\tNext state for Input 0\tNext State of Input 1\n" +
                "→q0\tq0\tq1\n" +
                "q1\tq2\tq1\n" +
                "*q2\tq2\tq2\n" +
                "\n" +
                "3.\tNDFA (Non-deterministic finite automata)\n" +
                "In NDFA, for a particular input symbol, the machine can move to any combination of the states in the machine. In other words, the exact state to which the machine moves cannot be determined. Hence, it is called Non-deterministic Automaton. As it has finite number of states, the machine is called Non-deterministic Finite Machine or Non-deterministic Finite Automaton.\n" +
                "Formal Definition of an NDFA\n" +
                "An NDFA can be represented by a 5-tuple (Q, ∑, δ, q0, F) where −\n" +
                "•\tQ is a finite set of states.\n" +
                "•\t∑ is a finite set of symbols called the alphabets.\n" +
                "•\tδ is the transition function where δ: Q × ∑ → 2Q\n" +
                "(Here the power set of Q (2Q) has been taken because in case of NDFA, from a state, transition can occur to any combination of Q states)\n" +
                "•\tq0 is the initial state from where any input is processed (q0 ∈ Q).\n" +
                "•\tF is a set of final state/states of Q (F ⊆ Q).\n" +
                "Graphical Representation of an NDFA: (same as DFA)\n" +
                "An NDFA is represented by digraphs called state diagram.\n" +
                "•\tThe vertices represent the states.\n" +
                "•\tThe arcs labeled with an input alphabet show the transitions.\n" +
                "•\tThe initial state is denoted by an empty single incoming arc.\n" +
                "•\tThe final state is indicated by double circles.\n" +
                "Example\n" +
                "Let a non-deterministic finite automaton be →\n" +
                "•\tQ = {a, b, c}\n" +
                "•\t∑ = {0, 1}\n" +
                "•\tq0 = {a}\n" +
                "•\tF = {c}\n" +
                "The transition function δ as shown below −\n" +
                "Present State\tNext State for Input 0\tNext State for Input 1\n" +
                "a\ta, b\tb\n" +
                "b\tc\ta, c\n" +
                "c\tb, c\tc\n" +
                "Its graphical representation would be as follows −\n" +
                " \n" +
                "\n"

        txt.text = str
    }

}