package lt.oworks.projecteuler.problems.pbs2;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Operation;
import lt.oworks.projecteuler.utils.Util;

/**
 * Number spiral diagonals
 *
 * @see http://projecteuler.net/problem=28
 * @author Ovidijus
 */
public class Problem28 extends Problem {

    private static final int LIMIT = 1001;

    @Override
    public String solve() {

        return Long.toString(Operation.addAll(diagonal1(LIMIT)) + Operation.addAll(diagonal2(LIMIT)) - 1);
    }

    private long[] diagonal1(final int pSize) {
        final long[] diag = new long[pSize];
        int num = 1;
        int inc = 2;
        for (int i = 0; i < pSize; i++) {
            diag[i] = num;
            num = num + inc;
            inc += 2;
        }
        return diag;
    }

    private long[] diagonal2(final int pSize) {
        final long[] diag = new long[pSize];
        int num = 1;
        int inc = 0;
        for (int i = 0; i < pSize; i++) {
            num = num + inc;
            diag[i] = num;
            if (i % 2 == 0) {
                inc += 4;
            }
        }
        return diag;
    }

    @Override
    public String getAnswer() {
        return "669171001";
    }
}
