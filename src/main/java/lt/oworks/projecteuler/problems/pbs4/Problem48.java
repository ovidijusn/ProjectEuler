package lt.oworks.projecteuler.problems.pbs4;

import java.math.BigDecimal;
import lt.oworks.projecteuler.problems.Problem;

/**
 * Self powers
 *
 * @see http://projecteuler.net/problem=48
 * @author Ovidijus
 */
public class Problem48 extends Problem {

    @Override
    public String solve() {
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 1; i < 1001; i++) {
            sum = sum.add(new BigDecimal(i).pow(i));
        }

        return sum.remainder(new BigDecimal(10_000_000_000L)).toString();
    }

}
