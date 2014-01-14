package lt.oworks.projecteuler.problems.pbs2;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Util;

/**
 * Quadratic primes
 *
 * @see http://projecteuler.net/problem=27
 * @author Ovidijus
 */
public class Problem27 extends Problem {

    private static final int LIMIT = 1000;

    @Override
    public String solve() {
        int rez = 0;
        int len = 0;
        for (int a = -(LIMIT - 1); a < LIMIT; a++) {
            for (int b = -(LIMIT - 1); b < LIMIT; b++) {
                int n = 0;
                while (Util.isPrime(formula(a, b, n))) {
                    n++;
                }
                if (n > len) {
                    rez = a * b;
                    len = n;
                }
            }
        }
        return Integer.toString(rez);
    }

    private long formula(final int pA, final int pB, final int pN) {
        return pN * pN + pA * pN + pB;
    }

}
