package lt.oworks.projecteuler.problems.pbs3;

import java.util.HashSet;
import java.util.Set;
import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Util;

/**
 * Pandigital products
 *
 * @see http://projecteuler.net/problem=32
 * @author Ovidijus
 */
public class Problem32 extends Problem {

    private static final int BASE = 9;
    private static final long LIMIT = 999_999_999;

    @Override
    public String solve() {
        final Set<Long> products = new HashSet<>();
        loop:
        for (long i = 1; i < LIMIT; i++) {
            for (long j = 1; j < LIMIT; j++) {
                final long product = i * j;
                final String tmp = Long.toString(product) + i + j;
                if (tmp.length() > BASE && j == 1) {
                    break loop;
                } else if (tmp.length() > BASE) {
                    break;
                }
                if (Util.isPandigital(Long.parseLong(tmp), BASE)) {
                    products.add(product);
                }
            }
        }
        long sum = 0;
        for (final long product : products) {
            sum += product;
        }
        return Long.toString(sum);
    }

}
