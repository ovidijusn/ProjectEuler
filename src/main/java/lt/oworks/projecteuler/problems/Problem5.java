package lt.oworks.projecteuler.problems;

import java.util.List;
import lt.oworks.projecteuler.Utils;

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
                List<Long> factors = Utils.getPrimeDevisors(i);
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
