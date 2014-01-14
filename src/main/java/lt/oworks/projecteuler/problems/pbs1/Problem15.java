package lt.oworks.projecteuler.problems.pbs1;

import lt.oworks.projecteuler.problems.Problem;
import java.math.BigDecimal;
import lt.oworks.projecteuler.utils.Util;

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
        return Util.factorial(new BigDecimal(a)).divide(Util.factorial(new BigDecimal(a - b)).multiply(Util.factorial(new BigDecimal(a - b))));
    }
}
