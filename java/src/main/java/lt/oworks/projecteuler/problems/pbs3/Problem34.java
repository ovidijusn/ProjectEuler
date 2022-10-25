package lt.oworks.projecteuler.problems.pbs3;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Digits;
import lt.oworks.projecteuler.utils.Operation;

/**
 * Digit factorials
 *
 * @see http://projecteuler.net/problem=34
 * @author Ovidijus
 */
public class Problem34 extends Problem {

    private static final long LIMIT = Operation.factorial(9) * 7;

    @Override
    public String solve() {
        long sum = 0;

        final long[] facts = new long[10];
        for (int i = 0; i < facts.length; i++) {
            facts[i] = Operation.factorial(i);
        }

        loop:
        for (long i = 3; i <= LIMIT; i++) {
            final int[] digits = Digits.toDigits(i);
            long s = 0;
            for (int digit : digits) {
                s += facts[digit];
                if (s > i) {
                    continue loop;
                }
            }
            if (s == i) {
                sum += s;
            }

        }

        return Long.toString(sum);
    }

}
