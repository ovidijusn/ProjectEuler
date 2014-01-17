package lt.oworks.projecteuler.problems.pbs2;

import java.math.BigDecimal;
import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Digits;
import lt.oworks.projecteuler.utils.Operation;
import lt.oworks.projecteuler.utils.Util;

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
        final BigDecimal factor = Operation.factorial(INPUT);

        return Digits.digitSum(factor).toString();
    }

    @Override
    public String getAnswer() {
        return "648";
    }
}
