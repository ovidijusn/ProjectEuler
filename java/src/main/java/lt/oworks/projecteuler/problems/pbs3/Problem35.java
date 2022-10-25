package lt.oworks.projecteuler.problems.pbs3;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Digits;
import lt.oworks.projecteuler.utils.Division;

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
            if (Division.isPrime(i)) {
                long shifted = Digits.shiftDigits(i);
                boolean isCircular = true;
                while (shifted != i) {
                    if (!Division.isPrime(shifted)) {
                        isCircular = false;
                        break;
                    }
                    shifted = Digits.shiftDigits(shifted);
                }
                if (isCircular) {
                    count++;
                }

            }

        }

        return Long.toString(count);
    }

}
