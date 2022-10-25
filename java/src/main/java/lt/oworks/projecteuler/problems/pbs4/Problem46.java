package lt.oworks.projecteuler.problems.pbs4;

import java.util.LinkedList;
import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Division;

/**
 * Goldbach's other conjecture
 *
 * @see http://projecteuler.net/problem=46
 * @author Ovidijus
 */
public class Problem46 extends Problem {

    private final LinkedList<Long> primes = new LinkedList<>();

    {
        primes.add(2L);
        primes.add(3L);
        primes.add(5L);
        primes.add(6L);
        primes.add(7L);
    }

    @Override
    public String solve() {
        long i = 3;
        boolean failed = false;

        long part;
        long part2 = 0;
        do {
            part = i - 2 * part2 * part2;

            if (isPrime(part)) {
                i += 2;
                part2 = 0;
            } else if (part < 2) {
                failed = true;
            } else {
                part2++;
            }

        } while (!failed);

        return "" + i;
    }

    private boolean isPrime(final Long pPrime) {
        if (primes.contains(pPrime)) {
            return true;
        } else if (Division.isPrime(pPrime)) {
            primes.add(pPrime);
            return true;
        }
        return false;
    }

}
