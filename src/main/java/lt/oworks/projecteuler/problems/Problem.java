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

    public String getAnswer() {
        return null;
    }

    public boolean checkAnswer() {
        boolean result = true;
        String msg = this.getClass().getSimpleName() + ": ";
        if (getAnswer() == null) {
            System.err.println(msg + "not solved.");
            result = false;
        } else {
            final String answer = solve();
            if (getAnswer().equals(answer)) {
                System.out.println(msg + "solved successfuly.");
            } else {
                System.err.println(msg + "bad answer, found: " + answer + ", but correct is " + getAnswer());
                result = false;
            }
        }
        return result;
    }
}
