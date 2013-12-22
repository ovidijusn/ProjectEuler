package lt.oworks.projecteuler.utils;

import java.math.BigDecimal;

/**
 *
 * @author Ovidijus
 */
public class Util {

    public static boolean isPrime(final BigDecimal pNum) {
        boolean result = pNum.compareTo(BigDecimal.ONE) == 1;

        return result;
    }

    private Util() {
    }

}
