package lt.oworks.projecteuler.problems;

/**
 * @author Ovidijus
 *
 */
public abstract class Problem {

    abstract public String solve();

    public final Result doSolve() {
        final long start = System.currentTimeMillis();
        final String result = solve();
        final long end = System.currentTimeMillis();
        return new Result(end - start, result);
    }
}
