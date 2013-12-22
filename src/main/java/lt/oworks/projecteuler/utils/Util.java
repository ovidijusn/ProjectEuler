package lt.oworks.projecteuler.utils;

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

    private Util() {
    }

}
