package lt.oworks.projecteuler.utils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Ovidijus
 */
public class Util {

    public static boolean isPrime(final long pNum) {
        boolean result = pNum > 1;

        final double root = Math.sqrt(pNum);
        final long limit = Math.round(root) + 1;

        for (long i = 2; i < limit; i++) {
            if (pNum % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static long[] findDivisors(final long pNum) {

        final double root = Math.sqrt(pNum);
        final long limit = Math.round(root) + 1;

        final Set<Long> list = new TreeSet<>();
        for (long i = 1; i < limit; i++) {
            if (pNum % i == 0) {
                list.add(i);
                list.add(pNum / i);
            }
        }
        final long[] result = new long[list.size()];
        int i = 0;
        for (final long div : list) {
            result[i++] = div;
        }
        return result;
    }

    public static long addAll(final long... pNums) {
        long sum = 0;
        for (final long num : pNums) {
            sum += num;
        }
        return sum;
    }

    private Util() {
    }

}
