package lt.oworks.projecteuler.problems.pbs4;

import lt.oworks.projecteuler.problems.Problem;

/**
 * Champernowne's constant
 *
 * @see http://projecteuler.net/problem=40
 * @author Ovidijus
 */
public class Problem40 extends Problem {

    private static final int LIMIT = 1000_000;

    @Override
    public String solve() {
        final StringBuilder builder = new StringBuilder();

        for (int i = 1; builder.length() < LIMIT; i++) {
            builder.append(i);
        }

        final int d1 = Integer.parseInt(Character.toString(builder.charAt(0)));
        final int d2 = Integer.parseInt(Character.toString(builder.charAt(9)));
        final int d3 = Integer.parseInt(Character.toString(builder.charAt(99)));
        final int d4 = Integer.parseInt(Character.toString(builder.charAt(999)));
        final int d5 = Integer.parseInt(Character.toString(builder.charAt(9999)));
        final int d6 = Integer.parseInt(Character.toString(builder.charAt(99999)));
        final int d7 = Integer.parseInt(Character.toString(builder.charAt(999999)));

        return Integer.toString(d1 * d2 * d3 * d4 * d5 * d6 * d7);

    }

}
