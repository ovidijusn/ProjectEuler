package lt.oworks.projecteuler.problems.pbs1;

import lt.oworks.projecteuler.problems.Problem;
import java.math.BigDecimal;

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
        final String digits = new BigDecimal(2).pow(POWER).toString();
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < digits.length(); i++) {
            sum = sum.add(new BigDecimal(Character.toString(digits.charAt(i))));
        }

        return sum.toString();
    }
}
