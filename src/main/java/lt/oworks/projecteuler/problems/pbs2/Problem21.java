package lt.oworks.projecteuler.problems.pbs2;

import java.math.BigDecimal;
import lt.oworks.projecteuler.utils.Utils;
import lt.oworks.projecteuler.problems.Problem;

/**
 * Amicable numbers
 *
 * @see http://projecteuler.net/problem=21
 * @author Ovidijus
 */
public class Problem21 extends Problem {

    private static final BigDecimal INPUT = new BigDecimal(100);

    @Override
    public String solve() {
        final BigDecimal factor = Utils.factorial(INPUT);

        return Utils.digitSum(factor).toString();
    }

}
