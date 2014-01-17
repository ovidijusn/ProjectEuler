package lt.oworks.projecteuler.problems.pbs4;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Util;

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
            if (Util.isPandigital(i, len) && Util.isPrime(i)) {
                rez = i;
                break;
            }
        }

        return Integer.toString(rez);

    }

    @Override
    public String getAnswer() {
        return "7652413";
    }
}
