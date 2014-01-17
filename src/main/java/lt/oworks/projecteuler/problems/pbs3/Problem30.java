package lt.oworks.projecteuler.problems.pbs3;

import lt.oworks.projecteuler.problems.Problem;

/**
 * Digit fifth powers
 *
 * @see http://projecteuler.net/problem=30
 * @author Ovidijus
 */
public class Problem30 extends Problem {

    private static final int LIMIT = 9 * 9 * 9 * 9 * 9 * 6;

    @Override
    public String solve() {
        long sum = 0;
        for (int i = 32; i < LIMIT; i++) {
            if (digitsSum(i, 5) == i) {
                sum += i;
            }
        }
        return Long.toString(sum);
    }

    private long digitsSum(final long pNum, final int pPower) {
        long sum = 0;
        long tmp = pNum;
        while (tmp > 0) {
            sum += pow(tmp % 10, pPower);
            tmp /= 10;
        }
        return sum;
    }

    private long pow(final long pNum, final int pPower) {
        long rezult = 1;
        for (int i = 1; i <= pPower; i++) {
            rezult *= pNum;
        }
        return rezult;
    }

    @Override
    public String getAnswer() {
        return "443839";
    }
}
