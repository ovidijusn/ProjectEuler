package lt.oworks.projecteuler.problems;

import java.util.List;
import lt.oworks.projecteuler.Utils;

/**
 * Smallest multiple
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
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
                List<Long> factors = Utils.getPrimeFactors(i);
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
