package lt.oworks.projecteuler.problems.pbs2;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import lt.oworks.projecteuler.problems.Problem;

/**
 * Distinct powers
 *
 * @see http://projecteuler.net/problem=29
 * @author Ovidijus
 */
public class Problem29 extends Problem {

    private static final int LIMIT = 100;

    @Override
    public String solve() {
        final Set<BigDecimal> terms = new HashSet<>();
        for (int a = 2; a <= LIMIT; a++) {
            final  BigDecimal bdA = new BigDecimal(a);
            for (int b = 2; b <= LIMIT; b++) {
                terms.add(bdA.pow(b));
            }
        }
        
        return Integer.toString(terms.size());
    }

}
