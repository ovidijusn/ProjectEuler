package lt.oworks.projecteuler.problems.pbs0;

import lt.oworks.projecteuler.problems.Problem;

/**
 * Sum square difference
 *
 * @see http://projecteuler.net/problem=6
 * @author Ovidijus
 */
public class Problem6 extends Problem {

    private static final int LIMIT = 100;

    @Override
    public String solve() {
        long sum1 = 0;
        long sum2 = 0;
        for (long i = 1; i <= LIMIT; i++) {
            sum1 += (i * i);
            sum2 += i;
        }
        sum2 *= sum2;
        return Long.toString(sum2 - sum1);
    }

}
