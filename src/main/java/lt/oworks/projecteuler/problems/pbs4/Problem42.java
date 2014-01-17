package lt.oworks.projecteuler.problems.pbs4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Util;

/**
 * Coded triangle numbers
 *
 * @see http://projecteuler.net/problem=42
 * @author Ovidijus
 */
public class Problem42 extends Problem {

    private static final String FILE = "/words.txt";
    private static final List<Integer> triangleNumbers = new ArrayList<>();

    static {
        triangleNumbers.add(1);
    }

    @Override
    public String solve() {

        int count = 0;

        try (final BufferedReader br = new BufferedReader(new InputStreamReader(Problem42.class.getResourceAsStream(FILE)))) {
            final String line = br.readLine();
            final String[] words = line.split(",");
            for (final String word : words) {
                final char[] letters = word.toCharArray();
                int sum = 0;
                for (final char letter : letters) {
                    sum += Util.getLetterValue(letter);
                }
                if (isTriangleNumber(sum)) {
                    count++;
                }
            }
        } catch (IOException ex) {
        }

        return Integer.toString(count);

    }

    @Override
    public String getAnswer() {
        return "162";
    }

    private static int getTriangleNumber(final int pNum) {
        return (pNum * (pNum + 1)) / 2;
    }

    private static boolean isTriangleNumber(final int pNum) {
        boolean result = false;
        if (triangleNumbers.contains(pNum)) {
            result = true;
        } else {
            int size = triangleNumbers.size();
            int last = triangleNumbers.get(size - 1);

            if (last == pNum) {
                result = true;
            } else {
                size += 2;
                while (last < pNum) {
                    last = getTriangleNumber(size++);
                    triangleNumbers.add(last);
                    if (last == pNum) {
                        result = true;
                    }
                }
            }
        }
        return result;
    }
}
