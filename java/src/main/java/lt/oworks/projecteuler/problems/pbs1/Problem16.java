package lt.oworks.projecteuler.problems.pbs1;

import lt.oworks.projecteuler.problems.Problem;
import java.math.BigDecimal;
import lt.oworks.projecteuler.utils.Digits;

/**
 * Power digit sum
 *
 * @see http://projecteuler.net/problem=16
 * @author Ovidijus
 */
public class Problem16 extends Problem {

    private static final int POWER = 1000;

    @Override
    public String solve() {
        final BigDecimal power = new BigDecimal(2).pow(POWER);
        return Digits.digitSum(power).toString();
    }

}
