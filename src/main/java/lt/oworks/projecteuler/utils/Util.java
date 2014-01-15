package lt.oworks.projecteuler.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
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

    public static boolean isAbundant(final long pNum) {
        final long[] divs = findDivisors(pNum);

        return pNum < addAll(divs) - pNum;

    }

    public static boolean isPandigital(final long pNum, final int pBase) {
        boolean result = true;
        final boolean[] digits = new boolean[pBase];

        long tmp = pNum;
        if (Long.toString(pNum).length() == pBase) {
            while (tmp > 0) {
                final int left = (int) (tmp % 10);
                if (left > pBase || left == 0 || digits[left - 1]) {
                    result = false;
                    break;
                } else {
                    digits[left - 1] = true;
                    tmp /= 10;
                }
            }
        } else {
            result = false;
        }

        return result;
    }

    public static int max(final int pNum1, final int pNum2) {
        return pNum1 > pNum2 ? pNum1 : pNum2;
    }

    public static long max(final long pNum1, final long pNum2) {
        return pNum1 > pNum2 ? pNum1 : pNum2;
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

    public static long multiplyAll(final long... pFactors) {

        long product = 1;
        for (final long factor : pFactors) {
            product *= factor;
        }
        return product;
    }

    public static int multiplyAll(final int... pFactors) {

        int product = 1;
        for (final int factor : pFactors) {
            product *= factor;
        }
        return product;
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

    public static BigDecimal factorial(final BigDecimal pNum) {

        BigDecimal rez = BigDecimal.ONE;
        BigDecimal factor = BigDecimal.ONE;
        while (factor.compareTo(pNum) < 1) {
            rez = rez.multiply(factor);
            factor = factor.add(BigDecimal.ONE);
        }

        return rez;
    }

    public static BigDecimal digitSum(final BigDecimal pNum) {

        BigDecimal rez = BigDecimal.ZERO;
        final String num = pNum.toString();
        for (int i = 0; i < num.length(); i++) {
            rez = rez.add(new BigDecimal(Character.toString(num.charAt(i))));
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

    public static int[] toDigits(final long pNum1) {
        final int[] digits = new int[Long.toString(pNum1).length()];
        long tmp = pNum1;
        int i = 0;
        while (tmp > 0) {
            digits[i++] = (int) (tmp % 10);
            tmp /= 10;
        }
        return digits;
    }

    private Util() {
    }

}
