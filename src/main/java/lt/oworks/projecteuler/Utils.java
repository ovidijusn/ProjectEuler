package lt.oworks.projecteuler;

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
public class Utils {

    private Utils() {
    }

    public static boolean isPrime(final long pNum) {
        final double tmp = Math.sqrt(pNum);
        final long limit = Math.round(tmp) + 1;

        boolean result = true;
        for (long i = 2; i < limit; i++) {
            if (pNum % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static List<Long> getPrimeDevisors(final long pNum) {
        final List<Long> result = new ArrayList<>();

        long tmp = pNum;
        long div = 2;
        while (tmp > 1) {
            if (tmp % div == 0) {
                result.add(div);
                tmp /= div;
            } else {
                do {
                    div++;
                } while (div <= pNum && !isPrime(div));
            }
        }

        return result;
    }

    public static Set<Long> getDevisors(final long pNum) {
        final Set<Long> result = new TreeSet<>();

        for (long i = 1; i <= pNum; i++) {
            if (pNum % i == 00) {
                result.add(i);
            }
        }

        return result;
    }

    public static int countDevisors(final long pNum) {
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

    public static long max(final long pNum1, final long pNum2) {
        return pNum1 > pNum2 ? pNum1 : pNum2;
    }

    public static int max(final int pNum1, final int pNum2) {
        return pNum1 > pNum2 ? pNum1 : pNum2;
    }

    public static long multiply(final long... pNums) {
        long product = 1;
        for (final long p : pNums) {
            product *= p;
        }
        return product;
    }

    public static int multiply(final int... pNums) {
        int product = 1;
        for (final int p : pNums) {
            product *= p;
        }
        return product;
    }

    public static long add(final long... pNums) {
        long sum = 0;
        for (final long p : pNums) {
            sum += p;
        }
        return sum;
    }

    public static int add(final int... pNums) {
        int sum = 0;
        for (final int p : pNums) {
            sum += p;
        }
        return sum;
    }

    public static long factorial(final long pNum) {
        long result = 1;
        for (long i = 1; i <= pNum; i++) {
            result *= i;
        }
        return result;
    }

    public static BigDecimal factorial(final BigDecimal pNum) {
        BigDecimal result = BigDecimal.ONE;
        for (long i = 1; i <= pNum.longValue(); i++) {
            result = result.multiply(new BigDecimal(i));
        }
        return result;
    }
}
