package lt.oworks.projecteuler.problems.pbs3;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Digits;
import lt.oworks.projecteuler.utils.Division;
import lt.oworks.projecteuler.utils.Util;

/**
 * Digit canceling fractions
 *
 * @see http://projecteuler.net/problem=33
 * @author Ovidijus
 */
public class Problem33 extends Problem {

    private static final int START = 10;
    private static final long LIMIT = 100;

    @Override
    public String solve() {
        int product1 = 1;
        int product2 = 1;
        for (int i = START; i < LIMIT; i++) {
            for (int j = START; j < LIMIT; j++) {
                if (i >= j) {
                    continue;
                }
                final int[] digits = Digits.toDigits(i);
                for (final int digit : digits) {
                    if (hasDigit(j, digit)) {
                        if (digit == 0) {
                            continue;
                        }
                        final int a = removeDigit(i, digit);
                        final int b = removeDigit(j, digit);

                        if (a * j == b * i) {
                            product1 *= i;
                            product2 *= j;
                        }
                    }
                }
            }
        }
        return Integer.toString(product2 / (Division.dbd(product1, product2)));
    }

    private boolean hasDigit(final int pNum, final int pDigit) {
        return (pNum % 10 == pDigit) || (pNum / 10 == pDigit);
    }

    private int removeDigit(final int pNum, final int pDigit) {
        return (pNum % 10 == pDigit) ? pNum / 10 : pNum % 10;
    }

    @Override
    public String getAnswer() {
        return "100";
    }
}
