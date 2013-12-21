package lt.oworks.projecteuler;

import lt.oworks.projecteuler.problems.Problem;

/**
 *
 * @author Ovidijus
 */
public class SolverFactory {

    private static final String PACKAGE = "lt.oworks.projecteuler.problems.pbs";
    private static final String CLASS = "Problem";

    public static String solveProblem(final int pProblemId) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        final int pbs = pProblemId / 10;
        final String fullName = PACKAGE + pbs + "." + CLASS + pProblemId;
        Class<?> forName = Class.forName(fullName);
        Object newInstance = forName.newInstance();
        Problem problem = (Problem) newInstance;

        return problem.doSolve();
    }
}
