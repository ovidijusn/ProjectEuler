package lt.oworks.projecteuler.nproblems.impl;

import lt.oworks.projecteuler.nproblems.Problem;

/**
 *
 * @author narkeovi
 */
public class Problem44 extends Problem {

    public Problem44() {
        super(44, "Pentagon numbers");
    }

    @Override
    public void run() {
        long result = 0;
        boolean notFound = true;
        int i = 1;

        while (notFound) {
            i++;
            long n = getPentagonalNumber(i);

            for (int j = i - 1; j > 0; j--) {
                long m = getPentagonalNumber(j);
                if (isPentagonNumber(n - m) && isPentagonNumber(n + m)) {
                    result = n - m;
                    notFound = false;
                    break;
                }
            }
        }
        setResult(result);
    }

    public static boolean isPentagonNumber(final long pNumber) {
        final double n = (Math.sqrt(24 * pNumber + 1) + 1) / 6;
        return n == Math.round(n);
    }

    public static long getPentagonalNumber(final long pNum) {
        return pNum * (3 * pNum - 1) / 2;
    }
}
