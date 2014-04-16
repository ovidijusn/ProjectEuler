package lt.oworks.projecteuler.problems.pbs4;

import lt.oworks.projecteuler.problems.Problem;

/**
 * Sub-string divisibility
 *
 * @see http://projecteuler.net/problem=43
 * @author Ovidijus
 */
public class Problem43 extends Problem {

    @Override
    public String solve() {
        long sum = 0;
        for (long i = 1023456789L; i <= 9876543210L; i++) {
            if (isPandigital09(i)) {
                long tmp = (i % 1000_000_000L) / 1_000_000L;
                if (tmp % 2 != 0) {
                    continue;
                }
                tmp = (i % 100_000_000L) / 100_000L;
                if (tmp % 3 != 0) {
                    continue;
                }
                tmp = (i % 10_000_000L) / 10_000L;
                if (tmp % 5 != 0) {
                    continue;
                }
                tmp = (i % 1000_000L) / 1000L;
                if (tmp % 7 != 0) {
                    continue;
                }
                tmp = (i % 100_000L) / 100L;
                if (tmp % 11 != 0) {
                    continue;
                }
                tmp = (i % 10_000L) / 10L;
                if (tmp % 13 != 0) {
                    continue;
                }
                tmp = i % 1000L;
                if (tmp % 17 != 0) {
                    continue;
                }
                sum += i;
            }
        }

        return Long.toString(sum);
    }

    private static boolean isPandigital09(final long pNum) {
        boolean result = true;
        int count = 0;
        final boolean[] digits = new boolean[10];
        int mod = (int) (pNum % 10);
        long div = pNum / 10;
        while (count < 10) {
            if (digits[mod]) {
                result = false;
                break;
            } else {
                digits[mod] = true;
                mod = (int) (div % 10);
                div /= 10;
                count++;
            }
        }

        return result && count == 10;
    }
}
