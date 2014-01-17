package lt.oworks.projecteuler.problems.pbs0;

import lt.oworks.projecteuler.problems.Problem;

/**
 * Special Pythagorean triplet
 *
 * @see http://projecteuler.net/problem=9
 * @author Ovidijus
 */
public class Problem9 extends Problem {

    private static final int SUM = 1000;

    @Override
    public String solve() {

        int result = 0;

        for (int i = 1; i < SUM - 1; i++) {
            for (int j = i + 1; j < SUM; j++) {
                final int k = SUM - i - j;
                if (i * i + j * j == k * k) {
                    result = i * j * k;
                    break;
                }
            }
        }

        return Integer.toString(result);
    }

    @Override
    public String getAnswer() {
        return "31875000";
    }
}
