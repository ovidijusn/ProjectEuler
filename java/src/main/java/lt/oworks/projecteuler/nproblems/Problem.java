package lt.oworks.projecteuler.nproblems;

/**
 *
 * @author narkeovi
 */
abstract public class Problem implements Runnable {

    private final int nr;
    private final String name;
    private String result;
    private long millis;

    public Problem(final int pNr, final String pName) {
        name = pName;
        nr = pNr;
    }

    public void solve() {
        final long start = System.currentTimeMillis();
        run();
        setMillis(System.currentTimeMillis() - start);
    }

    public int getNr() {
        return nr;
    }

    public String getName() {
        return name;
    }

    public String getResult() {
        return result;
    }

    protected void setResult(final Object result) {
        this.result = result.toString();
    }

    public long getMillis() {
        return millis;
    }

    private void setMillis(final long millis) {
        this.millis = millis;
    }

    @Override
    public String toString() {
        return getNr() + ". " + getName();
    }
}
