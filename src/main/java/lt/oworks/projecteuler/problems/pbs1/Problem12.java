package lt.oworks.projecteuler.problems.pbs1;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Util;

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
            if (Util.countDivisors(result) > 500) {
                break;
            }
            result += iter++;
        }

        return Long.toString(result);
    }

}
