package lt.oworks.projecteuler.problems.pbs3;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Util;

/**
 * Pandigital multiples
 *
 * @see http://projecteuler.net/problem=38
 * @author Ovidijus
 */
public class Problem38 extends Problem {

    private static final long LIMIT = 987_654_321;

    @Override
    public String solve() {
        long max = 0;

        for (long n = 1; n < LIMIT; n++) {
            final StringBuilder product = new StringBuilder();

            for (int i = 1;; i++) {
                product.append(i * n);
                final int len = product.length();
                if (len < 10) {
                    final long tmp = Long.parseLong(product.toString());
                    if (len == 9) {

                        if (Util.isPandigital(tmp, 9)) {
                            max = Util.max(tmp, max);
                        } else {
                            break;
                        }
                    } else if (!Util.isPandigital(tmp, len)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Long.toString(max);

    }

}
