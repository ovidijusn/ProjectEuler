package lt.oworks.projecteuler.problems.pbs3;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Digits;
import lt.oworks.projecteuler.utils.Division;

/**
 * Truncatable primes
 *
 * @see http://projecteuler.net/problem=37
 * @author Ovidijus
 */
public class Problem37 extends Problem {

    private static final long LIMIT = 11;

    @Override
    public String solve() {
        long sum = 0;
        int count = 0;
        long num = 10;
        loop:
        while (count < LIMIT) {
            num++;
            if (Division.isPrime(num)) {
                long tmp = Digits.truncateNumber(num, true);
                while (tmp > 0) {
                    if (!Division.isPrime(tmp)) {
                        continue loop;
                    }
                    tmp = Digits.truncateNumber(tmp, true);
                }

                tmp = Digits.truncateNumber(num, false);
                while (tmp > 0) {
                    if (!Division.isPrime(tmp)) {
                        continue loop;
                    }
                    tmp = Digits.truncateNumber(tmp, false);
                }
                sum += num;
                count++;
            }
        }

        return Long.toString(sum);
    }

}
