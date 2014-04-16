package lt.oworks.projecteuler.problems.pbs2;

import java.util.ArrayList;
import java.util.List;
import lt.oworks.projecteuler.problems.Problem;

/**
 * Lexicographic permutations
 *
 * @see http://projecteuler.net/problem=24
 * @author Ovidijus
 */
public class Problem24 extends Problem {

    private static final int LIMIT = 1_000_000;
    private static final long ALPHABET_SIZE = 10;
    private final List<String> permutations = new ArrayList<>();
    private int size = 0;

    @Override
    public String solve() {
        final List<String> alphabet = new ArrayList<>();
        alphabet.add("0");
        alphabet.add("1");
        alphabet.add("2");

        alphabet.add("3");
        alphabet.add("4");
        alphabet.add("5");

        alphabet.add("6");
        alphabet.add("7");
        alphabet.add("8");
        alphabet.add("9");
        generate("", alphabet);

        return permutations.get(LIMIT - 1);
    }

    private void generate(final String pPermutations, final List<String> pAlphabet) {
        if (pPermutations.length() == ALPHABET_SIZE) {
            permutations.add(pPermutations);
            size++;
        } else if (size < LIMIT) {
            for (final String letter : pAlphabet) {

                final List<String> tmp = new ArrayList<>(pAlphabet);
                tmp.remove(letter);
                generate(pPermutations + letter, tmp);
            }
        }
    }

}
