package lt.oworks.projecteuler.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Ovidijus
 */
public class Division {

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

    public static int countDivisors(final long pNum) {
        final double tmp = Math.sqrt(pNum);
        final long limit = Math.round(tmp) + 1;
        final Set<Long> divs = new HashSet<>();
        for (long i = 1; i <= limit; i++) {
            if (pNum % i == 0) {
                divs.add(i);
                divs.add(pNum / i);
            }
        }
        return divs.size();
    }

    public static long[] findPrimeDivisors(final long pNum) {
        long div = 2;
        final List<Long> primes = new ArrayList<>();
        while (div <= pNum) {
            if (pNum % div == 0 && isPrime(div)) {
                primes.add(div);
            }
            div++;
        }
        final long[] rez = new long[primes.size()];
        for (int i = 0; i < rez.length; i++) {
            rez[i] = primes.get(i);
        }
        return rez;
    }

    public static int dbd(final int pNum1, final int pNum2) {
        int rezult = pNum1;
        if (pNum2 > 0) {
            rezult = dbd(pNum2, pNum1 % pNum2);
        }
        return rezult;
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

    public static boolean isAbundant(final long pNum) {
        final long[] divs = Division.findDivisors(pNum);
        return pNum < Operation.addAll(divs) - pNum;
    }

    private Division() {
    }

}
