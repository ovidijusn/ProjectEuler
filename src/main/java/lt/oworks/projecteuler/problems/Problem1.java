package lt.oworks.projecteuler.problems;

/**
 * @author Ovidijus
 *
 * Multiples of 3 and 5
 *
 * @see http://projecteuler.net/problem=1
 */
public class Problem1 extends Problem {

    private static final int LIMIT = 1000;

    public String solve() {
        int sum = 0;
        for (int i = 3; i < LIMIT; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return Integer.toString(sum);
    }

}
