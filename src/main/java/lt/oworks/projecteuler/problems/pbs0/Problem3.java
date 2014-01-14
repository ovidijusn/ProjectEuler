package lt.oworks.projecteuler.problems.pbs0;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Util;

/**
 * Largest prime factor
 *
 * @see http://projecteuler.net/problem=3
 *
 * @author Ovidijus
 */
public class Problem3 extends Problem {

    private static final long INPUT = 600851475143L;

    @Override
    public String solve() {
        Long result = 0L;
        final double sqrt = Math.sqrt(INPUT);
        final long inp = Math.round(sqrt);

        for (long l = inp; l > 2; l--) {
            if (INPUT % l == 0 && Util.isPrime(l)) {
                result = l;
                break;
            }
        }
        return result.toString();
    }
}
