package lt.oworks.projecteuler.problems.pbs3;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Util;

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
            if (Util.isPrime(num)) {
                long tmp = Util.truncateNumber(num, true);
                while (tmp > 0) {
                    if (!Util.isPrime(tmp)) {
                        continue loop;
                    }
                    tmp = Util.truncateNumber(tmp, true);
                }

                tmp = Util.truncateNumber(num, false);
                while (tmp > 0) {
                    if (!Util.isPrime(tmp)) {
                        continue loop;
                    }
                    tmp = Util.truncateNumber(tmp, false);
                }
                sum += num;
                count++;
            }
        }

        return Long.toString(sum);
    }

    @Override
    public String getAnswer() {
        return "748317";
    }
}
