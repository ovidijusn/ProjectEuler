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
        int result = 0;
        boolean notFound = true;
        int i = 1;

        while (notFound) {
            i++;
            int n = i * (3 * i - 1) / 2;

            for (int j = i - 1; j > 0; j--) {
                int m = j * (3 * j - 1) / 2;
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

}
