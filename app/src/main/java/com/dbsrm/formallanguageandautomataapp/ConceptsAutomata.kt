package com.dbsrm.formallanguageandautomataapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ConceptsAutomata : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_concepts_automata, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val txt = activity!!.findViewById<TextView>(R.id.concepts)

        val str = "4.\tGNF\n" +
                "Greibach Normal Form (GNF) A CFG G = (V, T, R, S) is said to be in GNF if every production is of the form A → aα, where a ∈ T and α ∈ V ∗ , i.e., α is a string of zero or more variables. \n" +
                "Definition: A production U ∈ R is said to be in the form left recursion, if U : \n" +
                "A → Aα for some A ∈ V . Left recursion in R can be eliminated by the following scheme: \n" +
                "• If A → Aα1|Aα2| . . . |Aαr|β1|β2| . . . |βs, then replace the above rules by \n" +
                "(i)\tZ → αi |αiZ, 1 ≤ i ≤ r and \n" +
                "(ii)\t(ii) A → βi |βiZ, 1 ≤ i ≤ s • If G = (V, T, R, S) is a CFG, then we can construct another CFG G1 = (V1, T, R1, S) in Greibach Normal Form (GNF) such that L(G1) = L(G) − {epsilon}. \n" +
                "The stepwise algorithm is as follows: \n" +
                "1. Eliminate null productions, unit productions and useless symbols from the grammar G and then construct a G0 = (V 0 , T, R0 , S) in Chomsky Normal Form (CNF) generating the language L(G0 ) = L(G) − {}. \n" +
                "2. Rename the variables like A1, A2, . . . An starting with S = A1. \n" +
                "3. Modify the rules in R0 so that if Ai → Ajγ ∈ R0 then j > i \n" +
                "4. Starting with A1 and proceeding to An this is done as follows: \n" +
                "(a) Assume that productions have been modified so that for 1 ≤ i ≤ k, Ai → Ajγ ∈ R0 only if j > i \n" +
                "(b) If Ak → Ajγ is a production with j < k, generate a new set of productions substituting for the Aj the body of each Aj production. \n" +
                "(c) Repeating (b) at most k − 1 times we obtain rules of the form Ak → Apγ, p ≥ k \n" +
                "(d) Replace rules Ak → Akγ by removing left-recursion as stated above. \n" +
                "5. Modify the Ai → Ajγ for i = n−1, n−2, ., 1 in desired form at the same time change the Z production rules.\n" +
                "Example:-\n" +
                " \n" +
                " \n" +
                "\n" +
                "5.\tChomsky's Normal Form (CNF)\n" +
                "CNF stands for Chomsky normal form. A CFG(context free grammar) is in CNF(Chomsky normal form) if all production rules satisfy one of the following conditions:\n" +
                "o\tStart symbol generating ε. For example, A → ε.\n" +
                "o\tA non-terminal generating two non-terminals. For example, S → AB.\n" +
                "o\tA non-terminal generating a terminal. For example, S → a.\n" +
                "For example:\n" +
                "1.\tG1 = {S → AB, S → c, A → a, B → b}  \n" +
                "2.\tG2 = {S → aA, A → a, B → c}  \n" +
                "The production rules of Grammar G1 satisfy the rules specified for CNF, so the grammar G1 is in CNF. However, the production rule of Grammar G2 does not satisfy the rules specified for CNF as S → aZ contains terminal followed by non-terminal. So the grammar G2 is not in CNF.\n" +
                "Steps for converting CFG into CNF\n" +
                "Step 1: Eliminate start symbol from the RHS. If the start symbol T is at the right-hand side of any production, create a new production as:\n" +
                "1.\tS1 → S  \n" +
                "Where S1 is the new start symbol.\n" +
                "Step 2: In the grammar, remove the null, unit and useless productions. You can refer to the Simplification of CFG.\n" +
                "Step 3: Eliminate terminals from the RHS of the production if they exist with other non-terminals or terminals. For example, production S → aA can be decomposed as:\n" +
                "1.\tS → RA  \n" +
                "2.\tR → a  \n" +
                "Step 4: Eliminate RHS with more than two non-terminals. For example, S → ASB can be decomposed as:\n" +
                "1.\tS → RS  \n" +
                "2.\tR → AS  \n" +
                "Example:\n" +
                "Convert the given CFG to CNF. Consider the given grammar G1:\n" +
                "1.\tS → a | aA | B  \n" +
                "2.\tA → aBB | ε  \n" +
                "3.\tB → Aa | b  \n" +
                "Solution:\n" +
                "Step 1: We will create a new production S1 → S, as the start symbol S appears on the RHS. The grammar will be:\n" +
                "1.\t S1 → S  \n" +
                "2.\tS → a | aA | B  \n" +
                "3.\tA → aBB | ε  \n" +
                "4.\tB → Aa | b  \n" +
                "Step 2: As grammar G1 contains A → ε null production, its removal from the grammar yields:\n" +
                "1.\tS1 → S  \n" +
                "2.\tS → a | aA | B  \n" +
                "3.\tA → aBB  \n" +
                "4.\tB → Aa | b | a  \n" +
                "Now, as grammar G1 contains Unit production S → B, its removal yield:\n" +
                "1.\tS1 → S  \n" +
                "2.\tS → a | aA | Aa | b  \n" +
                "3.\tA → aBB  \n" +
                "4.\tB → Aa | b | a  \n" +
                "Also remove the unit production S1 → S, its removal from the grammar yields:\n" +
                "1.\tS0 → a | aA | Aa | b  \n" +
                "2.\tS → a | aA | Aa | b  \n" +
                "3.\tA → aBB  \n" +
                "4.\tB → Aa | b | a  \n" +
                "Step 3: In the production rule S0 → aA | Aa, S → aA | Aa, A → aBB and B → Aa, terminal a exists on RHS with non-terminals. So we will replace terminal a with X:\n" +
                "1.\tS0 → a | XA | AX | b  \n" +
                "2.\tS → a | XA | AX | b  \n" +
                "3.\tA → XBB  \n" +
                "4.\tB → AX | b | a  \n" +
                "5.\tX → a  \n" +
                "Step 4: In the production rule A → XBB, RHS has more than two symbols, removing it from grammar yield:\n" +
                "1.\tS0 → a | XA | AX | b  \n" +
                "2.\tS → a | XA | AX | b  \n" +
                "3.\tA → RB  \n" +
                "4.\tB → AX | b | a  \n" +
                "5.\tX → a  \n" +
                "6.\tR → XB  \n" +
                "Hence, for the given grammar, this is the required CNF.\n"

        txt.text = str
    }

}