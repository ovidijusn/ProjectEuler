package lt.oworks.projecteuler.problems.pbs1;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Division;

/**
 * Summation of primes
 *
 * @see http://projecteuler.net/problem=10
 * @author Ovidijus
 */
public class Problem10 extends Problem {

    private static final int LIMIT = 2_000_000;

    @Override
    public String solve() {

        long sum = 2;

        for (long i = 3; i < LIMIT - 1; i += 2) {
            if (Division.isPrime(i)) {
                sum += i;
            }
        }

        return Long.toString(sum);
    }

}
