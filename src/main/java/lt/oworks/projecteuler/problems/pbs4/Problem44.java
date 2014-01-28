package lt.oworks.projecteuler.problems.pbs4;

import lt.oworks.projecteuler.problems.Problem;

/**
 * Pentagon numbers
 *
 * @see http://projecteuler.net/problem=44
 * @author Ovidijus
 */
public class Problem44 extends Problem {

    @Override
    public String solve() {
        long result = 0;
        boolean notFound = true;

        int i = 1;
        while (notFound) {
            i++;
            final long pi = getPentagon(i);

            for (int j = i - 1; j > 0; i--) {
                final long pj = getPentagon(j);
                if (isPentagon(pi - pj) && isPentagon(pi + pj)) {
                    result = pi - pj;
                    notFound = false;
                    break;
                }
            }
        }

        return Long.toString(result);
    }

    @Override
    public String getAnswer() {
        return "16695334890";
    }

    private static long getPentagon(final long pNum) {
        return pNum * (3 * pNum - 1) / 2;
    }

    private static boolean isPentagon(final long pNum) {
        final double d = (Math.sqrt(24 * pNum + 1) + 1) / 6;
        return d == Math.round(d);
    }
}
