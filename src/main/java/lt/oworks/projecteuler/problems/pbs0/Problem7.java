package lt.oworks.projecteuler.problems.pbs0;

import lt.oworks.projecteuler.Utils;
import lt.oworks.projecteuler.problems.Problem;

/**
 * 10001st prime
 *
 * @see http://projecteuler.net/problem=7
 * @author Ovidijus
 */
public class Problem7 extends Problem {

    private static final int LIMIT = 10_001;

    @Override
    public String solve() {
        long prime = 1;
        long counter = 0;

        while (counter < LIMIT) {
            prime++;
            if (Utils.isPrime(prime)) {
                counter++;
            }
        }

        return Long.toString(prime);
    }

}
