package lt.oworks.projecteuler.problems.pbs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import lt.oworks.projecteuler.problems.Problem;

/**
 * Names scores
 *
 * @see http://projecteuler.net/problem=22
 * @author Ovidijus
 */
public class Problem22 extends Problem {

    private static final String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String INPUT = "/names.txt";

    @Override
    public String solve() {
        long sum = 0;
        try (final BufferedReader br = new BufferedReader(new InputStreamReader(Problem22.class.getResourceAsStream(INPUT)))) {
            final String[] names = br.readLine().split(",");

            for (int i = 0; i < names.length; i++) {
                names[i] = names[i].trim().replaceAll("\"", "");
            }

            Arrays.sort(names);

            for (int i = 0; i < names.length; i++) {
                final long score = (i + 1) * getWordScore(names[i]);
                sum += score;
            }
        } catch (final IOException ex) {
        }

        return Long.toString(sum);
    }

    private long getLetterNum(final char pLetter) {
        return ABC.indexOf(Character.toString(pLetter)) + 1;
    }

    private long getWordScore(final String pWord) {
        long score = 0;
        final char[] letters = pWord.toCharArray();
        for (final char letter : letters) {
            score += getLetterNum(letter);
        }
        return score;
    }

    @Override
    public String getAnswer() {
        return "871198282";
    }
}
