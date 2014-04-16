package lt.oworks.projecteuler.problems.pbs4;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.utils.Division;

/**
 * Distinct primes factors
 *
 * @see http://projecteuler.net/problem=47
 * @author Ovidijus
 */
public class Problem47 extends Problem {

    @Override
    public String solve() {

        boolean finded = false;
        int i = 2;

        while (!finded) {
            if (Division.findPrimeDivisors(i).length == 4) {
                if (Division.findPrimeDivisors(i + 1).length == 4) {
                    if (Division.findPrimeDivisors(i + 2).length == 4) {
                        if (Division.findPrimeDivisors(i + 3).length == 4) {
                            break;
                        } else {
                            i += 4;
                        }
                    } else {
                        i += 3;
                    }
                } else {
                    i += 2;
                }
            } else {
                i++;
            }
        }

        return "" + i;
    }

}
