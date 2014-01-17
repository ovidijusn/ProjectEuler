package lt.oworks.projecteuler.problems.pbs1;

import lt.oworks.projecteuler.problems.Problem;

/**
 * Longest Collatz sequence
 *
 * @see http://projecteuler.net/problem=14
 * @author Ovidijus
 */
public class Problem14 extends Problem {

    private static final int LIMIT = 1_000_000;

    @Override
    public String solve() {
        long max = 0;
        int result = 0;
        for (int i = 1; i < LIMIT; i++) {
            long len = countChainSize(i);
            if (len > max) {
                max = len;
                result = i;
            }
        }

        return Long.toString(result);
    }

    private long countChainSize(final long pNum) {
        long result = 1;

        long chain = pNum;
        while (chain > 1) {
            if (chain % 2 == 0) {
                chain = chain / 2;
            } else {
                chain = 3 * chain + 1;
            }
            result++;
        }

        return result;
    }

    @Override
    public String getAnswer() {
        return "837799";
    }
}
