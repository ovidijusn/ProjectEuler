package lt.oworks.projecteuler.problems.pbs2;

import java.math.BigDecimal;
import lt.oworks.projecteuler.problems.Problem;

/**
 * Reciprocal cycles
 *
 * @see http://projecteuler.net/problem=26
 * @author Ovidijus
 */
public class Problem26 extends Problem {

    private static final int LIMIT = 1_000;

    @Override
    public String solve() {

        BigDecimal first = BigDecimal.ONE;
        BigDecimal second = BigDecimal.ONE;
        long n = 2;

        while (second.toString().length() < LIMIT) {
            final BigDecimal tmp = first;
            first = second;
            second = second.add(tmp);
            n++;
        }
        

        return Long.toString(n);
    }

}
