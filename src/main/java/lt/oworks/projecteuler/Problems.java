package lt.oworks.projecteuler;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.problems.Result;

/**
 *
 * @author Ovidijus
 */
public class Problems {

    public void solve(final Problem pProblem) {

        final Result r = pProblem.doSolve();
        System.out.println(r);

    }

}
