package lt.oworks.projecteuler.nproblems.impl;

import lt.oworks.projecteuler.nproblems.Problem;

/**
 *
 * @author narkeovi
 */
public class Problem45 extends Problem {

    public Problem45() {
        super(45, "Triangular, pentagonal, and hexagonal");
    }

    @Override
    public void run() {
        boolean notFound = true;
        int i = 285;
        while (notFound) {
            i++;
            final long t = getTriangularNumber(i);
            notFound = !(isHexagonalNumber(t) && Problem44.isPentagonNumber(t));
        }
        setResult(getTriangularNumber(i));
    }

    public static boolean isTriangularNumber(final long pNumber) {
        final double n = (Math.sqrt(8 * pNumber + 1) - 1) / 2;
        return n == Math.round(n);
    }

    public static boolean isHexagonalNumber(final long pNumber) {
        final double n = (Math.sqrt(8 * pNumber + 1) + 1) / 4;
        return n == Math.round(n);
    }

    public static long getTriangularNumber(final long pNum) {
        return pNum * (pNum + 1) / 2;
    }

    public static long getHexagonalNumber(final long pNum) {
        return pNum * (2 * pNum - 1);
    }

}
