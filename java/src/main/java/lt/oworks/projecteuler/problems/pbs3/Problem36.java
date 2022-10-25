package lt.oworks.projecteuler.problems.pbs3;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Digits;

/**
 * Double-base palindromes
 *
 * @see http://projecteuler.net/problem=36
 * @author Ovidijus
 */
public class Problem36 extends Problem {

    private static final long LIMIT = 1_000_000;

    @Override
    public String solve() {
        long sum = 0;

        for (int i = 1; i < LIMIT; i++) {
            if (Digits.isPalindrome(i, 10) && Digits.isPalindrome(i, 2)) {
                sum += i;

            }
        }

        return Long.toString(sum);
    }

}
