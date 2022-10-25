package lt.oworks.projecteuler.problems.pbs2;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Division;
import lt.oworks.projecteuler.utils.Operation;

/**
 * Amicable numbers
 *
 * @see http://projecteuler.net/problem=21
 * @author Ovidijus
 */
public class Problem21 extends Problem {

    private static final long LIMIT = 10000;

    @Override
    public String solve() {
        long sum = 0;
        for (long i = 2; i < LIMIT; i++) {
            if (isAmicable(i)) {
                sum += i;
            }
        }
        return Long.toString(sum);
    }

    private boolean isAmicable(final long pNum) {
        final long[] divs = Division.findDivisors(pNum);
        final long sum = Operation.addAll(divs) - divs[divs.length - 1];
        boolean result = false;
        if (pNum != sum) {
            final long[] divs2 = Division.findDivisors(sum);
            final long sum2 = Operation.addAll(divs2) - divs2[divs2.length - 1];
            result = sum2 == pNum;
        }
        return result;
    }

}
