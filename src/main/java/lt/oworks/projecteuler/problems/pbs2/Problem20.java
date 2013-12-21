package lt.oworks.projecteuler.problems.pbs2;

import java.math.BigDecimal;
import lt.oworks.projecteuler.Utils;
import lt.oworks.projecteuler.problems.Problem;

/**
 * Factorial digit sum
 *
 * @see http://projecteuler.net/problem=20
 * @author Ovidijus
 */
public class Problem20 extends Problem {

    private static final BigDecimal INPUT = new BigDecimal(100);

    @Override
    public String solve() {
        final BigDecimal factor = Utils.factorial(INPUT);

        return Utils.digitSum(factor).toString();
    }

}
