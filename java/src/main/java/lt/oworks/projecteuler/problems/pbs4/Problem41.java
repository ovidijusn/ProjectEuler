package lt.oworks.projecteuler.problems.pbs4;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Digits;
import lt.oworks.projecteuler.utils.Division;

/**
 * Pandigital prime
 *
 * @see http://projecteuler.net/problem=41
 * @author Ovidijus
 */
public class Problem41 extends Problem {

    private static final int LIMIT = 10000000;

    @Override
    public String solve() {

        int rez = 0;
        for (int i = LIMIT; i > 0; i--) {
            final int len = ("" + i).length();
            if (Digits.isPandigital(i, len) && Division.isPrime(i)) {
                rez = i;
                break;
            }
        }

        return Integer.toString(rez);

    }

}
