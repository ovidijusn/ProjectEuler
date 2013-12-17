package lt.oworks.projecteuler.problems;

/**
 * Largest prime factor
 *
 * @see http://projecteuler.net/problem=3
 *
 * @author Ovidijus
 */
public class Problem3 extends Problem {

    private static final long INPUT = 600851475143L;

    @Override
    public String solve() {
        Long result = 0L;
        final double sqrt = Math.sqrt(INPUT);
        final long inp = Math.round(sqrt);

        for (long l = inp; l > 2; l--) {
            if (INPUT % l == 0 && isPrime(l)) {
                result = l;
                break;
            }
        }
        return result.toString();
    }

    private boolean isPrime(final long pNumber) {
        boolean result = true;
        for (long l = 2; l < pNumber; l++) {
            if (pNumber % l == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

}
