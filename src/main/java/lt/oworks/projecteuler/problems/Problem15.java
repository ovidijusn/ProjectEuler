package lt.oworks.projecteuler.problems;

import java.math.BigDecimal;
import lt.oworks.projecteuler.Utils;

/**
 * Lattice paths
 *
 * @see http://projecteuler.net/problem=15
 * @author Ovidijus
 */
public class Problem15 extends Problem {

    private static final int SIZE = 20;

    @Override
    public String solve() {
        return binomial(SIZE * 2, SIZE).toString();
    }

    private static BigDecimal binomial(final long a, final long b) {
        return Utils.factorial(new BigDecimal(a)).divide(Utils.factorial(new BigDecimal(a - b)).multiply(Utils.factorial(new BigDecimal(a - b))));
    }
}
