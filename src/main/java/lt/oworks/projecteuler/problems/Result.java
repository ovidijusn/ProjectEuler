package lt.oworks.projecteuler.problems;

/**
 *
 * @author Ovidijus
 */
public class Result {

    private long time;
    private String result;

    public Result(long time, String result) {
        this.time = time;
        this.result = result;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Problem answer: " + result + ", Solving time: " + time + "ms.";
    }

}
