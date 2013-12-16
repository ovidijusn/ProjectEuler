package lt.oworks.projecteuler;

import lt.oworks.projecteuler.problems.Problem;

/**
 *
 * @author Ovidijus
 */
public class SolverFactory {

    private static final String PACKAGE = "lt.oworks.projecteuler.problems";
    private static final String CLASS = "Problem";

    public static String solveProblem(final String pProblemId) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        final String fullName = PACKAGE + "." + CLASS + pProblemId;
        Class<?> forName = Class.forName(fullName);
        Object newInstance = forName.newInstance();
        Problem problem = (Problem) newInstance;

        return problem.doSolve();
    }

    public static String solveProblem(final int pProblemId) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return solveProblem(Integer.toString(pProblemId));
    }
}
