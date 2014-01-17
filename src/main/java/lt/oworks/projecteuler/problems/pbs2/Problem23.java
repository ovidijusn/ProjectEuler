package lt.oworks.projecteuler.problems.pbs2;

import java.util.LinkedList;
import java.util.List;
import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Util;

/**
 * Non-abundant sums
 *
 * @see http://projecteuler.net/problem=23
 * @author Ovidijus
 */
public class Problem23 extends Problem {

    private static final long LIMIT = 28123;

    @Override
    public String solve() {
        final List<Long> tmp = new LinkedList<>();
        for (long i = 12; i <= LIMIT; i++) {
            if (Util.isAbundant(i)) {
                tmp.add(i);
            }
        }
        final long[] abundants = new long[tmp.size()];
        for (int i = 0; i < abundants.length; i++) {
            abundants[i] = tmp.get(i);
        }

        long sum = 0;
        for (long i = 1; i <= LIMIT; i++) {
            if (!isSumOf2Abundants(i, abundants)) {
                sum += i;
            }

        }

        return Long.toString(sum);
    }

    private boolean isSumOf2Abundants(final long pNum, final long[] abundants) {
        final int size = abundants.length;
        boolean result = false;

        main:
        for (int i = 0; i < size; i++) {
            if (abundants[i] >= pNum) {
                break;
            }
            for (int j = 0; j < size; j++) {
                if (abundants[j] >= pNum) {
                    break;
                }
                if (abundants[i] + abundants[j] == pNum) {
                    result = true;
                    break main;
                } else if (abundants[i] + abundants[j] > pNum) {
                    break;
                }
            }
        }

        return result;
    }

    @Override
    public String getAnswer() {
        return "4179871";
    }
}
