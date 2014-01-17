package lt.oworks.projecteuler.problems.pbs3;

import lt.oworks.projecteuler.problems.Problem;

/**
 * Coin sums
 *
 * @see http://projecteuler.net/problem=31
 * @author Ovidijus
 */
public class Problem31 extends Problem {

    private static final int[] COINS = {100, 50, 20, 10, 5, 2, 1};
    private long counter = 1;

    @Override
    public String solve() {
        count(200, 100);
        return Long.toString(counter);
    }

    private void count(final int pInp, final int pMax) {

        for (final int coin : COINS) {
            if (coin > pMax) {
                continue;
            }
            final int left = pInp - coin;
            if (left > 0) {
                count(left, coin);
            } else if (left == 0) {
                counter++;
            }

        }

    }

    @Override
    public String getAnswer() {
        return "73682";
    }
}
