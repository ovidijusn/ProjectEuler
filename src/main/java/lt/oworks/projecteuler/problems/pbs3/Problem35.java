package lt.oworks.projecteuler.problems.pbs3;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Util;

/**
 * Circular primes
 *
 * @see http://projecteuler.net/problem=35
 * @author Ovidijus
 */
public class Problem35 extends Problem {

    private static final long LIMIT = 1_000_000;

    @Override
    public String solve() {
        long count = 0;

        for (int i = 2; i < LIMIT; i++) {
            if (Util.isPrime(i)) {
                long shifted = Util.shiftDigits(i);
                boolean isCircular = true;
                while (shifted != i) {
                    if (!Util.isPrime(shifted)) {
                        isCircular = false;
                        break;
                    }
                    shifted = Util.shiftDigits(shifted);
                }
                if (isCircular) {
                    count++;
                }

            }

        }

        return Long.toString(count);
    }

    @Override
    public String getAnswer() {
        return "55";
    }
}
