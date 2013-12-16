package lt.oworks.projecteuler.problems;

/**
 * @author Ovidijus
 *
 */
public abstract class Problem {

    abstract public String solve();

    public String doSolve() {

        final long start = System.currentTimeMillis();
        final String result = solve();
        final long end = System.currentTimeMillis();
        System.out.println("------------------------------------------------");
        System.out.println("Solving time: " + (end - start) + " ms");
        System.out.println("------------------------------------------------");
        return result;
    }
}
