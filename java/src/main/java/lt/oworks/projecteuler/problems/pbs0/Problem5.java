package lt.oworks.projecteuler.problems.pbs0;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Division;

/**
 * Smallest multiple
 *
 * @see http://projecteuler.net/problem=5
 *
 * @author Ovidijus
 */
public class Problem5 extends Problem {

    private static final int LIMIT = 20;

    @Override
    public String solve() {
        long product = 1;

        for (long i = 1; i <= LIMIT; i++) {
            if (product % i != 0L) {
                final long[] factors = Division.findPrimeDivisors(i);
                for (final long fact : factors) {
                    product *= fact;
                    if (product % i == 0L) {
                        break;
                    }
                }
            }
        }

        return Long.toString(product);
    }

}
