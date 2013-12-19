package lt.oworks.projecteuler.problems;

import lt.oworks.projecteuler.Utils;

/**
 * Highly divisible triangular number
 *
 * @see http://projecteuler.net/problem=12
 * @author Ovidijus
 */
public class Problem12 extends Problem {

    private static final int LIMIT = 500;

    @Override
    public String solve() {

        long result = 1;
        long iter = 2;

        while (true) {
            if (Utils.countDevisors(result) > 500) {
                break;
            }
            result += iter++;
        }

        return Long.toString(result);
    }

}
