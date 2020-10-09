package com.dbsrm.formallanguageandautomataapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Grammar : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_grammar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val txt = activity!!.findViewById<TextView>(R.id.grammar)

        val str = "6.\tContext-Free Grammar (CFG)\n" +
                "CFG stands for context-free grammar. It is is a formal grammar which is used to generate all possible patterns of strings in a given formal language. Context-free grammar G can be defined by four tuples as:\n" +
                "1.\tG = (V, T, P, S)  \n" +
                "Where,\n" +
                "G is the grammar, which consists of a set of the production rule. It is used to generate the string of a language.\n" +
                "T is the final set of a terminal symbol. It is denoted by lower case letters.\n" +
                "V is the final set of a non-terminal symbol. It is denoted by capital letters.\n" +
                "P is a set of production rules, which is used for replacing non-terminals symbols(on the left side of the production) in a string with other terminal or non-terminal symbols(on the right side of the production).\n" +
                "S is the start symbol which is used to derive the string. We can derive the string by repeatedly replacing a non-terminal by the right-hand side of the production until all non-terminal have been replaced by terminal symbols.\n" +
                "Example 1:\n" +
                "Construct the CFG for the language having any number of a's over the set ∑= {a}.\n" +
                "Solution:\n" +
                "As we know the regular expression for the above language is\n" +
                "1.\tr.e. = a*     \n" +
                "Production rule for the Regular expression is as follows:\n" +
                "1.\tS → aS    rule 1  \n" +
                "2.\tS → ε     rule 2  \n" +
                "Now if we want to derive a string \"aaaaaa\", we can start with start symbols.\n" +
                "1.\t S  \n" +
                "2.\taS   \n" +
                "3.\taaS          rule 1  \n" +
                "4.\taaaS         rule 1  \n" +
                "5.\taaaaS        rule 1  \n" +
                "6.\taaaaaS       rule 1  \n" +
                "7.\taaaaaaS      rule 1  \n" +
                "8.\taaaaaaε      rule 2  \n" +
                "9.\taaaaaa  \n" +
                "The r.e. = a* can generate a set of string {ε, a, aa, aaa,.....}. We can have a null string because S is a start symbol and rule 2 gives S → ε.\n" +
                "Example 2:\n" +
                "Construct a CFG for the regular expression (0+1)*\n" +
                "Solution:\n" +
                "The CFG can be given by,\n" +
                "1.\tProduction rule (P):  \n" +
                "2.\tS → 0S | 1S  \n" +
                "3.\tS → ε  \n" +
                "The rules are in the combination of 0's and 1's with the start symbol. Since (0+1)* indicates {ε, 0, 1, 01, 10, 00, 11, ....}. In this set, ε is a string, so in the rule, we can set the rule S → ε.\n" +
                "7.\tPushdown Automata\n" +
                "Basic Structure of PDA\n" +
                "A pushdown automaton is a way to implement a context-free grammar in a similar way we design DFA for a regular grammar. A DFA can remember a finite amount of information, but a PDA can remember an infinite amount of information.\n" +
                "Basically a pushdown automaton is −\n" +
                "\"Finite state machine\" + \"a stack\"\n" +
                "A pushdown automaton has three components −\n" +
                "•\tan input tape,\n" +
                "•\ta control unit, and\n" +
                "•\ta stack with infinite size.\n" +
                "The stack head scans the top symbol of the stack.\n" +
                "A stack does two operations −\n" +
                "•\tPush − a new symbol is added at the top.\n" +
                "•\tPop − the top symbol is read and removed.\n" +
                "A PDA may or may not read an input symbol, but it has to read the top of the stack in every transition.\n" +
                " \n" +
                "A PDA can be formally described as a 7-tuple (Q, ∑, S, δ, q0, I, F) −\n" +
                "•\tQ is the finite number of states\n" +
                "•\t∑ is input alphabet\n" +
                "•\tS is stack symbols\n" +
                "•\tδ is the transition function: Q × (∑ ∪ {ε}) × S × Q × S*\n" +
                "•\tq0 is the initial state (q0 ∈ Q)\n" +
                "•\tI is the initial stack top symbol (I ∈ S)\n" +
                "•\tF is a set of accepting states (F ∈ Q)\n" +
                "The following diagram shows a transition in a PDA from a state q1 to state q2, labeled as a,b → c −\n" +
                " \n" +
                "This means at state q1, if we encounter an input string ‘a’ and top symbol of the stack is ‘b’, then we pop ‘b’, push ‘c’ on top of the stack and move to state q2.\n" +
                "Terminologies Related to PDA\n" +
                "Instantaneous Description\n" +
                "The instantaneous description (ID) of a PDA is represented by a triplet (q, w, s) where\n" +
                "•\tq is the state\n" +
                "•\tw is unconsumed input\n" +
                "•\ts is the stack contents\n" +
                "Turnstile Notation\n" +
                "The \"turnstile\" notation is used for connecting pairs of ID's that represent one or many moves of a PDA. The process of transition is denoted by the turnstile symbol \"⊢\".\n" +
                "Consider a PDA (Q, ∑, S, δ, q0, I, F). A transition can be mathematically represented by the following turnstile notation −\n" +
                "(p, aw, Tβ) ⊢ (q, w, αb)\n" +
                "This implies that while taking a transition from state p to state q, the input symbol ‘a’ is consumed, and the top of the stack ‘T’ is replaced by a new string ‘α’.\n" +
                "\n" +
                "\n" +
                "\n" +
                "8.\tConversion of NFA to DFA\n" +
                "Conversion from NFA to DFA\n" +
                "In this section, we will discuss the method of converting NFA to its equivalent DFA. In NFA, when a specific input is given to the current state, the machine goes to multiple states. It can have zero, one or more than one move on a given input symbol. On the other hand, in DFA, when a specific input is given to the current state, the machine goes to only one state. DFA has only one move on a given input symbol.\n" +
                "Let, M = (Q, ∑, δ, q0, F) is an NFA which accepts the language L(M). There should be equivalent DFA denoted by M' = (Q', ∑', q0', δ', F') such that L(M) = L(M').\n" +
                "Steps for converting NFA to DFA:\n" +
                "Step 1: Initially Q' = ϕ\n" +
                "Step 2: Add q0 of NFA to Q'. Then find the transitions from this start state.\n" +
                "Step 3: In Q', find the possible set of states for each input symbol. If this set of states is not in Q', then add it to Q'.\n" +
                "Step 4: In DFA, the final state will be all the states which contain F(final states of NFA)\n" +
                "Example 1:\n" +
                "Convert the given NFA to DFA.\n" +
                " \n" +
                "\n" +
                "Solution: For the given transition diagram we will first construct the transition table.\n" +
                "State\t0\t1\n" +
                "→q0\tq0\tq1\n" +
                "q1\t{q1, q2}\tq1\n" +
                "*q2\tq2\t{q1, q2}\n" +
                "Now we will obtain δ' transition for state q0.\n" +
                "1.\tδ'([q0], 0) = [q0]  \n" +
                "2.\tδ'([q0], 1) = [q1]  \n" +
                "The δ' transition for state q1 is obtained as:\n" +
                "1.\tδ'([q1], 0) = [q1, q2]       (new state generated)  \n" +
                "2.\tδ'([q1], 1) = [q1]  \n" +
                "The δ' transition for state q2 is obtained as:\n" +
                "1.\tδ'([q2], 0) = [q2]  \n" +
                "2.\tδ'([q2], 1) = [q1, q2]  \n" +
                "Now we will obtain δ' transition on [q1, q2].\n" +
                "1.\tδ'([q1, q2], 0) = δ(q1, 0) ∪ δ(q2, 0)  \n" +
                "2.\t                      = {q1, q2} ∪ {q2}  \n" +
                "3.\t                      = [q1, q2]  \n" +
                "4.\tδ'([q1, q2], 1) = δ(q1, 1) ∪ δ(q2, 1)  \n" +
                "5.\t                      = {q1} ∪ {q1, q2}  \n" +
                "6.\t                      = {q1, q2}  \n" +
                "7.\t                      = [q1, q2]  \n" +
                "The state [q1, q2] is the final state as well because it contains a final state q2. The transition table for the constructed DFA will be:\n" +
                "State\t0\t1\n" +
                "→[q0]\t[q0]\t[q1]\n" +
                "[q1]\t[q1, q2]\t[q1]\n" +
                "*[q2]\t[q2]\t[q1, q2]\n" +
                "*[q1, q2]\t[q1, q2]\t[q1, q2]\n" +
                "The Transition diagram will be:\n" +
                " \n" +
                "\n" +
                "The state q2 can be eliminated because q2 is an unreachable state.\n" +
                "\n"

        txt.text = str
    }

}