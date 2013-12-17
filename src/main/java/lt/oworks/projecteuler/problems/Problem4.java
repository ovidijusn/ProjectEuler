package lt.oworks.projecteuler.problems;

import lt.oworks.projecteuler.Utils;

/**
 * Largest palindrome product
 *
 * @see http://projecteuler.net/problem=4
 *
 * @author Ovidijus
 */
public class Problem4 extends Problem {

    @Override
    public String solve() {
        int max = 0;

        for (int i = 100; i < 1000; i++) {
            for (int k = 100; k < 1000; k++) {
                final int product = i * k;
                if (isPalindrome(product)) {
                    max = Utils.max(product, max);
                }
            }
        }

        return Integer.toString(max);
    }

    private int reverse(final int pNumber) {
        int result = 0;
        int tmp = pNumber;
        while (tmp != 0) {
            result *= 10;
            result += tmp % 10;
            tmp /= 10;
        }

        return result;
    }

    private boolean isPalindrome(final int pNumber) {
        return pNumber == reverse(pNumber);
    }
}
