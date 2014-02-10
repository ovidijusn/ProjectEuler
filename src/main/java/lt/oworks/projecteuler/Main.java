package lt.oworks.projecteuler;

import lt.oworks.projecteuler.nproblems.Problem;
import lt.oworks.projecteuler.nproblems.impl.Problem44;

/**
 * @author Ovidijus
 *
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Problem p = new Problem44();
        p.solve();
        System.out.println("Time: " + p.getMillis() + "ms");
        System.out.println("Result: " + p.getResult());
    }
}
