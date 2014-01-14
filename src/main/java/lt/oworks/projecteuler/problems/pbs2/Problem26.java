package lt.oworks.projecteuler.problems.pbs2;

import lt.oworks.projecteuler.problems.Problem;

/**
 * Reciprocal cycles
 *
 * @see http://projecteuler.net/problem=26
 * @author Ovidijus
 */
public class Problem26 extends Problem {

    private static final int LIMIT = 1000;

    @Override
    public String solve() {
        int max = 0;
        int rez = 0;

        for (int i = LIMIT - 1; i > 2; i--) {
            final int[] digits = getDecimalFractionDigits(i, 2 * i);
            final int len = getCycleLength(digits);
            if (len > max) {
                rez = i;
                max = len;
            }
        }

        return Integer.toString(rez);
    }

    private int[] getDecimalFractionDigits(final int pDivisor, final int pLimit) {
        int div = 10;
        int p = 0;
        final int[] digits = new int[pLimit];

        while (div != 0 && p < pLimit) {
            final int digit = div / pDivisor;
            digits[p++] = digit;
            if (digit > 0) {
                div %= pDivisor;
            }
            div *= 10;
        }
        return digits;
    }

    private int getCycleLength(final int[] pDigits) {
        int rez = 1;
        int distance = -1;
        for (int p = 0; p < pDigits.length - 1; p++) {
            int pos = p;
            for (int i = p + 1; i < pDigits.length; i++) {
                if (pDigits[pos] == pDigits[i]) {
                    if (distance < 0) {
                        distance = i - pos;
                    }
                    pos++;
                } else if (distance > 0) {
                    distance = -1;
                }
            }

            if (distance > 0 && distance == pDigits.length - pos) {
                rez = distance;
                break;
            } else {
                distance = -1;
            }
        }
        return rez;
    }

}
