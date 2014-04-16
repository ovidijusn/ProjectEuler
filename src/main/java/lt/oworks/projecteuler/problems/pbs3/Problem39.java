package lt.oworks.projecteuler.problems.pbs3;

import lt.oworks.projecteuler.problems.Problem;

/**
 * Integer right triangles
 *
 * @see http://projecteuler.net/problem=39
 * @author Ovidijus
 */
public class Problem39 extends Problem {

    private static final int LIMIT = 1000;

    @Override
    public String solve() {
        int rez = 0;
        int max = 0;

        for (int p = 3; p < LIMIT; p++) {
            int counter = 0;
            for (int a = 1; a < p; a++) {
                for (int b = 1; a + b < p; b++) {
                    final int c = p - a - b;
                    if (a * a + b * b == c * c) {
                        counter++;
                    }
                }
            }
            if (max < counter) {
                max = counter;
                rez = p;
            }
        }

        return Integer.toString(rez);

    }

}
