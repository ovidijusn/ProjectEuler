package lt.oworks.projecteuler.problems;

import java.util.List;
import lt.oworks.projecteuler.Utils;

/**
 * Sum square difference
 *
 * @see http://projecteuler.net/problem=6
 * @author Ovidijus
 */
public class Problem6 extends Problem {

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
