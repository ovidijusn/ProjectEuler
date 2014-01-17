package lt.oworks.projecteuler.utils;

import java.math.BigDecimal;

/**
 *
 * @author Ovidijus
 */
public class Operation {

    public static int max(final int pNum1, final int pNum2) {
        return pNum1 > pNum2 ? pNum1 : pNum2;
    }

    public static long max(final long pNum1, final long pNum2) {
        return pNum1 > pNum2 ? pNum1 : pNum2;
    }

    public static BigDecimal factorial(final BigDecimal pNum) {
        BigDecimal rez = BigDecimal.ONE;
        BigDecimal factor = BigDecimal.ONE;
        while (factor.compareTo(pNum) < 1) {
            rez = rez.multiply(factor);
            factor = factor.add(BigDecimal.ONE);
        }
        return rez;
    }

    public static long factorial(final long pNum) {
        long rez = 1;
        for (long factor = 1; factor <= pNum; factor++) {
            rez *= factor;
        }
        return rez;
    }

    public static long multiplyAll(final long... pFactors) {
        long product = 1;
        for (final long factor : pFactors) {
            product *= factor;
        }
        return product;
    }

    public static int multiplyAll(final int... pFactors) {
        int product = 1;
        for (final int factor : pFactors) {
            product *= factor;
        }
        return product;
    }

    public static long addAll(final long... pNums) {
        long sum = 0;
        for (final long num : pNums) {
            sum += num;
        }
        return sum;
    }

    private Operation() {
    }

}
