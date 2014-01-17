package lt.oworks.projecteuler.problems.pbs0;

import lt.oworks.projecteuler.problems.Problem;

/**
 * Even Fibonacci numbers
 *
 * @see http://projecteuler.net/problem=2
 *
 * @author Ovidijus
 */
public class Problem2 extends Problem {

    private static final int LIMIT = 4_000_000;

    @Override
    public String solve() {
        int sum = 0;
        int term = 1;
        int before = 1;
        while (term < LIMIT) {
            sum += (term % 2 == 0) ? term : 0;

            term += before;
            before = term - before;
        }

        return Integer.toString(sum);
    }

    @Override
    public String getAnswer() {
        return "4613732";
    }
}
