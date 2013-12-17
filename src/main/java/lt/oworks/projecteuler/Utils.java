package lt.oworks.projecteuler;

import java.util.ArrayList;
import java.util.List;

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

    public static List<Long> getPrimeFactors(final long pNum) {
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

    public static long max(final long pNum1, final long pNum2) {
        return pNum1 > pNum2 ? pNum1 : pNum2;
    }

    public static int max(final int pNum1, final int pNum2) {
        return pNum1 > pNum2 ? pNum1 : pNum2;
    }
}
