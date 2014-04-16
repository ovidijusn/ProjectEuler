package lt.oworks.projecteuler.problems.pbs3;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Digits;

/**
 * Pandigital multiples
 *
 * @see http://projecteuler.net/problem=38
 * @author Ovidijus
 */
public class Problem38 extends Problem {

    private static final long LIMIT = 10_000;

    @Override
    public String solve() {
        long max = 0;

        for (long n = 1; n < LIMIT; n++) {
            final StringBuilder product = new StringBuilder();
            product.append(n);
            for (int i = 2;; i++) {
                product.append(i * n);
                final int len = product.length();
                if (len < 10) {
                    final long tmp = Long.parseLong(product.toString());
                    if (len == 9) {

                        if (Digits.isPandigital(tmp, 9)) {
                            max = Math.max(tmp, max);
                        } else {
                            break;
                        }
                    } else if (!Digits.isPandigital(tmp, len)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Long.toString(max);

    }

    @Override
    public String getAnswer() {
        return "932718654";
    }
}
